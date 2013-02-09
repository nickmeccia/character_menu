(ns character-menu.core-spec
  (:use
    [speclj.core]
    [joodo.spec-helpers.controller]
    [character-menu.core]))

(describe "character-menu"

  (with-mock-rendering)
  (with-routes app-handler)

  (it "handles home page"
    (let [result (do-get "/")]
      (should= 200 (:status result))
      (should= "index" @rendered-template)))
  )

(run-specs)
