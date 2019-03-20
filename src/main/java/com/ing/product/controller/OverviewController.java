package com.ing.product.controller;

import com.ing.product.model.OverviewCount;
import com.ing.product.repository.OverviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class OverviewController {


    @Autowired
    private OverviewRepository overviewRepos;

    @PutMapping("/updateOverview/{overviewId}")
    public Long getOverviewCounts(@PathVariable("overviewId") Long overviewId){
        Optional<OverviewCount> overview = overviewRepos.findById(overviewId);
        Optional<OverviewCount> updateOverviewCount=null;
        if(overview.isPresent()) {
            OverviewCount overviewCount = overview.get();
            overviewCount.setCount(overviewCount.getCount() + 1);
            overviewRepos.save(overviewCount);
        }else {
            OverviewCount overviewCount = new OverviewCount();
            overviewCount.setCount(1l);
            overviewRepos.save(overviewCount);
        }
        updateOverviewCount = overviewRepos.findById(overviewId);
        return updateOverviewCount.get().getCount();
    }


}
