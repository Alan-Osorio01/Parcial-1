grammar punto5;

expr: func '(' NUM ')';

func: 'Sin' | 'Cos' | 'Tan';
NUM: [0-9]+;

WS: [ \t\n\r]+ -> skip;
