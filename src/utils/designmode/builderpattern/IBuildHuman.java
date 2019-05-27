package utils.designmode.builderpattern;

public interface IBuildHuman {
     void buildHead();
     void buildBody();
     void buildHand();
     void buildFoot();
     Human createHuman();

}
