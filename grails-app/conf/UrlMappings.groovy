class UrlMappings {

	static mappings = {
        "/"(controller: "app", action: "index")

        "/rest/$action"(controller: "app")
	}
}
