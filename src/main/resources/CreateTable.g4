grammar CreateTable;

statements : (statement)+;
statement : use_db_statement | create_table_statement;
use_db_statement : KEYWORD_USE identifier SEMICOLON ;
create_table_statement : KEYWORD_CREATE KEYWORD_TABLE identifier LEFT_BREAK create_table_items RIGHT_BREAK table_attributes SEMICOLON;
create_table_items : create_table_item (COMMA create_table_item)*;
create_table_item : field_definition | primary_definition | unique_definition | index_definition;
field_definition : identifier type field_attributes;
primary_definition : KEYWORD_PRIMARY KEYWORD_KEY LEFT_BREAK identifiers RIGHT_BREAK;
unique_definition : KEYWORD_UNIQUE (KEYWORD_INDEX|KEYWORD_KEY)? identifier LEFT_BREAK identifiers RIGHT_BREAK;
index_definition : KEYWORD_KEY identifier LEFT_BREAK identifiers RIGHT_BREAK;

not_null_attribute : KEYWORD_NOT KEYWORD_NULL;
auto_increment_attribute : KEYWORD_AUTO_INCREMENT;
default_attribute : KEYWORD_DEFAULT value (onupdate_attribute)?;
onupdate_attribute : KEYWORD_ON KEYWORD_UPDATE current_timestamp_part ;
comment_attribute : comment_part;
field_attributes : (not_null_attribute|default_attribute|comment_attribute|auto_increment_attribute)*;

table_default_charset : KEYWORD_DEFAULT KEYWORD_CHARSET EQUAL identifier;
table_engine : KEYWORD_ENGINE EQUAL identifier;
table_comment : KEYWORD_COMMENT EQUAL literal;
table_attribute :table_default_charset | table_engine | table_comment;
table_attributes : (table_attribute)*;


integer_number_type:(TYPE_INT|TYPE_TINYINT|TYPE_SMALLINT|TYPE_MEDIUMINT|TYPE_BIGINT) (single_length_part)? (KEYWORD_UNSIGNED)?;
decimal_number_type:TYPE_DECIMAL (single_length_part|double_length_part)? (KEYWORD_UNSIGNED)?;
text_type:(TYPE_VARCHAR|TYPE_CHAR) single_length_part;
bit_type:TYPE_BIT single_length_part;
timestamp_type:TYPE_TIMESTAMP (single_length_part)?;
type : integer_number_type|decimal_number_type|text_type|timestamp_type|bit_type;

value
    : 'b' TEXT_LITERAL
    | current_timestamp_part
    | TEXT_LITERAL
    | DIGITS;


literal : TEXT_LITERAL;

identifier : IDENTIFIER | BACKQUOTED_IDENTIFIER;
identifiers : identifier (COMMA identifier)*;
comment_part : KEYWORD_COMMENT literal;
single_length_part : LEFT_BREAK DIGITS RIGHT_BREAK;
double_length_part : LEFT_BREAK DIGITS COMMA DIGITS RIGHT_BREAK;
current_timestamp_part : KEYWORD_CURRENT_TIMESTAMP (single_length_part)?;


KEYWORD_NOT : N O T;
KEYWORD_NULL : N U L L;
KEYWORD_CREATE : C R E A T E;
KEYWORD_TABLE : T A B L E;
KEYWORD_COMMENT : C O M M E N T;
KEYWORD_USE : U S E;
KEYWORD_DEFAULT : D E F A U L T;
KEYWORD_ON : O N;
KEYWORD_UPDATE : U P D A T E;
KEYWORD_CURRENT_TIMESTAMP : C U R R E N T UNDERLINE  T I M E S T A M P;
KEYWORD_UNSIGNED : U N S I G N E D;
KEYWORD_PRIMARY : P R I M A R Y;
KEYWORD_KEY : K E Y;
KEYWORD_UNIQUE : U N I Q U E;
KEYWORD_ENGINE : E N G I N E;
KEYWORD_CHARSET : C H A R S E T;
KEYWORD_AUTO_INCREMENT : A U T O UNDERLINE I N C R E M E N T;

TYPE_TIMESTAMP : T I M E S T A M P;
TYPE_BIT : B I T;
TYPE_CHAR : C H A R;
TYPE_INT : I N T;
TYPE_VARCHAR : V A R C H A R;
TYPE_TINYINT : T I N Y I N T;
TYPE_SMALLINT : S M A L L I N T;
TYPE_MEDIUMINT : M E D I U M I N T;
TYPE_BIGINT : B I G I N T;
TYPE_DECIMAL : D E C I M A L;

LEFT_BRACE : '{';
RIGHT_BRACE : '}';
LEFT_BREAK : '(';
RIGHT_BREAK : ')';
COMMA : ',';
EQUAL : '=';

DIGITS
    : DIGIT+
    ;
IDENTIFIER
    : LETTER (LETTER | DIGIT | '_')*
    ;
BACKQUOTED_IDENTIFIER
    : '`' ( ~'`' | '``' )* '`'
    ;


TEXT_LITERAL
    : '\'' ( ~('\''|'\\') | ('\\' .) )* '\''
    | '"' ( ~('"'|'\\') | ('\\' .) )* '"'
    ;
SEMICOLON
    : ';'
    ;


// Case-insensitive alpha characters
fragment A: ('a'|'A');
fragment B: ('b'|'B');
fragment C: ('c'|'C');
fragment D: ('d'|'D');
fragment E: ('e'|'E');
fragment F: ('f'|'F');
fragment G: ('g'|'G');
fragment H: ('h'|'H');
fragment I: ('i'|'I');
fragment J: ('j'|'J');
fragment K: ('k'|'K');
fragment L: ('l'|'L');
fragment M: ('m'|'M');
fragment N: ('n'|'N');
fragment O: ('o'|'O');
fragment P: ('p'|'P');
fragment Q: ('q'|'Q');
fragment R: ('r'|'R');
fragment S: ('s'|'S');
fragment T: ('t'|'T');
fragment U: ('u'|'U');
fragment V: ('v'|'V');
fragment W: ('w'|'W');
fragment X: ('x'|'X');
fragment Y: ('y'|'Y');
fragment Z: ('z'|'Z');
fragment UNDERLINE: ('_');

fragment DIGIT
    : '0'..'9'
    ;

fragment LETTER
    : ('A'..'Z' | 'a'..'z')
    ;

WS  :   [ \t\n\r]+ -> channel(HIDDEN);