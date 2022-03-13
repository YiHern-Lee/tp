package seedu.address.logic.commands;

import static seedu.address.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.add.AddApplicantCommand;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;
import seedu.address.model.applicant.Applicant;
import seedu.address.testutil.PersonBuilder;

/**
 * Contains integration tests (interaction with the Model) for {@code AddApplicantCommand}.
 */
public class AddApplicantCommandIntegrationTest {

    private Model model;

    @BeforeEach
    public void setUp() {
        model = new ModelManager(getTypicalAddressBook(), new UserPrefs());
    }

    @Test
    public void execute_newPerson_success() {
        Applicant validApplicant = new PersonBuilder().build();

        Model expectedModel = new ModelManager(model.getAddressBook(), new UserPrefs());
        expectedModel.addPerson(validApplicant);

        assertCommandSuccess(new AddApplicantCommand(validApplicant), model,
                String.format(AddApplicantCommand.MESSAGE_SUCCESS, validApplicant), expectedModel);
    }

    @Test
    public void execute_duplicatePerson_throwsCommandException() {
        Applicant applicantInList = model.getAddressBook().getPersonList().get(0);
        assertCommandFailure(new AddApplicantCommand(applicantInList), model,
                AddApplicantCommand.MESSAGE_DUPLICATE_PERSON);
    }

}