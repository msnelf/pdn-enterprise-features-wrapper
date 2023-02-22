package ir.pdn.enterprise.wrapper;

import ir.pdn.portal.core.module.EnablePortalCoreModule;
import ir.pdn.portal.security.module.EnablePortalSecurityModule;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnablePortalCoreModule
@EnablePortalSecurityModule
public class ModuleConfig
{
}
