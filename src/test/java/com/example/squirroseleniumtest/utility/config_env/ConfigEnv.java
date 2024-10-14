package com.example.squirroseleniumtest.utility.config_env;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:src/test/resources/.env"}
)
public interface ConfigEnv extends Config {

    ConfigEnv config = ConfigFactory.create(ConfigEnv.class);

    @Config.Key("BASEURL")
    String baseURL();

    @Config.Key("USER_NAME")
    String userName();


    @Config.Key("PASSWORD")
    String password();



}

