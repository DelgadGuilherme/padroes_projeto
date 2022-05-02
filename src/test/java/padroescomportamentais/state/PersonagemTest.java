package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    Personagem personagem;

    @BeforeEach
    public void setUp() {
        personagem = new Personagem();
    }

    @Test
    public void deveDobrarAguaAvatar() {
        personagem.setTribo(PersonagemTriboAvatar.getInstance());
        assertEquals("Dobra de agua realizada", personagem.dobrarAgua());
    }

    @Test
    public void deveDobrarArAvatar() {
        personagem.setTribo(PersonagemTriboAvatar.getInstance());
        assertEquals("Dobra de ar realizada", personagem.dobrarAr());
    }

    @Test
    public void deveDobrarFogoAvatar() {
        personagem.setTribo(PersonagemTriboAvatar.getInstance());
        assertEquals("Dobra de fogo realizada", personagem.dobrarFogo());
    }

    @Test
    public void deveDobrarTerraAvatar() {
        personagem.setTribo(PersonagemTriboAvatar.getInstance());
        assertEquals("Dobra de terra realizada", personagem.dobrarTerra());
    }

    @Test
    public void naoDeveDobrarArPersonagemAgua() {
        personagem.setTribo(PersonagemTriboAgua.getInstance());
        assertEquals("Dobra não realizada", personagem.dobrarAr());
    }

    @Test
    public void naoDeveDobrarTerraPersonagemAr() {
        personagem.setTribo(PersonagemTriboAr.getInstance());
        assertEquals("Dobra não realizada", personagem.dobrarTerra());
    }

}