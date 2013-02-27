[:div.content
 [:aside
  [:img {:src "images/mark/04.png"}]]

 [:article
  [:hgroup
   [:h1 "dark3stvampyre"]
   [:h2 "fangbanger"]
   [:h2 "level " [:span "1"] " blood mage"]
   [:div.progress-bar
    [:div.completed]
    [:h4 "675 xp"]]
   [:a {:href "mailto:nickmeccia@gmail.com"} "Report a Completed Quest"]]

  (render-partial "quests")
  (render-partial "side_quests")
  (render-partial "tomes")
  (render-partial "records")
 ]]
