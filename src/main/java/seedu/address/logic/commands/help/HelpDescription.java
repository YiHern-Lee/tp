package seedu.address.logic.commands.help;

public class HelpDescription {
    public static final String OVERALL_HELPING_DESCRIPTION =
            "Looks like you forget something. Don't worry, here are the overall command list. "
            + "For a more detail of each command, you can type 'help + command' to view the full description. \n"
            + "1. add: Add different types of data into HireLah. \n"
            + "2. edit: Edit different types of data in HireLah. \n"
            + "3. delete: Delete different types of data in HireLah. \n"
            + "4. list: List different data types in HireLah. \n"
            + "5. filter: Filter HireLah data based on different filter type. \n"
            + "6. sort: Sort HireLah data ascending or descending accordingly. \n"
            + "7. exit: Exits the program";

    public static final String ADD_COMMAND_DESCRIPTION =
            "1. Adding an applicant: \n"
            + "Format: 'add -a n/APPLICANT_NAME d/DOB g/GENDER p/PHONE_NUMBER e/EMAIL a/ADDRESS [t/TAG]…' \n"
            + "Some notice: \n"
            + "- An applicant can have any number of tags (including 0). \n"
            + "- DOB provided must be in format YYYY-MM-DD. \n"
            + "- Gender must be M/F. \n"
            + "Examples: \n"
            + "app -a n/Max d/2000-01-01 g/M p/97123456 e/max@yahoo.com a/12 Kent Ridge Drive, 119243 t/Data Analyst\n"
            + "\n 2. Adding Interview: \n"
            + "Format: 'add -i n/CANDIDATE_INDEX d/DATE r/ROLE' \n"
            + "Some notice: \n"
            + "- Date provided must be in format YYYY-MM-DD HH:MM. \n"
            + "- Role must currently exist in position. \n"
            + "Examples: \n"
            + "add -i n/1 d/2022-01-01 14:00 r/Senior Frontend Software Engineer \n \n"
            + "3. Adding positions: \n"
            + "Format: 'add -p POSITION_NAME n/NUM_OPENINGS [d/DESCRIPTION] [r/REQUIREMENTS]' \n"
            + "Some notice: \n"
            + "- Positions must have a unique name. \n"
            + "- Name provided is case-insensitive. \n"
            + "- Number of openings in the position must be 0 or more 0, 1, 2,… \n"
            + "Examples: \n"
            + "add -p Senior Software Engineer n/3 d/More than 5 years experience r/JavaScript r/HTML r/CSS";

    public static final String EDIT_COMMAND_DESCRIPTION =
            "1. Editing an applicant: \n"
            + "Format: 'edit -a n/APPLICANT_NAME d/DOB g/GENDER p/PHONE_NUMBER e/EMAIL a/ADDRESS [t/TAG]…' \n"
            + "Some notice: \n"
            + "- Edits the Applicant at the specified INDEX. The index refers to the index number shown in the "
            + "displayed Applicant list. The index must be a positive integer 1, 2, 3,…\n"
            + "- At least one of the optional fields must be provided. \n"
            + "- Existing values will be updated to the input values. \n"
            + "- When editing tags, the existing tags of the applicant will be removed i.e "
            + "adding of tags is not cumulative."
            + "- You can remove all the Applicant’s tags by typing t/ without specifying any tags after it."
            + "Examples: \n"
            + "edit -a 2 e/belle@yahoo.com a/13 Computing Drive 612345 t/\n"
            + "Edits the name, DOB, gender and phone number of the 1st applicant to be Belle, 1960-03-04, "
            + "F and 81234567 respectively."
            + "\n 2. Editing an Interview: \n"
            + "Format: 'edit -i n/CANDIDATE_INDEX d/DATE r/ROLE' \n"
            + "Some notice: \n"
            + "- Edits the interview with CANDIDATE_INDEX and ROLE. \n"
            + "- At least one optional field must be provided. \n"
            + "- Existing attribute of the interview will be updated to the input value. \n"
            + "- When editing requirements, the existing requirements of the interview will be removed. i.e. "
            + "adding requirements is not cumulative."
            + "Examples: \n"
            + "edit -i 1 Senior Frontend Software Engineer d/2022-01-01 15:00 \n \n"
            + "3. Editing a positions: \n"
            + "Format: 'edit -p POSITION_NAME [n/NUM_OPENINGS] [d/DESCRIPTION] [r/REQUIREMENTS]' \n"
            + "Some notice: \n"
            + "- Edits the available position with POSITION_NAME. \n"
            + "- Position name provided is case-insensitive. \n"
            + "- At least one optional field must be provided. \n"
            + "- Existing attributes of the position will be updated to the input value. \n"
            + "- When editing requirements, the existing requirements of the position will be removed. i.e. "
            + "adding requirements is not cumulative. \n"
            + "- Requirements can be removed by providing an empty requirement field. i.e. r/ \n"
            + "Examples: \n"
            + "edit -p Senior Frontend Software Engineer r/JavaScript r/React";

