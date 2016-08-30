@Controller
class MyApp {
	@RequestMapping("/")
	@ResponseBody
	String message() {
		return "<h1>Good Joon</h1>"
	}
}