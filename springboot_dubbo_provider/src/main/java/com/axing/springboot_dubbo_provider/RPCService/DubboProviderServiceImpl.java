package com.axing.springboot_dubbo_provider.RPCService;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service(interfaceClass = DubboProviderService.class)
@Component
public class DubboProviderServiceImpl implements DubboProviderService {
    @Override
    public void outputString(String s) {
        System.out.println(s);
    }
}
