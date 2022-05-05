package padroescomportamentais.command;

import java.util.ArrayList;
import java.util.List;

public class Mestre {

    private List<Quest> quests = new ArrayList<>();

    public void iniciarQuest(Quest quest) {
        this.quests.add(quest);
        quest.executar();
    }

    public void cancelarUltimaQuest() {
        if(quests.size() != 0) {
            Quest quest = this.quests.get(this.quests.size() - 1);
            quest.cancelar();
            this.quests.remove(this.quests.size() - 1);
        }
    }
}
