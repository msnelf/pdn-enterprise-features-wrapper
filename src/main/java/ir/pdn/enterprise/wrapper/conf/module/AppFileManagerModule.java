package ir.pdn.enterprise.wrapper.conf.module;

import ir.pdn.enterprise.features.filemanager.FileManagerModule;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component
public class AppFileManagerModule extends FileManagerModule {

    @Override
    public String schema() {
        return this.schema="pt_filemanagement";
    }
}
