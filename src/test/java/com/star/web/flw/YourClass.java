package com.star.web.flw;

import com.star.web.admin.pojo.po.SysUser;
import com.yomahub.liteflow.builder.el.LiteFlowChainELBuilder;
import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class YourClass {

    @Resource
    private FlowExecutor flowExecutor;

    @Test
    public void testConfig() {
        LiteFlowChainELBuilder.createChain().setChainId("chainId123").setEL("THEN(a,b,c)").build();
        LiteflowResponse response = flowExecutor.execute2Resp("chainId123", "arg");
        // LiteflowResponse response1 = flowExecutor.execute2Resp("chain1", "arg");
    }
}
