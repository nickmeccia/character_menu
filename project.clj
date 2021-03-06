(defproject character-menu "0.0.1"
  :description "A website deployable to AppEngine"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [joodo "0.10.0"]]

  :joodo-core-namespace character-menu.core

  ; leiningen 2
  :profiles {:dev {:dependencies [[speclj "2.2.0"]]}}
  :test-paths ["spec/"]
  :java-source-paths ["src/"]
  :plugins [[speclj "2.2.0"]]

  ; leiningen 1
  :dev-dependencies [[speclj "2.2.0"]]
  :test-path "spec/"
  :java-source-path "src/"

  )