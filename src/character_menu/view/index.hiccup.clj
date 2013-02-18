[:div.content
 [:div.sidebar
  [:img {:src "images/mark/04.png"}]]

 [:div.main
  [:hgroup
   [:h1 "dark3stvampyre"]
   [:h2 "level " [:span "1"] " blood mage"]
   [:a {:href "mailto:nickmeccia@gmail.com"} "Report a Completed Quest"]]

  (render-partial "quests")
  (render-partial "side_quests")
  (render-partial "tomes")
  (render-partial "records")
 ]]
