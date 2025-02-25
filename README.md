/////////////////////////////////////////////////////////
@author : Sattaporn Kowarakun
          sattaporn_kowarakun@cmu.ac.th
          672115046
/////////////////////////////////////////////////////////

Note: GitHub preview mode will make this file looks very chaos, please download it or view in code mode.

This README file will show you how to execute the program and the example output.

First compile the Java file:
>javac StuCom.java 

Execution Command Format:
>java StuCom [argument] [input file]

Arguments : -n (Sort student by student number)
            -f (Sort student by first name)
            -l (Sort student by last name)
            -s (Search student by first name)
                ** -s Argument Command Format:
                    >java StuCom -s [input file] [firstname]


Example of program execution:
    >java StuCom
Output: Command: java StuCom [argument] [input file]

    >java StuCom -n class_roaster67.csv
Output: 622115040 SUCHANUN SIRIJANYA
        662115007 CHONCHANUN KHACHONPHURITHANAKUL
        662115016 NATTHAPHUM CHAIKHAN
        662115039 MANAPAT KAEWLAI
        672115001 KATIKA KANTHASON
        672115002 KRITTAMETH TANSUWAN
        672115004 JITTIPAT KAEWIJIT
        672115005 CHETSADA KANKARN
        672115006 CHANLACHAT PANYOYAI
        672115007 CHANCHAKORN JULLAPECH
        672115008 CHANYA BUNRUEANG
        672115009 CHIDNUCHA POBKEEREE
        672115010 NATANON SOMBOON
        672115011 NATTHAPOOM SAENGKAEW
        672115012 NUT SUPAPORN
        672115013 NATTHAN CHAMPATHIP
        672115014 NATTIKORN SAE-SUE
        672115015 NATTAPON SUKKEAW
        672115016 NATTHAPAT JAGKHURUANG
        672115018 DALANPHOP KEAWSIRIPONG
        672115019 THINNAPOP SRISOMBOON
        672115020 TECHIT WONGKITI
        672115024 TAT PUTJORN
        672115028 NINA BURGER
        672115037 PHUTAWAN MUEANGMA
        672115039 METAVEE AEINJANG
        672115041 RAPHEEPHAT AEIPHINGCHAI
        672115042 RANTICHA CHUMJAI
        672115043 WASINPAT YANIN
        672115044 VIDCHAYADA ABHICHARTTIBUTRA
        672115045 VIRAWIT KONGTHONG
        672115046 SATTAPORN KOWARAKUN
        672115047 SAMAKOM MAKHIAO
        672115048 SUKRITPONG WONGPANYA
        672115049 ANAWAT JANDEE

    >java StuCom -f class_roaster67.csv
Output: 672115049 ANAWAT JANDEE
        672115007 CHANCHAKORN JULLAPECH
        672115006 CHANLACHAT PANYOYAI
        672115008 CHANYA BUNRUEANG
        672115005 CHETSADA KANKARN
        672115009 CHIDNUCHA POBKEEREE
        662115007 CHONCHANUN KHACHONPHURITHANAKUL
        672115018 DALANPHOP KEAWSIRIPONG
        672115004 JITTIPAT KAEWIJIT
        672115001 KATIKA KANTHASON
        672115002 KRITTAMETH TANSUWAN
        662115039 MANAPAT KAEWLAI
        672115039 METAVEE AEINJANG
        672115010 NATANON SOMBOON
        672115015 NATTAPON SUKKEAW
        672115013 NATTHAN CHAMPATHIP
        672115016 NATTHAPAT JAGKHURUANG
        662115016 NATTHAPHUM CHAIKHAN
        672115011 NATTHAPOOM SAENGKAEW
        672115014 NATTIKORN SAE-SUE
        672115028 NINA BURGER
        672115012 NUT SUPAPORN
        672115037 PHUTAWAN MUEANGMA
        672115042 RANTICHA CHUMJAI
        672115041 RAPHEEPHAT AEIPHINGCHAI
        672115047 SAMAKOM MAKHIAO
        672115046 SATTAPORN KOWARAKUN
        622115040 SUCHANUN SIRIJANYA
        672115048 SUKRITPONG WONGPANYA
        672115024 TAT PUTJORN
        672115020 TECHIT WONGKITI
        672115019 THINNAPOP SRISOMBOON
        672115044 VIDCHAYADA ABHICHARTTIBUTRA
        672115045 VIRAWIT KONGTHONG
        672115043 WASINPAT YANIN

    >java StuCom -l class_roaster67.csv
Output: 672115044 VIDCHAYADA ABHICHARTTIBUTRA
        672115039 METAVEE AEINJANG
        672115041 RAPHEEPHAT AEIPHINGCHAI
        672115008 CHANYA BUNRUEANG
        672115028 NINA BURGER
        662115016 NATTHAPHUM CHAIKHAN
        672115013 NATTHAN CHAMPATHIP
        672115042 RANTICHA CHUMJAI
        672115016 NATTHAPAT JAGKHURUANG
        672115049 ANAWAT JANDEE
        672115007 CHANCHAKORN JULLAPECH
        672115004 JITTIPAT KAEWIJIT
        662115039 MANAPAT KAEWLAI
        672115005 CHETSADA KANKARN
        672115001 KATIKA KANTHASON
        672115018 DALANPHOP KEAWSIRIPONG
        662115007 CHONCHANUN KHACHONPHURITHANAKUL
        672115045 VIRAWIT KONGTHONG
        672115046 SATTAPORN KOWARAKUN
        672115047 SAMAKOM MAKHIAO
        672115037 PHUTAWAN MUEANGMA
        672115006 CHANLACHAT PANYOYAI
        672115009 CHIDNUCHA POBKEEREE
        672115024 TAT PUTJORN
        672115014 NATTIKORN SAE-SUE
        672115011 NATTHAPOOM SAENGKAEW
        622115040 SUCHANUN SIRIJANYA
        672115010 NATANON SOMBOON
        672115019 THINNAPOP SRISOMBOON
        672115015 NATTAPON SUKKEAW
        672115012 NUT SUPAPORN
        672115002 KRITTAMETH TANSUWAN
        672115020 TECHIT WONGKITI
        672115048 SUKRITPONG WONGPANYA
        672115043 WASINPAT YANIN

    >java StuCom -s class_roaster67.csv 
Output: Command: java StuCom -s [input file] [first name]

    >java StuCom -s class_roaster67.csv sattaporn
Output: Found at index 31: 672115046 SATTAPORN KOWARAKUN

    >java StuCom -s class_roaster67.csv john
Output: Student with first name john not found.
