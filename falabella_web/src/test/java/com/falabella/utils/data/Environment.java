package com.falabella.utils.data;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:prod.properties"})

public interface Environment extends Config {

    String falabellaClient();
}
