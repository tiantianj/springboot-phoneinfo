package com.xingjiejian.demo.springboot.phoneinfo.web;

import com.alibaba.fastjson.JSON;
import com.xingjiejian.demo.springboot.phoneinfo.entity.Information;
import com.xingjiejian.demo.springboot.phoneinfo.entity.Reply;
import com.xingjiejian.demo.springboot.phoneinfo.service.InformationService;
import com.xingjiejian.demo.springboot.phoneinfo.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 咨询相关控制器
 * @author Xing.Jiejian
 */
@Controller
@RequestMapping("/information")
public class InformationController {

    @Autowired
    private InformationService informationService;

    @Autowired
    private ReplyService replyService;


    @RequestMapping(method = RequestMethod.GET)
    public String inforPage(){
        return "infomation";
    }

    /**
     * 获取分页集合
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping(method = RequestMethod.POST,produces="application/json;charset=UTF-8")
    @ResponseBody
    public String findPage(@RequestParam(defaultValue="1") int pageNo,@RequestParam(defaultValue="1") int pageSize){

        return JSON.toJSONString(informationService.findPage(pageNo,pageSize));
    }

    /**
     * 查看资讯详情
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/{id}")
    public String showInfoDetail(@PathVariable int id, Model model){
        //获取资讯对象
        Information information = informationService.findById(id);
        //增加查看人数
        int viewCount = information.getViewCount()==null ? 1 : information.getViewCount()+1;
        information.setViewCount(viewCount);
        informationService.update(information);
        // 获取所有回帖
        List<Reply> replies = replyService.findByInfoId(information.getId());
        model.addAttribute(information);
        model.addAttribute(replies);
        return "detail";
    }
}
