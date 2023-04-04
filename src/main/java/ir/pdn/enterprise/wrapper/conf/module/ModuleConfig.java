package ir.pdn.enterprise.wrapper.conf.module;

import ir.pdn.enterprise.features.filemanager.EnableFileManagerModule;
import ir.pdn.enterprise.features.meeting.EnableMeetingModule;
import ir.pdn.enterprise.features.survey.EnableSurveyModule;
import ir.pdn.enterprise.features.trpr.EnableTrPrModule;
import ir.pdn.portal.core.module.EnablePortalCoreModule;
import ir.pdn.portal.mirrorasset.EnableAssetMirrorModule;
import ir.pdn.portal.security.module.EnablePortalSecurityModule;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnablePortalCoreModule
@EnablePortalSecurityModule
@EnableAssetMirrorModule
@EnableSurveyModule
@EnableMeetingModule
@EnableFileManagerModule
@EnableTrPrModule
public class ModuleConfig
{

}
