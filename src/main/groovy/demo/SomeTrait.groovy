package demo

trait SomeTrait {

    @grails.web.Action
    def someAction() {
        render 'This came from SomeTrait.someAction()'
    }
}
