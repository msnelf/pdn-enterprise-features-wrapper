package ir.pdn.enterprise.wrapper.conf.module;

import ir.pdn.portal.core.module.EnablePortalCoreModule;
import ir.pdn.portal.mirrorasset.EnableAssetMirrorModule;
import ir.pdn.portal.security.module.EnablePortalSecurityModule;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnablePortalCoreModule
@EnablePortalSecurityModule
@EnableAssetMirrorModule
public class ModuleConfig
{

}
