package Sudoku.SumsOGroups.Factories.groupFactory.Strategies;

import Sudoku.SumsOGroups.Factories.groupFactory.Parse.Parser;
import Sudoku.SumsOGroups.POJO.Group;
import Sudoku.SumsOGroups.Types.GroupCreationStrategy;

public class ParseStrategy extends GroupFactory {
    private static ParseStrategy INSTANCE;
    @Override
    Group createBy(GroupCreationStrategy base) {
        Parser parser = (Parser) base;
        return parser.parse();
    }

    public static ParseStrategy INSTANCE() {
        if(INSTANCE == null) {
            INSTANCE = new ParseStrategy();
        }

        return INSTANCE;
    }
}
