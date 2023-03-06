package ir.pdn.enterprise.wrapper.conf.module;

import ir.pdn.enterprise.features.meeting.MeetingModule;
import ir.pdn.portal.mirrorasset.AssetMirrorModule;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component
public class AppMeetingModule extends MeetingModule {

    @Override
    public String schema() {
        return this.schema="pt_maintenance";
    }
}
