public class TVContext implements State{
    private State tvState;

    public State getTvState() {
        return this.tvState;
    }

    public void setTvState(State tvState) {
        this.tvState = tvState;
    }

    @Override
    public void doAction() {
        tvState.doAction();
    }
}
