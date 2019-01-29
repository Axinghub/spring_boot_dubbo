package com.axing.springboot_dubbo_consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.axing.springboot_dubbo_provider.RPCService.DubboProviderService;
import com.gkoudai.finance.service.RequestFrequencyOperationService;
import org.springframework.stereotype.Component;

@Component
public class DubboConsumerServiceImpl {

    @Reference
    RequestFrequencyOperationService requestFrequencyOperationService;

    public void print(){
        System.out.println(requestFrequencyOperationService.queryPhoneLimitStatus("15380825803"));
    }




//    @Reference()
//    private DubboProviderService dubboProviderService;
//
//    public void print(){
//        dubboProviderService.outputString("666555777");
//    }

}