    public static final String DELETE_COMMAND_DESCRIPTION =
            "1. Deleting an applicant: \n"
            + "Format: 'del -a CANDIDATE_INDEX' \n"
            + "Some notice: \n"
            + "- Deletes the Applicant at the specified CANDIDATE_INDEX. \n"
            + "- The index refers to the index number shown in the displayed Applicant list. \n"
            + "- The index must be a positive integer 1, 2, 3,… \n"
            + "Examples: \n"
            + "'find Betsy' followed by 'delete -a 1' deletes the 1st person in the results of the find command.\n"
            + "\n 2. Deleting an Interview: \n"
            + "Format: 'del -i CANDIDATE_INDEX ROLE' \n"
            + "Some notice: \n"
            + "- Existing interview with the matching CANDIDATE_INDEX and ROLE is deleted. \n"
            + "- Role provided is case-insensitive. \n"
            + "Examples: \n"
            + "del -i 1 Senior Frontend Software Engineer \n \n"
            + "3. Deleting positions: \n"
            + "Format: 'del -p ROLE' \n"
            + "Some notice: \n"
            + "- Existing position with the specified name is deleted. \n"
            + "- The position name has to match with the position that is to be deleted. \n"
            + "- Position name provided is case-insensitive. \n"
            + "Examples: \n"
            + "del -p Senior Frontend Software Engineer";

    public static final String LIST_COMMAND_DESCRIPTION =
            "1. List all applicants: \n"
            + "Format: 'list -a' \n"
            + "\n 2. Listing all Interview for a candidate: \n"
            + "Format: 'list -i CANDIDATE_INDEX' \n"
            + "Examples: \n"
            + "list -i 1 \n \n"
            + "3. Listing all positions: \n"
            + "Format: 'list -p' \n"
            + "Some notice: \n"
            + "- Existing position with the specified name is deleted. \n"
            + "- The position name has to match with the position that is to be deleted. \n"
            + "- Position name provided is case-insensitive. \n"
            + "Examples: \n"
            + "del -p Senior Frontend Software Engineer";

    public static final String FILTER_COMMAND_DESCRIPTION =
        "View different applicants, interviews and positions in HireLah through various filters. "
        + "It alters the current display of HireLah and changes the index of the relevant data. \n"
        + "Format: 'filter DATA_TYPE b/FILTER_TYPE [ARGUMENT]' \n"
        + "Notice: \n"
        + "Different data has different filters available, thus requiring different arguments, as such"
        + "- Applicant (DATA_TYPE: appl): \n"
        + " + FILTER_TYPE: name, ARGUMENT: n/KEYWORD: View applicants whose name contains the keyword \n"
        + " + FILTER_TYPE: tag, ARGUMENT: t/TAG1, [t/TAG2, …]: View applicants who have all the tags specified \n"
        + "- Interview (DATA_TYPE: intvw): \n"
        + " + FILTER_TYPE: appl, ARGUMENT: n/NAME: View interviews for applicants whose name is specified \n"
        + " + FILTER_TYPE: date, ARGUMENT: d/DATE: View interviews happening on the specified date "
        + "(Date provided must be in format YYYY-MM-DD) \n"
        + "- Position (DATA_TYPE: pos): \n"
        + " + FILTER_TYPE: name, ARGUMENT: n/KEYWORD: View positions which has "
        + "the specified keyword in the position name"
        + "Examples: \n"
        + "filter appl tag t/school t/friend \n"
        + "filter intvw date d/2022-03-20";

    public static final String SORT_COMMAND_DESCRIPTION =
            "Arranges applicants, interview and positions in HireLah according to their properties."
            + "It alters the current display of HireLah and changes the index of the relevant data. \n"
            + "Format: 'sort DATA_TYPE SORT_ORDER'"
            + "Notice: \n"
            + "User can specify the order of the sorted data by typing ASC (for ascending) or DSC (for descending) "
            + "in the REVERSE part. \n"
            + "Type of data and what the sorting based on"
            + "- Applicant (DATA_TYPE: appl): \n"
            + " + Sorting properties: Name \n"
            + " + Description: \tSort and view applicants based on their name \n"
            + "- Interview (DATA_TYPE: intvw): \n"
            + " + Sorting properties: Date \n"
            + " + Description: Sort and view interviews based on their occurring date \n"
            + "- Position (DATA_TYPE: pos): \n"
            + " + Sorting properties: Name \n"
            + " + Description: Sort and view positions based on the position name \n"
            + "Examples: \n"
            + "sort APPL ASC \n"
            + "sort POS DSC";

    public static final String EXIT_COMMAND_DESCRIPTION =
            "Well its an exit command, of course it going to terminate the program \n"
            + "Format: 'exit'";
}
