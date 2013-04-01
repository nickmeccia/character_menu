[:div.content
 [:aside
  [:img {:src "images/mark/portrait.png"}]]

 [:article
  [:hgroup
   [:h1 "dark3stvampyre"]
   [:h2 "fangbanger"]
   [:h3 "level " [:span "2"] " blood mage"]
   [:div.progress-bar
    [:div.completed
     [:h4 "850 xp"]]
    [:h4 "1650 xp"]]
   [:a {:href "mailto:nickmeccia@gmail.com"} "Report a Completed Quest"]]

  (render-partial "quests")
  (render-partial "side_quests")
  (render-partial "tomes")
  (render-partial "records")
 ]]
