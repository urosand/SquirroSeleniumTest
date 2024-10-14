package mySimulation;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class startGPT extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("https://gpt-test-drive-01.squirro.cloud")
    .inferHtmlResources()
    .acceptHeader("*/*")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:131.0) Gecko/20100101 Firefox/131.0");
  
  private Map<CharSequence, String> headers_0 = Map.ofEntries(
    Map.entry("Accept", "application/json, text/javascript, */*; q=0.01"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("X-Requested-With", "XMLHttpRequest")
  );
  
  private Map<CharSequence, String> headers_10 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Origin", "https://gpt-test-drive-01.squirro.cloud"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers")
  );
  
  private Map<CharSequence, String> headers_12 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("X-Requested-With", "XMLHttpRequest")
  );
  
  private Map<CharSequence, String> headers_13 = Map.ofEntries(
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("X-Requested-With", "XMLHttpRequest")
  );
  
  private Map<CharSequence, String> headers_18 = Map.ofEntries(
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers")
  );
  
  private Map<CharSequence, String> headers_27 = Map.ofEntries(
    Map.entry("Accept", "application/json, text/javascript, */*; q=0.01"),
    Map.entry("Priority", "u=0"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("X-Requested-With", "XMLHttpRequest")
  );
  
  private Map<CharSequence, String> headers_29 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Origin", "https://gpt-test-drive-01.squirro.cloud"),
    Map.entry("Priority", "u=0"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers")
  );


  private ScenarioBuilder scn = scenario("startGPT")
    .exec(
      http("request_0")
        .get("/v0/users/mSSJpGBpSom5y_qXoJlVqQ")
        .headers(headers_0)
        .resources(
          http("request_1")
            .get("/v0/projects")
            .headers(headers_0),
          http("request_2")
            .get("/v0/projects/OYbytWCPSOGWSRE4F0W4-w/dashboard")
            .headers(headers_0),
          http("request_3")
            .get("/v0/projects/OYbytWCPSOGWSRE4F0W4-w")
            .headers(headers_0),
          http("request_4")
            .get("/v0/projects/OYbytWCPSOGWSRE4F0W4-w/project_translations?language=en")
            .headers(headers_0),
          http("request_5")
            .get("/v0/projects/OYbytWCPSOGWSRE4F0W4-w/dashboard/3AdWOmM0R1q8S-JKljVTQA")
            .headers(headers_0),
          http("request_6")
            .get("/v0/assets/widget")
            .headers(headers_0),
          http("request_7")
            .get("/v0/assets/dashboard_loader")
            .headers(headers_0),
          http("request_8")
            .get("/v0/projects/OYbytWCPSOGWSRE4F0W4-w/community_subscriptions?count=15")
            .headers(headers_0),
          http("request_9")
            .get("/v0/projects/OYbytWCPSOGWSRE4F0W4-w/community_types")
            .headers(headers_0),
          http("request_10")
            .post("/activity")
            .headers(headers_10)
            .body(RawFileBody("mySimulation/startgpt/0010_request.bin")),
          http("request_11")
            .get("/v0/facets?project_id=OYbytWCPSOGWSRE4F0W4-w")
            .headers(headers_0),
          http("request_12")
            .get("/studio/genai_proxy/projects/OYbytWCPSOGWSRE4F0W4-w/chat_history")
            .headers(headers_12),
          http("request_13")
            .get("/studio/genai_proxy/projects/OYbytWCPSOGWSRE4F0W4-w/assistant-settings")
            .headers(headers_13),
          http("request_14")
            .get("/studio/genai_proxy/projects/OYbytWCPSOGWSRE4F0W4-w/license")
            .headers(headers_13),
          http("request_15")
            .get("/studio/genai_proxy/projects/OYbytWCPSOGWSRE4F0W4-w/chat-preferences")
            .headers(headers_13),
          http("request_16")
            .get("/v0/items/query?count=0&query=&project_id=OYbytWCPSOGWSRE4F0W4-w")
            .headers(headers_13),
          http("request_17")
            .get("/v0/projects/OYbytWCPSOGWSRE4F0W4-w/sources?count=1000&counts_agg=plugin_name%2Cstatus&include=config%2Crun_stats%2Cpipeline_backlog%2Citems_indexed&start=0")
            .headers(headers_12),
          http("request_18")
            .get("/studio/genai_proxy/projects/OYbytWCPSOGWSRE4F0W4-w/embed_token")
            .headers(headers_18),
          http("request_19")
            .get("/studio/genai_proxy/projects/OYbytWCPSOGWSRE4F0W4-w/starter-questions?query_context={%22dashboard_filters%22:%22%22,%22searchbar_query%22:%22%22}")
            .headers(headers_18),
          http("request_20")
            .get("/studio/genai_proxy/projects/OYbytWCPSOGWSRE4F0W4-w/license")
            .headers(headers_13),
          http("request_21")
            .get("/v0/projects/OYbytWCPSOGWSRE4F0W4-w/collections?query=&project_id=OYbytWCPSOGWSRE4F0W4-w")
            .headers(headers_0),
          http("request_22")
            .get("/v0/projects/OYbytWCPSOGWSRE4F0W4-w/savedsearches")
            .headers(headers_0),
          http("request_23")
            .get("/v0/items/query?count=0&query=&project_id=OYbytWCPSOGWSRE4F0W4-w")
            .headers(headers_13),
          http("request_24")
            .get("/v0/projects/OYbytWCPSOGWSRE4F0W4-w/sources?count=1000&counts_agg=plugin_name%2Cstatus&include=config%2Crun_stats%2Cpipeline_backlog%2Citems_indexed&start=0")
            .headers(headers_12)
        )
    )
    .pause(4)
    .exec(
      http("request_25")
        .get("/studio/genai_proxy/projects/OYbytWCPSOGWSRE4F0W4-w/license")
        .headers(headers_13)
    )
    .pause(4)
    .exec(
      http("request_26")
        .get("/studio/genai_proxy/projects/OYbytWCPSOGWSRE4F0W4-w/license")
        .headers(headers_13)
    )
    .pause(1)
    .exec(
      http("request_27")
        .get("/v0/projects/OYbytWCPSOGWSRE4F0W4-w/collections?query=&project_id=OYbytWCPSOGWSRE4F0W4-w")
        .headers(headers_27)
        .resources(
          http("request_28")
            .get("/v0/projects/OYbytWCPSOGWSRE4F0W4-w/savedsearches")
            .headers(headers_27),
          http("request_29")
            .post("/studio/genai_proxy/projects/OYbytWCPSOGWSRE4F0W4-w/streaming_chat")
            .headers(headers_29)
            .body(RawFileBody("mySimulation/startgpt/0029_request.dat"))
        )
    )
    .pause(3)
    .exec(
      http("request_30")
        .get("/studio/genai_proxy/projects/OYbytWCPSOGWSRE4F0W4-w/license")
        .headers(headers_13)
    )
    .pause(1)
    .exec(
      http("request_31")
        .post("/activity")
        .headers(headers_10)
        .body(RawFileBody("mySimulation/startgpt/0031_request.bin"))
    )
    .pause(3)
    .exec(
      http("request_32")
        .get("/studio/genai_proxy/projects/OYbytWCPSOGWSRE4F0W4-w/license")
        .headers(headers_13)
        .resources(
          http("request_33")
            .get("/studio/genai_proxy/projects/OYbytWCPSOGWSRE4F0W4-w/license")
            .headers(headers_13)
        )
    );

  {
	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
