package mySimulation;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class SelectApplicationPage extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("https://start.squirro.com")
    .inferHtmlResources()
    .acceptHeader("*/*")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:131.0) Gecko/20100101 Firefox/131.0");
  
  private Map<CharSequence, String> headers_0 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/png,image/svg+xml,*/*;q=0.8"),
    Map.entry("If-None-Match", "rxyydp584g39u4"),
    Map.entry("Priority", "u=0, i"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("TE", "trailers"),
    Map.entry("Upgrade-Insecure-Requests", "1")
  );
  
  private Map<CharSequence, String> headers_1 = Map.of("Accept", "image/avif,image/webp,image/png,image/svg+xml,image/*;q=0.8,*/*;q=0.5");
  
  private Map<CharSequence, String> headers_8 = Map.ofEntries(
    Map.entry("Sec-Fetch-Dest", "script"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin")
  );
  
  private Map<CharSequence, String> headers_34 = Map.ofEntries(
    Map.entry("Accept", "image/avif,image/webp,image/png,image/svg+xml,image/*;q=0.8,*/*;q=0.5"),
    Map.entry("Sec-Fetch-Dest", "image"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin")
  );
  
  private Map<CharSequence, String> headers_35 = Map.ofEntries(
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Purpose", "prefetch")
  );
  
  private Map<CharSequence, String> headers_41 = Map.ofEntries(
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers")
  );
  
  private Map<CharSequence, String> headers_49 = Map.ofEntries(
    Map.entry("If-None-Match", "enpz1r4x9q7d6"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_50 = Map.ofEntries(
    Map.entry("If-None-Match", "5ujkzhb6gh5od"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_54 = Map.ofEntries(
    Map.entry("If-None-Match", "a1r73obpet46e"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_55 = Map.ofEntries(
    Map.entry("If-None-Match", "aays28qmt360"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_56 = Map.ofEntries(
    Map.entry("If-None-Match", "1541swq8wjv4mv"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_57 = Map.ofEntries(
    Map.entry("If-None-Match", "100o304fnjz4dp"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_58 = Map.ofEntries(
    Map.entry("If-None-Match", "13ygqqokyrl2la"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_59 = Map.ofEntries(
    Map.entry("If-None-Match", "z0d9th2m5c4lt"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_60 = Map.ofEntries(
    Map.entry("If-None-Match", "14xcrykjfvb48n"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private String uri1 = "https://d25x7cjvmh9owh.cloudfront.net";

  private ScenarioBuilder scn = scenario("SelectApplicationPage")
    .exec(
      http("request_0")
        .get("/setup/app")
        .headers(headers_0)
        .resources(
          http("request_1")
            .get(uri1 + "/Variant_GPT_Data_ff61269fa2.jpg")
            .headers(headers_1),
          http("request_2")
            .get(uri1 + "/Mixtral_4_de4a94b22c.jpg")
            .headers(headers_1),
          http("request_3")
            .get(uri1 + "/Variant_Cognitive_Search_15584c2bfb.jpg")
            .headers(headers_1),
          http("request_4")
            .get(uri1 + "/Variant_Sales_Insights_b1fe39115d.jpg")
            .headers(headers_1),
          http("request_5")
            .get(uri1 + "/Variant_BEM_95f5550186.jpg")
            .headers(headers_1),
          http("request_6")
            .get(uri1 + "/Variant_CS_Food_Safety_64fdaf6cfa.jpg")
            .headers(headers_1),
          http("request_7")
            .get(uri1 + "/Variant_App_Studio_1421ecec4e.jpg")
            .headers(headers_1),
          http("request_8")
            .get("/_next/static/chunks/webpack-9bcf06457bbdc641.js")
            .headers(headers_8),
          http("request_9")
            .get(uri1 + "/Variant_Academy_Trainees_8307a784a0.jpg")
            .headers(headers_1),
          http("request_10")
            .get(uri1 + "/Variant_AI_Newsreader_168db85dab.jpg")
            .headers(headers_1),
          http("request_11")
            .get(uri1 + "/Variant_Allocators_Insight_cbd300af38.jpg")
            .headers(headers_1),
          http("request_12")
            .get(uri1 + "/Variant_CS_Asset_Management_7257b24c7c.jpg")
            .headers(headers_1),
          http("request_13")
            .get(uri1 + "/Variant_CS_Aviation_News_5c647a4eb1.jpg")
            .headers(headers_1),
          http("request_14")
            .get("/_next/static/chunks/framework-bde023a27d1a49cb.js")
            .headers(headers_8),
          http("request_15")
            .get(uri1 + "/Variant_Insights_Cockpit_KPI_SLA_Tracking_ea02946f9a.jpg")
            .headers(headers_1),
          http("request_16")
            .get(uri1 + "/Variant_CS_Pharma_News_f2b2577ab7.jpg")
            .headers(headers_1),
          http("request_17")
            .get("/_next/static/chunks/main-81087524f00c7d6f.js")
            .headers(headers_8),
          http("request_18")
            .get("/_next/static/chunks/pages/_app-7a5f4d494b41560d.js")
            .headers(headers_8),
          http("request_19")
            .get("/_next/static/chunks/ebaf4c27-c689a865874b5135.js")
            .headers(headers_8),
          http("request_20")
            .get("/_next/static/chunks/6389-091833ed2dab1e86.js")
            .headers(headers_8),
          http("request_21")
            .get("/_next/static/chunks/1596-4adf9fcfd382b2e9.js")
            .headers(headers_8),
          http("request_22")
            .get("/_next/static/chunks/5675-9c73595588dbd447.js")
            .headers(headers_8),
          http("request_23")
            .get("/_next/static/chunks/5181-d4aeabb64460ca79.js")
            .headers(headers_8),
          http("request_24")
            .get("/_next/static/chunks/8984-11ccdc3747bd2bd7.js")
            .headers(headers_8),
          http("request_25")
            .get("/_next/static/chunks/8723-4bf763b22240a876.js")
            .headers(headers_8),
          http("request_26")
            .get("/_next/static/chunks/676-32de25b5c1f0865f.js")
            .headers(headers_8),
          http("request_27")
            .get("/_next/static/chunks/1173-441ebab7d0d38d74.js")
            .headers(headers_8),
          http("request_28")
            .get("/_next/static/chunks/4908-367465c58a1e5e1c.js")
            .headers(headers_8),
          http("request_29")
            .get("/_next/static/chunks/8839-5be17179b1891b1c.js")
            .headers(headers_8),
          http("request_30")
            .get("/_next/static/chunks/5850-25e0b386049ae8ed.js")
            .headers(headers_8),
          http("request_31")
            .get("/_next/static/chunks/pages/setup/app-9d60fdd6585a7040.js")
            .headers(headers_8),
          http("request_32")
            .get("/_next/static/DdNsNMpmmR0yxKBrMut_C/_buildManifest.js")
            .headers(headers_8),
          http("request_33")
            .get("/_next/static/DdNsNMpmmR0yxKBrMut_C/_ssgManifest.js")
            .headers(headers_8),
          http("request_34")
            .get("/favicon.ico")
            .headers(headers_34)
            .check(status().is(404)),
          http("request_35")
            .get("/_next/static/chunks/126-0af6e7c197b09d4c.js")
            .headers(headers_35),
          http("request_36")
            .get("/_next/static/chunks/5681-63d416d6c4522a3d.js")
            .headers(headers_35),
          http("request_37")
            .get("/_next/static/chunks/3426-4aea5c11af255720.js")
            .headers(headers_35),
          http("request_38")
            .get("/_next/static/chunks/9164-18a11905b266c4e2.js")
            .headers(headers_35),
          http("request_39")
            .get("/_next/static/chunks/8307-a575f70dc2435148.js")
            .headers(headers_35),
          http("request_40")
            .get("/_next/static/chunks/2447-8ac3a66282976602.js")
            .headers(headers_35),
          http("request_41")
            .get("/api/instances?admin=false&canConnect=false&canInstall=null&stateFilter=null")
            .headers(headers_41)
            .check(status().is(401)),
          http("request_42")
            .get("/_next/static/chunks/pages/admin/instances-037e6c0cb1e1c350.js")
            .headers(headers_35),
          http("request_43")
            .get("/_next/static/chunks/pages/setup/app/%5Bapp%5D-13e04c28193de194.js")
            .headers(headers_35),
          http("request_44")
            .get("/_next/static/chunks/pages/setup/app/%5Bapp%5D-13e04c28193de194.js")
            .headers(headers_8),
          http("request_45")
            .get("/_next/static/chunks/126-0af6e7c197b09d4c.js")
            .headers(headers_8),
          http("request_46")
            .get("/_next/static/chunks/5681-63d416d6c4522a3d.js")
            .headers(headers_8),
          http("request_47")
            .get("/_next/static/chunks/3426-4aea5c11af255720.js")
            .headers(headers_8),
          http("request_48")
            .get("/_next/static/chunks/9164-18a11905b266c4e2.js")
            .headers(headers_8),
          http("request_49")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/genai-application.json?app=genai-application")
            .headers(headers_49),
          http("request_50")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/genai-application-web.json?app=genai-application-web")
            .headers(headers_50),
          http("request_51")
            .get("/_next/static/chunks/8307-a575f70dc2435148.js")
            .headers(headers_8),
          http("request_52")
            .get("/_next/static/chunks/2447-8ac3a66282976602.js")
            .headers(headers_8),
          http("request_53")
            .get("/_next/static/chunks/pages/admin/instances-037e6c0cb1e1c350.js")
            .headers(headers_8),
          http("request_54")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/cognitive_search.json?app=cognitive_search")
            .headers(headers_54),
          http("request_55")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/sales_insight.json?app=sales_insight")
            .headers(headers_55),
          http("request_56")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/business_environment_monitoring.json?app=business_environment_monitoring")
            .headers(headers_56),
          http("request_57")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/cognitive_search_demo_data.json?app=cognitive_search_demo_data")
            .headers(headers_57),
          http("request_58")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/app_studio.json?app=app_studio")
            .headers(headers_58),
          http("request_59")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/cognitive_search_academy.json?app=cognitive_search_academy")
            .headers(headers_59),
          http("request_60")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/ai_reader.json?app=ai_reader")
            .headers(headers_60),
          http("request_61")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/sales_insight.json?app=sales_insight")
            .headers(headers_55)
        )
    );

  {
    // Set up the simulation
    setUp(
            scn.injectOpen(rampUsers(5).during(Duration.ofMinutes(1)))
    )
            .maxDuration(Duration.ofMinutes(1))
            .protocols(httpProtocol);
  }
  }

