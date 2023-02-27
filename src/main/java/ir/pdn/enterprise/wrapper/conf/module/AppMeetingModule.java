package ir.pdn.enterprise.wrapper.conf.module;

import ir.pdn.enterprise.features.meeting.MeetingModule;
import ir.pdn.portal.mirrorasset.AssetMirrorModule;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@Primary
public class AppMeetingModule extends MeetingModule {

    @Override
    public String schema() {
        return "pt_maintenance";
    }
}
