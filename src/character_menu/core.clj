(ns character-menu.core
  (:use
    [compojure.core :only (defroutes GET)]
    [compojure.route :only (not-found)]
    [joodo.middleware.view-context :only (wrap-view-context)]
    [joodo.views :only (render-template render-html)]
    [joodo.controllers :only (controller-router)]))

(defroutes character-menu-routes
  (GET "/" [] (render-template "index"))
  (controller-router 'character-menu.controller)
  (not-found (render-template "not_found" :template-root "character_menu/view" :ns `character-menu.view.view-helpers)))

(def app-handler
  (->
    character-menu-routes
    (wrap-view-context :template-root "character_menu/view" :ns `character-menu.view.view-helpers)))

