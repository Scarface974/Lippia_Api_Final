package ar.steps;

import ar.validator.ClientValidator;
import ar.validator.WorkspaceValidator;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.BaseService;
import services.TimeService;
import services.WorkspaceService;

public class ClockifySteps extends PageSteps {
    @Given("^An account created in Clockify and x-api-key '(.*)' generated$")
    public static void AnAccountCreatedInClockifyAndTokenGenerated(String token){
        BaseService.X_API_KEY.set(token);
    }

    @Then("Obtengo los datos de mi Workspace")
    public void obtengoLosDatosDeMiWorkspace() {
        WorkspaceValidator.validate();
    }

    @And("obtengo un workspaceId")
    public void obtengoUnWorkspaceId() {
        WorkspaceService.defineWorkspaceId();
    }

    @And("^el nombre del cliente es (.*)$")
    public void elNombreDelClienteEsName(String nameClient) {
        ClientValidator.validateNameClient(nameClient);
    }

    @And("^tengo un nombre de cliente (.*)$")
    public void tengoUnNombreDeClienteName(String name) {
        BaseService.NAME_CLIENT.set(name);
    }
/*---------------------------------------Nuevo-----------------------------------------------*/
    @And("obtengo un userId")
    public void obtengoUnUserId() {
        TimeService.defineUserId();
    }


    @And("tengo la descripcion de la hora (.*)$")
    public void tengoLaDescripcionDeLaHoraDescripcion(String descripcion) {
        BaseService.DESCRIPTION_HOUR.set(descripcion);
    }


    @And("tengo el id del proyecto (.*)$")
    public void tengoElIdDelProyectoId_project(String id_project) {
        BaseService.ID_PROJECT.set(id_project);
    }

    @And("obtengo un timeId")
    public void obtengoUnTimeId() {
      //  TimeService.defineTimeId();
    }


    @And("tengo el id de la hora (.*)$")
    public void tengoElIdDeLaHoraId_time(String id_time) {
        BaseService.ID_TIME.set(id_time);
    }

    @And("tengo un id de workspace (.*)$")
    public void tengoUnIdDeWorkspace(String id_workspace) {
        BaseService.WORKSPACE_ID_0.set(id_workspace);
    }

    @And("tengo un id de usuario (.*)$")
    public void tengoUnIdDeUsuarioId_usuario(String id_usuario) {
        BaseService.USER_ID.set(id_usuario);
    }


    @And("obtengo la id de una hora")
    public void obtengoLaIdDeUnaHora() {
        TimeService.defineTimeId();
    }
}
