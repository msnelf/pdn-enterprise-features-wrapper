package ir.pdn.enterprise.wrapper.conf.module;

import ir.pdn.enterprise.features.meeting.EnableMeetingModuleModule;
import ir.pdn.portal.core.module.EnablePortalCoreModule;
import ir.pdn.portal.mirrorasset.EnableAssetMirrorModule;
import ir.pdn.portal.security.module.EnablePortalSecurityModule;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnablePortalCoreModule
@EnablePortalSecurityModule
@EnableAssetMirrorModule
@EnableMeetingModuleModule
public class ModuleConfig
{

}
