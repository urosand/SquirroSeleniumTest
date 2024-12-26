package mySimulation;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class CognitiveSearcPage extends Simulation {

  // test uros
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
  
  private Map<CharSequence, String> headers_1 = Map.ofEntries(
    Map.entry("Sec-Fetch-Dest", "script"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin")
  );
  
  private Map<CharSequence, String> headers_20 = Map.ofEntries(
    Map.entry("Accept", "image/avif,image/webp,image/png,image/svg+xml,image/*;q=0.8,*/*;q=0.5"),
    Map.entry("Sec-Fetch-Dest", "image"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin")
  );
  
  private Map<CharSequence, String> headers_21 = Map.ofEntries(
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Purpose", "prefetch")
  );
  
  private Map<CharSequence, String> headers_27 = Map.ofEntries(
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers")
  );
  
  private Map<CharSequence, String> headers_35 = Map.ofEntries(
    Map.entry("If-None-Match", "enpz1r4x9q7d6"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_36 = Map.ofEntries(
    Map.entry("If-None-Match", "5ujkzhb6gh5od"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_40 = Map.ofEntries(
    Map.entry("If-None-Match", "a1r73obpet46e"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_41 = Map.ofEntries(
    Map.entry("If-None-Match", "aays28qmt360"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_42 = Map.ofEntries(
    Map.entry("If-None-Match", "1541swq8wjv4mv"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_43 = Map.ofEntries(
    Map.entry("If-None-Match", "100o304fnjz4dp"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_44 = Map.ofEntries(
    Map.entry("If-None-Match", "13ygqqokyrl2la"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_45 = Map.ofEntries(
    Map.entry("If-None-Match", "z0d9th2m5c4lt"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_46 = Map.ofEntries(
    Map.entry("If-None-Match", "14xcrykjfvb48n"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_57 = Map.ofEntries(
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_62 = Map.ofEntries(
    Map.entry("If-None-Match", "ho8u3a31qd2r0"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_63 = Map.ofEntries(
    Map.entry("If-None-Match", "bnh6zj94ph4oc"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_71 = Map.ofEntries(
    Map.entry("If-None-Match", "5ujkzhb6gh5od"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_72 = Map.ofEntries(
    Map.entry("If-None-Match", "1541swq8wjv4mv"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_75 = Map.ofEntries(
    Map.entry("Priority", "u=0"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_76 = Map.ofEntries(
    Map.entry("If-None-Match", "1mp6udofmg1o3e"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("purpose", "prefetch"),
    Map.entry("x-nextjs-data", "1")
  );
  
  private Map<CharSequence, String> headers_77 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/png,image/svg+xml,*/*;q=0.8"),
    Map.entry("Alt-Used", "www.youtube-nocookie.com"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "iframe"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("TE", "trailers"),
    Map.entry("Upgrade-Insecure-Requests", "1")
  );
  
  private Map<CharSequence, String> headers_83 = Map.ofEntries(
    Map.entry("Alt-Used", "www.youtube-nocookie.com"),
    Map.entry("Sec-Fetch-Dest", "script"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin")
  );
  
  private Map<CharSequence, String> headers_91 = Map.ofEntries(
    Map.entry("Accept", "image/avif,image/webp,image/png,image/svg+xml,image/*;q=0.8,*/*;q=0.5"),
    Map.entry("Priority", "u=5, i"),
    Map.entry("Sec-Fetch-Dest", "image"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "cross-site")
  );
  
  private Map<CharSequence, String> headers_92 = Map.ofEntries(
    Map.entry("Sec-Fetch-Dest", "script"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "cross-site")
  );
  
  private Map<CharSequence, String> headers_95 = Map.ofEntries(
    Map.entry("Accept", "image/avif,image/webp,image/png,image/svg+xml,image/*;q=0.8,*/*;q=0.5"),
    Map.entry("Alt-Used", "www.youtube-nocookie.com"),
    Map.entry("Priority", "u=5, i"),
    Map.entry("Sec-Fetch-Dest", "image"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers")
  );
  
  private Map<CharSequence, String> headers_96 = Map.ofEntries(
    Map.entry("Accept", "image/avif,image/webp,image/png,image/svg+xml,image/*;q=0.8,*/*;q=0.5"),
    Map.entry("Alt-Used", "i.ytimg.com"),
    Map.entry("Priority", "u=4, i"),
    Map.entry("Sec-Fetch-Dest", "image"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("TE", "trailers")
  );
  
  private Map<CharSequence, String> headers_98 = Map.ofEntries(
    Map.entry("Accept", "image/avif,image/webp,image/png,image/svg+xml,image/*;q=0.8,*/*;q=0.5"),
    Map.entry("Alt-Used", "i.ytimg.com"),
    Map.entry("Priority", "u=4, i"),
    Map.entry("Sec-Fetch-Dest", "image"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "cross-site")
  );
  
  private Map<CharSequence, String> headers_99 = Map.ofEntries(
    Map.entry("Content-Type", "application/json+protobuf"),
    Map.entry("Origin", "https://www.youtube-nocookie.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("X-Goog-Api-Key", "AIzaSyDyT5W0Jh49F30Pqqtyfdf7pDLFKLJoAnw"),
    Map.entry("X-User-Agent", "grpc-web-javascript/0.1")
  );
  
  private Map<CharSequence, String> headers_100 = Map.ofEntries(
    Map.entry("Alt-Used", "play.google.com"),
    Map.entry("Content-Type", "application/x-www-form-urlencoded;charset=utf-8"),
    Map.entry("Origin", "https://www.youtube-nocookie.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("TE", "trailers"),
    Map.entry("X-Goog-AuthUser", "0")
  );
  
  private Map<CharSequence, String> headers_102 = Map.ofEntries(
    Map.entry("Alt-Used", "play.google.com"),
    Map.entry("Content-Type", "application/x-www-form-urlencoded;charset=utf-8"),
    Map.entry("Origin", "https://www.youtube-nocookie.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("X-Goog-AuthUser", "0")
  );
  
  private Map<CharSequence, String> headers_103 = Map.ofEntries(
    Map.entry("Content-Type", "application/json+protobuf"),
    Map.entry("Origin", "https://www.youtube-nocookie.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("TE", "trailers"),
    Map.entry("X-Goog-Api-Key", "AIzaSyDyT5W0Jh49F30Pqqtyfdf7pDLFKLJoAnw"),
    Map.entry("X-User-Agent", "grpc-web-javascript/0.1")
  );
  
  private Map<CharSequence, String> headers_109 = Map.ofEntries(
    Map.entry("Alt-Used", "www.youtube-nocookie.com"),
    Map.entry("Content-Type", "application/json"),
    Map.entry("Origin", "https://www.youtube-nocookie.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("X-Goog-Request-Time", "1728665429675"),
    Map.entry("X-Goog-Visitor-Id", "CgtxMWF3WEdTRG16WSjSrqW4BjIKCgJSUxIEGgAgTQ%3D%3D"),
    Map.entry("X-YouTube-Ad-Signals", "dt=1728665427255&flash=0&frm=2&u_tz=120&u_his=3&u_h=1080&u_w=1920&u_ah=1036&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C0%2C0%2C0%2C1920%2C0%2C1920%2C1036%2C440%2C246&vis=1&wgl=true&ca_type=image"),
    Map.entry("X-YouTube-Client-Name", "56"),
    Map.entry("X-YouTube-Client-Version", "1.20241008.01.00"),
    Map.entry("X-YouTube-Time-Zone", "Europe/Belgrade"),
    Map.entry("X-YouTube-Utc-Offset", "120")
  );
  
  private Map<CharSequence, String> headers_110 = Map.ofEntries(
    Map.entry("Alt-Used", "www.youtube-nocookie.com"),
    Map.entry("Content-Type", "application/json"),
    Map.entry("Origin", "https://www.youtube-nocookie.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("X-Goog-Request-Time", "1728665430132"),
    Map.entry("X-Goog-Visitor-Id", "CgtTWm1tRjRlYlNQSSjSrqW4BjIKCgJSUxIEGgAgUg%3D%3D"),
    Map.entry("X-YouTube-Ad-Signals", "dt=1728665427244&flash=0&frm=2&u_tz=120&u_his=3&u_h=1080&u_w=1920&u_ah=1036&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C0%2C0%2C0%2C1920%2C0%2C0%2C0%2C0%2C0&vis=1&wgl=true&ca_type=image"),
    Map.entry("X-YouTube-Client-Name", "56"),
    Map.entry("X-YouTube-Client-Version", "1.20241008.01.00"),
    Map.entry("X-YouTube-Time-Zone", "Europe/Belgrade"),
    Map.entry("X-YouTube-Utc-Offset", "120")
  );
  
  private Map<CharSequence, String> headers_111 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Origin", "https://www.youtube-nocookie.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("X-Goog-Request-Time", "1728665438877"),
    Map.entry("X-Goog-Visitor-Id", "CgtTWm1tRjRlYlNQSSjSrqW4BjIKCgJSUxIEGgAgUg%3D%3D"),
    Map.entry("X-YouTube-Ad-Signals", "dt=1728665427244&flash=0&frm=2&u_tz=120&u_his=1&u_h=1080&u_w=1920&u_ah=1036&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C0%2C0%2C0%2C1920%2C0%2C0%2C0%2C0%2C0&vis=1&wgl=true&ca_type=image"),
    Map.entry("X-YouTube-Client-Name", "56"),
    Map.entry("X-YouTube-Client-Version", "1.20241008.01.00"),
    Map.entry("X-YouTube-Time-Zone", "Europe/Belgrade"),
    Map.entry("X-YouTube-Utc-Offset", "120")
  );
  
  private Map<CharSequence, String> headers_112 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/png,image/svg+xml,*/*;q=0.8"),
    Map.entry("Priority", "u=0, i"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1")
  );
  
  private Map<CharSequence, String> headers_113 = Map.ofEntries(
    Map.entry("Sec-Fetch-Dest", "script"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers")
  );
  
  private Map<CharSequence, String> headers_134 = Map.ofEntries(
    Map.entry("Accept", "image/avif,image/webp,image/png,image/svg+xml,image/*;q=0.8,*/*;q=0.5"),
    Map.entry("Priority", "u=4, i"),
    Map.entry("Sec-Fetch-Dest", "image"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers")
  );
  
  private Map<CharSequence, String> headers_135 = Map.ofEntries(
    Map.entry("Accept", "image/avif,image/webp,image/png,image/svg+xml,image/*;q=0.8,*/*;q=0.5"),
    Map.entry("Priority", "u=4, i"),
    Map.entry("Sec-Fetch-Dest", "image"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "cross-site")
  );
  
  private Map<CharSequence, String> headers_136 = Map.ofEntries(
    Map.entry("Accept", "text/css,*/*;q=0.1"),
    Map.entry("Alt-Used", "www.youtube-nocookie.com"),
    Map.entry("Priority", "u=2"),
    Map.entry("Sec-Fetch-Dest", "style"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers")
  );
  
  private Map<CharSequence, String> headers_137 = Map.ofEntries(
    Map.entry("Alt-Used", "www.youtube-nocookie.com"),
    Map.entry("Priority", "u=1"),
    Map.entry("Sec-Fetch-Dest", "script"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers")
  );
  
  private Map<CharSequence, String> headers_139 = Map.ofEntries(
    Map.entry("Accept", "image/avif,image/webp,image/png,image/svg+xml,image/*;q=0.8,*/*;q=0.5"),
    Map.entry("Priority", "u=6"),
    Map.entry("Sec-Fetch-Dest", "image"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers")
  );
  
  private Map<CharSequence, String> headers_140 = Map.ofEntries(
    Map.entry("Accept", "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8"),
    Map.entry("Accept-Encoding", "identity"),
    Map.entry("Origin", "https://www.youtube-nocookie.com"),
    Map.entry("Sec-Fetch-Dest", "font"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "cross-site")
  );
  
  private Map<CharSequence, String> headers_141 = Map.ofEntries(
    Map.entry("Alt-Used", "www.youtube-nocookie.com"),
    Map.entry("Sec-Fetch-Dest", "script"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers")
  );
  
  private Map<CharSequence, String> headers_148 = Map.ofEntries(
    Map.entry("Priority", "u=6"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Purpose", "prefetch"),
    Map.entry("TE", "trailers")
  );
  
  private Map<CharSequence, String> headers_172 = Map.ofEntries(
    Map.entry("Access-Control-Request-Headers", "content-type,x-goog-api-key,x-user-agent"),
    Map.entry("Access-Control-Request-Method", "POST"),
    Map.entry("Origin", "https://www.youtube-nocookie.com"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "cross-site")
  );
  
  private Map<CharSequence, String> headers_183 = Map.ofEntries(
    Map.entry("Content-Type", "application/x-www-form-urlencoded;charset=utf-8"),
    Map.entry("Origin", "https://www.youtube-nocookie.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("TE", "trailers"),
    Map.entry("X-Goog-AuthUser", "0")
  );
  
  private Map<CharSequence, String> headers_186 = Map.ofEntries(
    Map.entry("Access-Control-Request-Headers", "content-type,x-goog-api-key,x-user-agent"),
    Map.entry("Access-Control-Request-Method", "POST"),
    Map.entry("Origin", "https://www.youtube-nocookie.com"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("TE", "trailers")
  );
  
  private Map<CharSequence, String> headers_189 = Map.ofEntries(
    Map.entry("Access-Control-Request-Headers", "x-goog-authuser"),
    Map.entry("Access-Control-Request-Method", "POST"),
    Map.entry("Origin", "https://www.youtube-nocookie.com"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "cross-site")
  );
  
  private Map<CharSequence, String> headers_192 = Map.ofEntries(
    Map.entry("Access-Control-Request-Headers", "x-goog-authuser"),
    Map.entry("Access-Control-Request-Method", "POST"),
    Map.entry("Origin", "https://www.youtube-nocookie.com"),
    Map.entry("Priority", "u=4"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("TE", "trailers")
  );
  
  private Map<CharSequence, String> headers_200 = Map.ofEntries(
    Map.entry("Alt-Used", "www.youtube-nocookie.com"),
    Map.entry("Content-Type", "application/json"),
    Map.entry("Origin", "https://www.youtube-nocookie.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("X-Goog-Request-Time", "1728665443161"),
    Map.entry("X-Goog-Visitor-Id", "CgstdW8yN3pZQzFoQSjfrqW4BjIKCgJSUxIEGgAgZw%3D%3D"),
    Map.entry("X-YouTube-Ad-Signals", "dt=1728665440217&flash=0&frm=2&u_tz=120&u_his=1&u_h=1080&u_w=1920&u_ah=1036&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C0%2C0%2C0%2C1920%2C0%2C1920%2C1036%2C440%2C246&vis=1&wgl=true&ca_type=image"),
    Map.entry("X-YouTube-Client-Name", "56"),
    Map.entry("X-YouTube-Client-Version", "1.20241008.01.00"),
    Map.entry("X-YouTube-Time-Zone", "Europe/Belgrade"),
    Map.entry("X-YouTube-Utc-Offset", "120")
  );
  
  private Map<CharSequence, String> headers_201 = Map.ofEntries(
    Map.entry("Alt-Used", "www.youtube-nocookie.com"),
    Map.entry("Content-Type", "application/json"),
    Map.entry("Origin", "https://www.youtube-nocookie.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers"),
    Map.entry("X-Goog-Request-Time", "1728665443149"),
    Map.entry("X-Goog-Visitor-Id", "CgtQV3pWWWZxZHhDdyjfrqW4BjIKCgJSUxIEGgAgKQ%3D%3D"),
    Map.entry("X-YouTube-Ad-Signals", "dt=1728665440268&flash=0&frm=2&u_tz=120&u_his=1&u_h=1080&u_w=1920&u_ah=1036&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C0%2C0%2C0%2C1920%2C0%2C1920%2C1036%2C440%2C246&vis=1&wgl=true&ca_type=image"),
    Map.entry("X-YouTube-Client-Name", "56"),
    Map.entry("X-YouTube-Client-Version", "1.20241008.01.00"),
    Map.entry("X-YouTube-Time-Zone", "Europe/Belgrade"),
    Map.entry("X-YouTube-Utc-Offset", "120")
  );
  
  private Map<CharSequence, String> headers_202 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/png,image/svg+xml,*/*;q=0.8"),
    Map.entry("Priority", "u=0, i"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("TE", "trailers"),
    Map.entry("Upgrade-Insecure-Requests", "1")
  );
  
  private Map<CharSequence, String> headers_215 = Map.ofEntries(
    Map.entry("Accept", "text/css,*/*;q=0.1"),
    Map.entry("Priority", "u=2"),
    Map.entry("Sec-Fetch-Dest", "style"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("TE", "trailers")
  );
  
  private String uri01 = "https://d25x7cjvmh9owh.cloudfront.net/cognitive_search_demo_data_screenshot_019ae7aa55.png";
  
  private String uri02 = "https://jnn-pa.googleapis.com/$rpc/google.internal.waa.v1.Waa";
  
  private String uri03 = "https://id.squirro.com/auth/resources/dzik9/login/squirro/build";
  
  private String uri04 = "https://yt3.ggpht.com/xdeDz_AgtYVDrjdFjCaHMt4ivi5GNKuX0JFAwJ1c49GlIkqpRveAr8zN7vhZQNmsoDzyyDJq=s68-c-k-c0x00ffffff-no-rj";
  
  private String uri05 = "https://www.google.com/js/th/Kwl4UTqRlZdwo60dxzGVsyg_CEkasAzkebPPx38d0Do.js";
  
  private String uri06 = "https://fonts.gstatic.com/s/roboto/v18";
  
  private String uri07 = "https://www.youtube-nocookie.com";
  
  private String uri08 = "https://i.ytimg.com";
  
  private String uri09 = "https://play.google.com/log";

  private ScenarioBuilder scn = scenario("CognitiveSearcPage")
    .exec(
      http("request_0")
        .get("/setup/app")
        .headers(headers_0)
        .resources(
          http("request_1")
            .get("/_next/static/chunks/webpack-9bcf06457bbdc641.js")
            .headers(headers_1),
          http("request_2")
            .get("/_next/static/chunks/framework-bde023a27d1a49cb.js")
            .headers(headers_1),
          http("request_3")
            .get("/_next/static/chunks/main-81087524f00c7d6f.js")
            .headers(headers_1),
          http("request_4")
            .get("/_next/static/chunks/pages/_app-7a5f4d494b41560d.js")
            .headers(headers_1),
          http("request_5")
            .get("/_next/static/chunks/ebaf4c27-c689a865874b5135.js")
            .headers(headers_1),
          http("request_6")
            .get("/_next/static/chunks/6389-091833ed2dab1e86.js")
            .headers(headers_1),
          http("request_7")
            .get("/_next/static/chunks/1596-4adf9fcfd382b2e9.js")
            .headers(headers_1),
          http("request_8")
            .get("/_next/static/chunks/5675-9c73595588dbd447.js")
            .headers(headers_1),
          http("request_9")
            .get("/_next/static/chunks/5181-d4aeabb64460ca79.js")
            .headers(headers_1),
          http("request_10")
            .get("/_next/static/chunks/8984-11ccdc3747bd2bd7.js")
            .headers(headers_1),
          http("request_11")
            .get("/_next/static/chunks/8723-4bf763b22240a876.js")
            .headers(headers_1),
          http("request_12")
            .get("/_next/static/chunks/676-32de25b5c1f0865f.js")
            .headers(headers_1),
          http("request_13")
            .get("/_next/static/chunks/1173-441ebab7d0d38d74.js")
            .headers(headers_1),
          http("request_14")
            .get("/_next/static/chunks/4908-367465c58a1e5e1c.js")
            .headers(headers_1),
          http("request_15")
            .get("/_next/static/chunks/8839-5be17179b1891b1c.js")
            .headers(headers_1),
          http("request_16")
            .get("/_next/static/chunks/5850-25e0b386049ae8ed.js")
            .headers(headers_1),
          http("request_17")
            .get("/_next/static/chunks/pages/setup/app-9d60fdd6585a7040.js")
            .headers(headers_1),
          http("request_18")
            .get("/_next/static/DdNsNMpmmR0yxKBrMut_C/_buildManifest.js")
            .headers(headers_1),
          http("request_19")
            .get("/_next/static/DdNsNMpmmR0yxKBrMut_C/_ssgManifest.js")
            .headers(headers_1),
          http("request_20")
            .get("/favicon.ico")
            .headers(headers_20)
            .check(status().is(404)),
          http("request_21")
            .get("/_next/static/chunks/126-0af6e7c197b09d4c.js")
            .headers(headers_21),
          http("request_22")
            .get("/_next/static/chunks/5681-63d416d6c4522a3d.js")
            .headers(headers_21),
          http("request_23")
            .get("/_next/static/chunks/3426-4aea5c11af255720.js")
            .headers(headers_21),
          http("request_24")
            .get("/_next/static/chunks/9164-18a11905b266c4e2.js")
            .headers(headers_21),
          http("request_25")
            .get("/_next/static/chunks/8307-a575f70dc2435148.js")
            .headers(headers_21),
          http("request_26")
            .get("/_next/static/chunks/2447-8ac3a66282976602.js")
            .headers(headers_21),
          http("request_27")
            .get("/api/instances?admin=false&canConnect=false&canInstall=null&stateFilter=null")
            .headers(headers_27)
            .check(status().is(401)),
          http("request_28")
            .get("/_next/static/chunks/pages/admin/instances-037e6c0cb1e1c350.js")
            .headers(headers_21),
          http("request_29")
            .get("/_next/static/chunks/pages/setup/app/%5Bapp%5D-13e04c28193de194.js")
            .headers(headers_21),
          http("request_30")
            .get("/_next/static/chunks/pages/setup/app/%5Bapp%5D-13e04c28193de194.js")
            .headers(headers_1),
          http("request_31")
            .get("/_next/static/chunks/126-0af6e7c197b09d4c.js")
            .headers(headers_1),
          http("request_32")
            .get("/_next/static/chunks/5681-63d416d6c4522a3d.js")
            .headers(headers_1),
          http("request_33")
            .get("/_next/static/chunks/3426-4aea5c11af255720.js")
            .headers(headers_1),
          http("request_34")
            .get("/_next/static/chunks/9164-18a11905b266c4e2.js")
            .headers(headers_1),
          http("request_35")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/genai-application.json?app=genai-application")
            .headers(headers_35),
          http("request_36")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/genai-application-web.json?app=genai-application-web")
            .headers(headers_36),
          http("request_37")
            .get("/_next/static/chunks/8307-a575f70dc2435148.js")
            .headers(headers_1),
          http("request_38")
            .get("/_next/static/chunks/2447-8ac3a66282976602.js")
            .headers(headers_1),
          http("request_39")
            .get("/_next/static/chunks/pages/admin/instances-037e6c0cb1e1c350.js")
            .headers(headers_1),
          http("request_40")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/cognitive_search.json?app=cognitive_search")
            .headers(headers_40),
          http("request_41")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/sales_insight.json?app=sales_insight")
            .headers(headers_41),
          http("request_42")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/business_environment_monitoring.json?app=business_environment_monitoring")
            .headers(headers_42),
          http("request_43")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/cognitive_search_demo_data.json?app=cognitive_search_demo_data")
            .headers(headers_43),
          http("request_44")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/app_studio.json?app=app_studio")
            .headers(headers_44),
          http("request_45")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/cognitive_search_academy.json?app=cognitive_search_academy")
            .headers(headers_45),
          http("request_46")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/ai_reader.json?app=ai_reader")
            .headers(headers_46),
          http("request_47")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/sales_insight.json?app=sales_insight")
            .headers(headers_41)
        )
    )
    .pause(10)
    .exec(
      http("request_48")
        .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/sales_insight.json?app=sales_insight")
        .headers(headers_41)
    )
    .pause(15)
    .exec(
      http("request_49")
        .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/cognitive_search_demo_data.json?app=cognitive_search_demo_data")
        .headers(headers_43)
        .resources(
          http("request_50")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/cognitive_search_demo_data.json?app=cognitive_search_demo_data")
            .headers(headers_43),
          http("request_51")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/cognitive_search.json?app=cognitive_search")
            .headers(headers_40),
          http("request_52")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/cognitive_search.json?app=cognitive_search")
            .headers(headers_40),
          http("request_53")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/business_environment_monitoring.json?app=business_environment_monitoring")
            .headers(headers_42),
          http("request_54")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/business_environment_monitoring.json?app=business_environment_monitoring")
            .headers(headers_42),
          http("request_55")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/genai-application-web.json?app=genai-application-web")
            .headers(headers_36),
          http("request_56")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/cognitive_search.json?app=cognitive_search")
            .headers(headers_40)
        )
    )
    .pause(1)
    .exec(
      http("request_57")
        .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/allocator.json?app=allocator")
        .headers(headers_57)
        .resources(
          http("request_58")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/aviation.json?app=aviation")
            .headers(headers_57),
          http("request_59")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/asset_management_search.json?app=asset_management_search")
            .headers(headers_57),
          http("request_60")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/kpi_sla_tracking.json?app=kpi_sla_tracking")
            .headers(headers_57),
          http("request_61")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/pharma_search.json?app=pharma_search")
            .headers(headers_57)
        )
    )
    .pause(38)
    .exec(
      http("request_62")
        .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/kpi_sla_tracking.json?app=kpi_sla_tracking")
        .headers(headers_62)
        .resources(
          http("request_63")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/allocator.json?app=allocator")
            .headers(headers_63),
          http("request_64")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/sales_insight.json?app=sales_insight")
            .headers(headers_41),
          http("request_65")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/genai-application.json?app=genai-application")
            .headers(headers_35)
        )
    )
    .pause(1)
    .exec(
      http("request_66")
        .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/genai-application.json?app=genai-application")
        .headers(headers_35)
        .resources(
          http("request_67")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/sales_insight.json?app=sales_insight")
            .headers(headers_41)
        )
    )
    .pause(47)
    .exec(
      http("request_68")
        .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/cognitive_search.json?app=cognitive_search")
        .headers(headers_40)
        .resources(
          http("request_69")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/cognitive_search_demo_data.json?app=cognitive_search_demo_data")
            .headers(headers_43),
          http("request_70")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/business_environment_monitoring.json?app=business_environment_monitoring")
            .headers(headers_42)
        )
    )
    .pause(80)
    .exec(
      http("request_71")
        .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/genai-application-web.json?app=genai-application-web")
        .headers(headers_71)
        .resources(
          http("request_72")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/business_environment_monitoring.json?app=business_environment_monitoring")
            .headers(headers_72)
        )
    )
    .pause(2)
    .exec(
      http("request_73")
        .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/cognitive_search.json?app=cognitive_search")
        .headers(headers_40)
    )
    .pause(1)
    .exec(
      http("request_74")
        .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/cognitive_search_demo_data.json?app=cognitive_search_demo_data")
        .headers(headers_43)
        .resources(
          http("request_75")
            .head("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app/cognitive_search_demo_data.json?app=cognitive_search_demo_data")
            .headers(headers_75),
          http("request_76")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app.json")
            .headers(headers_76),
          http("request_77")
            .get(uri07 + "/embed/GWvNu_J8lSE")
            .headers(headers_77),
          http("request_78")
            .get(uri07 + "/embed/OmSG8W_h8LM")
            .headers(headers_77),
          http("request_79")
            .get("/_next/static/chunks/5835-72ae19def49bec0d.js")
            .headers(headers_21),
          http("request_80")
            .get("/_next/static/chunks/6032-5fc69ada0c9a2d0a.js")
            .headers(headers_21),
          http("request_81")
            .get("/_next/static/chunks/4712-49d453d210bbd812.js")
            .headers(headers_21),
          http("request_82")
            .get("/_next/static/chunks/pages/setup/instance-15378614103e2e24.js")
            .headers(headers_21),
          http("request_83")
            .get(uri07 + "/s/player/2f238d39/player_ias.vflset/en_US/base.js")
            .headers(headers_83),
          http("request_84")
            .get(uri07 + "/s/player/2f238d39/player_ias.vflset/en_US/embed.js")
            .headers(headers_83),
          http("request_85")
            .get(uri07 + "/s/player/2f238d39/www-embed-player.vflset/www-embed-player.js")
            .headers(headers_83),
          http("request_86")
            .get(uri07 + "/s/player/2f238d39/player_ias.vflset/en_US/base.js")
            .headers(headers_83),
          http("request_87")
            .get("/_next/static/chunks/5835-72ae19def49bec0d.js")
            .headers(headers_1),
          http("request_88")
            .get("/_next/static/chunks/6032-5fc69ada0c9a2d0a.js")
            .headers(headers_1),
          http("request_89")
            .get("/_next/static/chunks/4712-49d453d210bbd812.js")
            .headers(headers_1),
          http("request_90")
            .get("/_next/static/chunks/pages/setup/instance-15378614103e2e24.js")
            .headers(headers_1),
          http("request_91")
            .get(uri01)
            .headers(headers_91),
          http("request_92")
            .get(uri05)
            .headers(headers_92),
          http("request_93")
            .get(uri07 + "/s/player/2f238d39/player_ias.vflset/en_US/remote.js")
            .headers(headers_83),
          http("request_94")
            .get(uri05)
            .headers(headers_92),
          http("request_95")
            .get(uri07 + "/generate_204?m5Z88g")
            .headers(headers_95),
          http("request_96")
            .get(uri08 + "/vi/OmSG8W_h8LM/default.jpg")
            .headers(headers_96),
          http("request_97")
            .get(uri07 + "/generate_204?4_8qJQ")
            .headers(headers_95),
          http("request_98")
            .get(uri08 + "/vi_webp/GWvNu_J8lSE/sddefault.webp")
            .headers(headers_98),
          http("request_99")
            .post(uri02 + "/Create")
            .headers(headers_99)
            .body(RawFileBody("mySimulation/cognitivesearcpage/0099_request.dat")),
          http("request_100")
            .post(uri09 + "?format=json&hasfast=true&authuser=0")
            .headers(headers_100)
            .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"31\",null,null,[1,0,0,0,0]]],1828,[[\"1728665427818\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[null,56]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[1]]]]]]\",null,null,null,null,null,null,-7200,[null,null,null,\"[]\"],null,null,null,null,1]],\"1728665427818\"]", ""),
          http("request_101")
            .post(uri02 + "/Create")
            .headers(headers_99)
            .body(RawFileBody("mySimulation/cognitivesearcpage/0101_request.dat")),
          http("request_102")
            .post(uri09 + "?format=json&hasfast=true&authuser=0")
            .headers(headers_102)
            .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"31\",null,null,[1,0,0,0,0]]],1828,[[\"1728665427750\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[null,54]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[1]]]]]]\",null,null,null,null,null,null,-7200,[null,null,null,\"[]\"],null,null,null,null,1]],\"1728665427750\"]", ""),
          http("request_103")
            .post(uri02 + "/GenerateIT")
            .headers(headers_103)
            .body(RawFileBody("mySimulation/cognitivesearcpage/0103_request.dat")),
          http("request_104")
            .post(uri09 + "?format=json&hasfast=true&authuser=0")
            .headers(headers_100)
            .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"31\",null,null,[1,0,0,0,0]]],1828,[[\"1728665428032\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fsc\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fsl\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[null,2]]]],[\\\"/client_streamz/bg/frs\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[null,940]]]]]]\",null,null,null,null,null,null,-7200,[null,null,null,\"[]\"],null,null,null,null,2]],\"1728665428033\"]", ""),
          http("request_105")
            .post(uri09 + "?format=json&hasfast=true&authuser=0")
            .headers(headers_100)
            .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"31\",null,null,[1,0,0,0,0]]],1828,[[\"1728665428027\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[null,63]]]],[\\\"/client_streamz/bg/el\\\",null,[\\\"en\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,0]],[[[\\\"R\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,0]],[[[\\\"q\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,0]],[[[\\\"S\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,0]]]],[\\\"/client_streamz/bg/wrl\\\",null,[\\\"mn\\\",\\\"ac\\\",\\\"sc\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[null,1],[null,0],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,327]]]],[\\\"/client_streamz/bg/po/csc\\\",null,[\\\"cs\\\",\\\"rk\\\",\\\"mk\\\"],[[[[null,3],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/po/ctav\\\",null,[\\\"av\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"m\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[1]]]]]]\",null,null,null,null,null,null,-7200,[null,null,null,\"[]\"],null,null,null,null,1]],\"1728665428028\"]", ""),
          http("request_106")
            .post(uri02 + "/GenerateIT")
            .headers(headers_103)
            .body(RawFileBody("mySimulation/cognitivesearcpage/0106_request.dat")),
          http("request_107")
            .post(uri09 + "?format=json&hasfast=true&authuser=0")
            .headers(headers_100)
            .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"31\",null,null,[1,0,0,0,0]]],1828,[[\"1728665428093\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[null,45]]]],[\\\"/client_streamz/bg/el\\\",null,[\\\"en\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,0]],[[[\\\"R\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,0]],[[[\\\"q\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,0]],[[[\\\"S\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,1]]]],[\\\"/client_streamz/bg/wrl\\\",null,[\\\"mn\\\",\\\"ac\\\",\\\"sc\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[null,1],[null,0],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,461]]]],[\\\"/client_streamz/bg/po/csc\\\",null,[\\\"cs\\\",\\\"rk\\\",\\\"mk\\\"],[[[[null,3],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/po/ctav\\\",null,[\\\"av\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"m\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[1]]]]]]\",null,null,null,null,null,null,-7200,[null,null,null,\"[]\"],null,null,null,null,1]],\"1728665428094\"]", ""),
          http("request_108")
            .post(uri09 + "?format=json&hasfast=true&authuser=0")
            .headers(headers_100)
            .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"31\",null,null,[1,0,0,0,0]]],1828,[[\"1728665428099\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fsc\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fsl\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[null,3]]]],[\\\"/client_streamz/bg/frs\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[null,1016]]]]]]\",null,null,null,null,null,null,-7200,[null,null,null,\"[]\"],null,null,null,null,2]],\"1728665428099\"]", "")
        )
    )
    .pause(1)
    .exec(
      http("request_109")
        .post(uri07 + "/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
        .headers(headers_109)
        .body(RawFileBody("mySimulation/cognitivesearcpage/0109_request.json"))
        .resources(
          http("request_110")
            .post(uri07 + "/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
            .headers(headers_110)
            .body(RawFileBody("mySimulation/cognitivesearcpage/0110_request.json"))
        )
    )
    .pause(8)
    .exec(
      http("request_111")
        .post(uri07 + "/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
        .headers(headers_111)
        .body(RawFileBody("mySimulation/cognitivesearcpage/0111_request.json"))
        .resources(
          http("request_112")
            .get("/setup/app/cognitive_search_demo_data")
            .headers(headers_112),
          http("request_113")
            .get("/_next/static/chunks/5675-9c73595588dbd447.js")
            .headers(headers_113),
          http("request_114")
            .get("/_next/static/chunks/6389-091833ed2dab1e86.js")
            .headers(headers_113),
          http("request_115")
            .get("/_next/static/chunks/webpack-9bcf06457bbdc641.js")
            .headers(headers_113),
          http("request_116")
            .get("/_next/static/chunks/main-81087524f00c7d6f.js")
            .headers(headers_113),
          http("request_117")
            .get("/_next/static/chunks/pages/_app-7a5f4d494b41560d.js")
            .headers(headers_113),
          http("request_118")
            .get("/_next/static/chunks/ebaf4c27-c689a865874b5135.js")
            .headers(headers_113),
          http("request_119")
            .get("/_next/static/chunks/5181-d4aeabb64460ca79.js")
            .headers(headers_113),
          http("request_120")
            .get("/_next/static/chunks/1596-4adf9fcfd382b2e9.js")
            .headers(headers_113),
          http("request_121")
            .get(uri07 + "/embed/GWvNu_J8lSE")
            .headers(headers_77),
          http("request_122")
            .get("/_next/static/chunks/framework-bde023a27d1a49cb.js")
            .headers(headers_113),
          http("request_123")
            .get("/_next/static/chunks/8984-11ccdc3747bd2bd7.js")
            .headers(headers_113),
          http("request_124")
            .get("/_next/static/chunks/1173-441ebab7d0d38d74.js")
            .headers(headers_113),
          http("request_125")
            .get("/_next/static/chunks/8723-4bf763b22240a876.js")
            .headers(headers_113),
          http("request_126")
            .get("/_next/static/chunks/8839-5be17179b1891b1c.js")
            .headers(headers_113),
          http("request_127")
            .get("/_next/static/chunks/676-32de25b5c1f0865f.js")
            .headers(headers_113),
          http("request_128")
            .get(uri07 + "/embed/OmSG8W_h8LM")
            .headers(headers_77),
          http("request_129")
            .get("/_next/static/chunks/4908-367465c58a1e5e1c.js")
            .headers(headers_113),
          http("request_130")
            .get("/_next/static/chunks/5850-25e0b386049ae8ed.js")
            .headers(headers_113),
          http("request_131")
            .get("/_next/static/chunks/pages/setup/app/%5Bapp%5D-13e04c28193de194.js")
            .headers(headers_113),
          http("request_132")
            .get("/_next/static/DdNsNMpmmR0yxKBrMut_C/_buildManifest.js")
            .headers(headers_113),
          http("request_133")
            .get("/_next/static/DdNsNMpmmR0yxKBrMut_C/_ssgManifest.js")
            .headers(headers_113),
          http("request_134")
            .get("/_next/static/media/logo.b8552f9e.svg")
            .headers(headers_134),
          http("request_135")
            .get(uri01)
            .headers(headers_135),
          http("request_136")
            .get(uri07 + "/s/player/2f238d39/www-player.css")
            .headers(headers_136),
          http("request_137")
            .get(uri07 + "/s/player/2f238d39/player_ias.vflset/en_US/embed.js")
            .headers(headers_137),
          http("request_138")
            .get(uri07 + "/s/player/2f238d39/player_ias.vflset/en_US/embed.js")
            .headers(headers_137),
          http("request_139")
            .get("/favicon.ico")
            .headers(headers_139)
            .check(status().is(404)),
          http("request_140")
            .get(uri06 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
            .headers(headers_140),
          http("request_141")
            .get(uri07 + "/s/player/2f238d39/www-embed-player.vflset/www-embed-player.js")
            .headers(headers_141),
          http("request_142")
            .get("/api/instances?admin=false&canConnect=false&canInstall=null&stateFilter=null")
            .headers(headers_27)
            .check(status().is(401)),
          http("request_143")
            .get(uri07 + "/s/player/2f238d39/www-embed-player.vflset/www-embed-player.js")
            .headers(headers_141),
          http("request_144")
            .get("/_next/data/DdNsNMpmmR0yxKBrMut_C/setup/app.json")
            .headers(headers_57),
          http("request_145")
            .get(uri06 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
            .headers(headers_140),
          http("request_146")
            .get(uri07 + "/s/player/2f238d39/player_ias.vflset/en_US/base.js")
            .headers(headers_141),
          http("request_147")
            .get(uri07 + "/s/player/2f238d39/player_ias.vflset/en_US/base.js")
            .headers(headers_141),
          http("request_148")
            .get("/_next/static/chunks/126-0af6e7c197b09d4c.js")
            .headers(headers_148),
          http("request_149")
            .get("/_next/static/chunks/8307-a575f70dc2435148.js")
            .headers(headers_148),
          http("request_150")
            .get("/_next/static/chunks/3426-4aea5c11af255720.js")
            .headers(headers_148),
          http("request_151")
            .get("/_next/static/chunks/9164-18a11905b266c4e2.js")
            .headers(headers_148),
          http("request_152")
            .get("/_next/static/chunks/5681-63d416d6c4522a3d.js")
            .headers(headers_148),
          http("request_153")
            .get("/_next/static/chunks/2447-8ac3a66282976602.js")
            .headers(headers_148),
          http("request_154")
            .get(uri07 + "/s/player/2f238d39/player_ias.vflset/en_US/remote.js")
            .headers(headers_141),
          http("request_155")
            .post(uri02 + "/Create")
            .headers(headers_103)
            .body(RawFileBody("mySimulation/cognitivesearcpage/0155_request.dat")),
          http("request_156")
            .post(uri02 + "/Create")
            .headers(headers_103)
            .body(RawFileBody("mySimulation/cognitivesearcpage/0156_request.dat")),
          http("request_157")
            .get("/_next/static/chunks/pages/admin/instances-037e6c0cb1e1c350.js")
            .headers(headers_148),
          http("request_158")
            .get("/_next/static/chunks/126-0af6e7c197b09d4c.js")
            .headers(headers_1),
          http("request_159")
            .get("/_next/static/chunks/5835-72ae19def49bec0d.js")
            .headers(headers_148),
          http("request_160")
            .get("/_next/static/chunks/6032-5fc69ada0c9a2d0a.js")
            .headers(headers_148),
          http("request_161")
            .get("/_next/static/chunks/4712-49d453d210bbd812.js")
            .headers(headers_148),
          http("request_162")
            .get("/_next/static/chunks/pages/setup/instance-15378614103e2e24.js")
            .headers(headers_148),
          http("request_163")
            .get("/_next/static/chunks/pages/setup/app-9d60fdd6585a7040.js")
            .headers(headers_148),
          http("request_164")
            .get("/_next/static/chunks/5681-63d416d6c4522a3d.js")
            .headers(headers_1),
          http("request_165")
            .get("/_next/static/chunks/3426-4aea5c11af255720.js")
            .headers(headers_1),
          http("request_166")
            .get(uri08 + "/vi_webp/GWvNu_J8lSE/sddefault.webp")
            .headers(headers_135),
          http("request_167")
            .get("/_next/static/chunks/9164-18a11905b266c4e2.js")
            .headers(headers_1),
          http("request_168")
            .get("/_next/static/chunks/8307-a575f70dc2435148.js")
            .headers(headers_1),
          http("request_169")
            .get("/_next/static/chunks/2447-8ac3a66282976602.js")
            .headers(headers_1),
          http("request_170")
            .get(uri05)
            .headers(headers_92),
          http("request_171")
            .get("/_next/static/chunks/pages/admin/instances-037e6c0cb1e1c350.js")
            .headers(headers_1),
          http("request_172")
            .options(uri02 + "/Create")
            .headers(headers_172),
          http("request_173")
            .get(uri05)
            .headers(headers_92),
          http("request_174")
            .get("/_next/static/chunks/5835-72ae19def49bec0d.js")
            .headers(headers_1),
          http("request_175")
            .get("/_next/static/chunks/6032-5fc69ada0c9a2d0a.js")
            .headers(headers_1),
          http("request_176")
            .get("/_next/static/chunks/4712-49d453d210bbd812.js")
            .headers(headers_1),
          http("request_177")
            .get("/_next/static/chunks/pages/setup/instance-15378614103e2e24.js")
            .headers(headers_1),
          http("request_178")
            .get("/_next/static/chunks/pages/setup/app-9d60fdd6585a7040.js")
            .headers(headers_1),
          http("request_179")
            .get(uri08 + "/vi/OmSG8W_h8LM/sddefault.jpg")
            .headers(headers_135),
          http("request_180")
            .options(uri02 + "/Create")
            .headers(headers_172),
          http("request_181")
            .get(uri07 + "/generate_204?moJCSg")
            .headers(headers_95),
          http("request_182")
            .get(uri04)
            .headers(headers_135),
          http("request_183")
            .post(uri09 + "?format=json&hasfast=true&authuser=0")
            .headers(headers_183)
            .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"31\",null,null,[1,0,0,0,0]]],1828,[[\"1728665441457\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[null,72]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[1]]]]]]\",null,null,null,null,null,null,-7200,[null,null,null,\"[]\"],null,null,null,null,1]],\"1728665441457\"]", ""),
          http("request_184")
            .get(uri07 + "/generate_204?KO5kAA")
            .headers(headers_95),
          http("request_185")
            .post(uri09 + "?format=json&hasfast=true&authuser=0")
            .headers(headers_183)
            .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"31\",null,null,[1,0,0,0,0]]],1828,[[\"1728665441524\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[null,58]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[1]]]]]]\",null,null,null,null,null,null,-7200,[null,null,null,\"[]\"],null,null,null,null,1]],\"1728665441525\"]", ""),
          http("request_186")
            .options(uri02 + "/GenerateIT")
            .headers(headers_186),
          http("request_187")
            .post(uri09 + "?format=json&hasfast=true&authuser=0")
            .headers(headers_183)
            .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"31\",null,null,[1,0,0,0,0]]],1828,[[\"1728665441590\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[null,48]]]],[\\\"/client_streamz/bg/el\\\",null,[\\\"en\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,0]],[[[\\\"R\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,0]],[[[\\\"q\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,0]],[[[\\\"S\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,0]]]],[\\\"/client_streamz/bg/wrl\\\",null,[\\\"mn\\\",\\\"ac\\\",\\\"sc\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[null,1],[null,0],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,480]]]],[\\\"/client_streamz/bg/po/csc\\\",null,[\\\"cs\\\",\\\"rk\\\",\\\"mk\\\"],[[[[null,3],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/po/ctav\\\",null,[\\\"av\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"m\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[1]]]]]]\",null,null,null,null,null,null,-7200,[null,null,null,\"[]\"],null,null,null,null,1]],\"1728665441591\"]", ""),
          http("request_188")
            .post(uri02 + "/GenerateIT")
            .headers(headers_103)
            .body(RawFileBody("mySimulation/cognitivesearcpage/0188_request.dat")),
          http("request_189")
            .options(uri09 + "?format=json&hasfast=true&authuser=0")
            .headers(headers_189),
          http("request_190")
            .options(uri09 + "?format=json&hasfast=true&authuser=0")
            .headers(headers_189),
          http("request_191")
            .post(uri09 + "?format=json&hasfast=true&authuser=0")
            .headers(headers_183)
            .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"31\",null,null,[1,0,0,0,0]]],1828,[[\"1728665441596\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fsc\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fsl\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[null,3]]]],[\\\"/client_streamz/bg/frs\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[null,1199]]]]]]\",null,null,null,null,null,null,-7200,[null,null,null,\"[]\"],null,null,null,null,2]],\"1728665441596\"]", ""),
          http("request_192")
            .options(uri09 + "?format=json&hasfast=true&authuser=0")
            .headers(headers_192),
          http("request_193")
            .post(uri02 + "/GenerateIT")
            .headers(headers_103)
            .body(RawFileBody("mySimulation/cognitivesearcpage/0193_request.dat")),
          http("request_194")
            .post(uri09 + "?format=json&hasfast=true&authuser=0")
            .headers(headers_183)
            .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"31\",null,null,[1,0,0,0,0]]],1828,[[\"1728665441674\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[null,64]]]],[\\\"/client_streamz/bg/el\\\",null,[\\\"en\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,0]],[[[\\\"R\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,0]],[[[\\\"q\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,0]],[[[\\\"S\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,0]]]],[\\\"/client_streamz/bg/wrl\\\",null,[\\\"mn\\\",\\\"ac\\\",\\\"sc\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[null,1],[null,0],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[null,506]]]],[\\\"/client_streamz/bg/po/csc\\\",null,[\\\"cs\\\",\\\"rk\\\",\\\"mk\\\"],[[[[null,3],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/po/ctav\\\",null,[\\\"av\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"m\\\"],[\\\"O43z0dpjhgX20SCx4KAo\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[1]]]]]]\",null,null,null,null,null,null,-7200,[null,null,null,\"[]\"],null,null,null,null,1]],\"1728665441674\"]", ""),
          http("request_195")
            .options(uri09 + "?format=json&hasfast=true&authuser=0")
            .headers(headers_192),
          http("request_196")
            .options(uri02 + "/GenerateIT")
            .headers(headers_186),
          http("request_197")
            .options(uri09 + "?format=json&hasfast=true&authuser=0")
            .headers(headers_189),
          http("request_198")
            .post(uri09 + "?format=json&hasfast=true&authuser=0")
            .headers(headers_183)
            .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"31\",null,null,[1,0,0,0,0]]],1828,[[\"1728665441681\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fsc\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fsl\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[null,4]]]],[\\\"/client_streamz/bg/frs\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[null,843]]]]]]\",null,null,null,null,null,null,-7200,[null,null,null,\"[]\"],null,null,null,null,2]],\"1728665441682\"]", ""),
          http("request_199")
            .options(uri09 + "?format=json&hasfast=true&authuser=0")
            .headers(headers_189)
        )
    )
    .pause(1)
    .exec(
      http("request_200")
        .post(uri07 + "/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
        .headers(headers_200)
        .body(RawFileBody("mySimulation/cognitivesearcpage/0200_request.json"))
        .resources(
          http("request_201")
            .post(uri07 + "/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
            .headers(headers_201)
            .body(RawFileBody("mySimulation/cognitivesearcpage/0201_request.json"))
        )
    )
    .pause(4)
    .exec(
      http("request_202")
        .get("/sso?RelayState=https%3A%2F%2Fstart.squirro.com%2Fsetup%2Finstance%3Fbasket%3D%257B%2522instance%2522%253Anull%252C%2522owner%2522%253Anull%252C%2522action%2522%253A%2522install%2522%252C%2522app%2522%253A%2522cognitive_search_demo_data%2522%252C%2522appHasTestDrive%2522%253Afalse%257D")
        .headers(headers_202)
        .resources(
          http("request_203")
            .get(uri03 + "/static/js/main.28287c22.js")
            .headers(headers_113),
          http("request_204")
            .get(uri03 + "/static/js/711.1e516aff.chunk.js")
            .headers(headers_113),
          http("request_205")
            .get(uri03 + "/favicon.png")
            .headers(headers_139),
          http("request_206")
            .get(uri03 + "/static/js/9446.4bf1a88f.chunk.js")
            .headers(headers_113),
          http("request_207")
            .get(uri03 + "/static/js/4804.4a354ff2.chunk.js")
            .headers(headers_113),
          http("request_208")
            .get(uri03 + "/static/js/4495.1324d01d.chunk.js")
            .headers(headers_113),
          http("request_209")
            .get(uri03 + "/static/js/5951.308184d1.chunk.js")
            .headers(headers_113),
          http("request_210")
            .get(uri03 + "/static/js/6726.6d121631.chunk.js")
            .headers(headers_113),
          http("request_211")
            .get(uri03 + "/static/js/4580.f4a6d208.chunk.js")
            .headers(headers_113),
          http("request_212")
            .get(uri03 + "/static/js/4177.dd272ffa.chunk.js")
            .headers(headers_113),
          http("request_213")
            .get(uri03 + "/static/js/5738.35e51997.chunk.js")
            .headers(headers_113),
          http("request_214")
            .get(uri03 + "/static/js/8123.53b43aed.chunk.js")
            .headers(headers_113),
          http("request_215")
            .get(uri03 + "/static/css/4468.80259f84.chunk.css")
            .headers(headers_215),
          http("request_216")
            .get(uri03 + "/static/js/4468.cab07187.chunk.js")
            .headers(headers_113),
          http("request_217")
            .get(uri03 + "/static/media/logo_full.2812f1e3e741476cb5f39572c088ff4e.svg")
            .headers(headers_134),
          http("request_218")
            .get(uri03 + "/static/media/squirro_id.9f219bc8c025fea300f95c9c68452731.svg")
            .headers(headers_134)
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
