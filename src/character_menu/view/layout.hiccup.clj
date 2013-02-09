(doctype :html5)
[:html
 [:head
  [:meta {:http-equiv "Content-Type" :content "text/html" :charset "iso-8859-1"}]
  [:title "character-menu"]
  (include-css "/stylesheets/reset.css")
  (include-css "/stylesheets/style.css")
  (include-js "/javascript/character_menu.js")]
 [:body
  (eval (:template-body joodo.views/*view-context*))
]]
