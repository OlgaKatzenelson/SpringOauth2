package oauth.client.config;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import oauth.client.OauthService;

@Component
public class WochitOauthMethodInterceptor implements MethodInterceptor {
    @Autowired
    private OauthService oauthService;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        oauthService.getUserName();
        return invocation.proceed();
    }

}
