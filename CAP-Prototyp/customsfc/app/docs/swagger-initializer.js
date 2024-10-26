window.onload = function() {
  //<editor-fold desc="Changeable Configuration Block">

  // the following lines will be replaced by docker/configurator, when it runs in a docker-container
  window.ui = SwaggerUIBundle({
    urls:[
      {url:"ChangeCustomsfcService.openapi3.json", name: "ChangeCustomsfcService"},
      {url:"CreateCustomsfcService.openapi3.json", name: "CreateCustomsfcService"},
      {url:"ReadAllCustomsfcService.openapi3.json", name: "ReadAllCustomsfcService"},
      {url:"ReadCustomsfcService.openapi3.json", name: "ReadCustomsfcService"}

    ],
    dom_id: '#swagger-ui',
    deepLinking: true,
    presets: [
      SwaggerUIBundle.presets.apis,
      SwaggerUIStandalonePreset
    ],
    plugins: [
      SwaggerUIBundle.plugins.DownloadUrl
    ],
    layout: "StandaloneLayout"
  });

  //</editor-fold>
};
