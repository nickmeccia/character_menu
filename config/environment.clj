(use 'joodo.env)

(def environment {
  :joodo.core.namespace "character-menu.core"
  ; environment settings go here
  })

(swap! *env* merge environment)