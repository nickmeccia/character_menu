$(function() {
  $(".lightbox").each(function(index, lightbox) {
    var lightbox = $(lightbox)
    var actuator = lightbox.parent()

    lightbox.attr("data-visible", "false")

    var reveal = function() {
      // Hide any existing lightboxes and open the new one
      $(".lightbox").hide().attr("data-visible", "false")
      lightbox.attr("data-visible", "true")
      lightbox.show()
    }

    var hide = function() {
      lightbox.attr("data-visible", "false")
      lightbox.hide()
    }
    
    actuator.click(function() {
      if(lightbox.attr("data-visible") === "false")
        reveal()
      else
        hide()
    })
  })
})
