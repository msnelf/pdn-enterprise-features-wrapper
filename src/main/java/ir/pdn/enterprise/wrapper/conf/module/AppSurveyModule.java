package ir.pdn.enterprise.wrapper.conf.module;

import ir.pdn.enterprise.features.survey.SurveyModule;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component
public class AppSurveyModule extends SurveyModule {

    @Override
    public String schema() {
        return this.schema="pt_maintenance";
    }
}
