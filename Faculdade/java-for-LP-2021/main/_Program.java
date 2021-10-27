package main;
import cyanruntime.*;

import cyan.lang.*;

    /**
    Lucas Henrique de Araujo
    */

@SuppressWarnings( { "unused", "cast", "hiding" } )
public final class _Program extends _Any
 {

	private static final long serialVersionUID = -3424597554829409059L;
    static { 
        try {

          _Program.prototype = new _Program();
        }
        catch ( ExceptionInInitializerError e ) {
            System.out.println("Probably this prototype is referenced indirectly in a method called " + 
"in its 'init' method. This " + 
"happens in this example:\n" + 
"    object InitError\n" + 
"        func init { \n" + 
"            MakeError accessInitError;\n" + 
"        }\n" + 
"    end\n" + 
"Method 'accessInitError' is just\n" + 
"    func accessInitError { \n" + 
"        InitError prototypeName println; \n" + 
"    }\n" + 
"Then InitError is referenced before the 'init' " + 
"method has built the object that represents the " + 
"prototype"); 
       }

    }
        /**
    Lucas Henrique de Araujo
    */
    private     cyan.lang.CyInt _dedos;

    public     _Program() {

    this._dedos = CyInt.zero;

        } 

    public main._Program _new() {
         
            return new _Program();        
        } 

    public _Nil _run() {
        Ref<CyInt> _maos = new Ref<CyInt>();
        /* maos =  (          @pushCompilationContext(atisemAn_id_0, "restrictTo", main, "C:\C\LP-2021\main\Program.cyan", 9)  { (:  -> Int :)             let Int tmp398__ = 0; 
                        if !(tmp398__ >= 0 && tmp398__ <= 2) {
                self throw: ExceptionStr("In line 10 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression '0' should obey the restriction ' self >= 0 && self <= 2 '.  The expression value is $tmp398__")
            }            ^ tmp398__
 } eval         @popCompilationContext(atisemAn_id_0, "cyan.lang", "Int")  )  */
        _Fun__0____ tmp412 = new _Fun__0____(this);
        CyInt tmp411 = tmp412._eval();
        _maos.elem = tmp411;

        CyInt _teste;
        _teste = CyInt.one;
        CyInt tmp415 = _teste._plus( CyInt.one);
        CyString tmp414 = (new CyString("'teste + 1' == "))._plus_plus( tmp415);
        _Nil tmp413 = _Out.prototype._println_1( tmp414);
        CyBoolean tmp416 = CyBoolean.cyFalse;

        Ref<CyBoolean> _ok = new Ref<CyBoolean>();
        _ok.elem = tmp416;
        _Fun__1____ tmp417 = new _Fun__1____(this, _maos);
        _Fun__3____ tmp419 = new _Fun__3____(this, _ok);
        _Nil tmp418 = tmp417._catch_1( tmp419);
        CyBoolean tmp420 = _ok.elem._exclamation();
        if ( tmp420.b ) {
            _Nil tmp421 = (new CyString("Assert failed in line 21 of prototype 'main.Program'"))._println();
            _Nil tmp422 = (new CyString("Assert expression: 'ok'"))._println();
        }
        // end of if
        CyBoolean tmp424 = CyBoolean.cyFalse;
        CyBoolean tmp423 = _ok.elem._equal_equal( tmp424);
        if ( tmp423.b ) {
            _mindinhoELevantar();
            _anelarELevantar();
            _meioELevantar();
            _indicadorELevantar();
            _polegarELevantar();
        }
        // end of if
        /* ok = false */
        CyBoolean tmp425 = CyBoolean.cyFalse;
        _ok.elem = tmp425;
        _Fun__4____ tmp426 = new _Fun__4____(this, _maos);
        _Fun__6____ tmp428 = new _Fun__6____(this, _ok);
        _Nil tmp427 = tmp426._catch_1( tmp428);
        CyBoolean tmp429 = _ok.elem._exclamation();
        if ( tmp429.b ) {
            _Nil tmp430 = (new CyString("Assert failed in line 32 of prototype 'main.Program'"))._println();
            _Nil tmp431 = (new CyString("Assert expression: 'ok'"))._println();
        }
        // end of if
        CyBoolean tmp433 = CyBoolean.cyFalse;
        CyBoolean tmp432 = _ok.elem._equal_equal( tmp433);
        if ( tmp432.b ) {
            _mindinhoELevantar();
            _anelarELevantar();
            _meioELevantar();
            _indicadorELevantar();
            _polegarELevantar();
        }
        // end of if
        _Nil tmp434 = (new CyString("Foram levantados " + _dedos._asString().s + " dedos."))._println();
        return _Nil.prototype;
        } 

    public _Nil _mindinhoELevantar() {
        CyInt tmp437 = _dedos._plus( CyInt.one);
        CyString tmp436 = (new CyString("'dedos + 1' == "))._plus_plus( tmp437);
        _Nil tmp435 = _Out.prototype._println_1( tmp436);
        /* dedos =  (          @pushCompilationContext(atisemAn_id_10, "range", main, "C:\C\LP-2021\main\Program.cyan", 84)  ({ (: Int tmp401__ -> Int :)                         if tmp401__ < 0 || tmp401__ > 10 {
                self throw: ExceptionStr("In line 43 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is $tmp401__")
            }            ^ tmp401__
 } eval: (dedos + 1))         @popCompilationContext(atisemAn_id_10, "cyan.lang", "Int")  )  */
        _Fun__7____ tmp438 = new _Fun__7____(this);
        CyInt tmp440 = _dedos._plus( CyInt.one);
        CyInt tmp439 = tmp438._eval_1( tmp440);
        _dedos = tmp439;

        CyString _currentmethodfullname;
        _currentmethodfullname = (new CyString("mindinhoELevantar"));
        CyBoolean tmp442 = _currentmethodfullname._equal_equal( (new CyString("mindinhoDLevantar")));
        CyBoolean tmp441 = tmp442._exclamation();
        if ( tmp441.b ) {
            _Nil tmp443 = (new CyString("Assert failed in line 45 of prototype 'main.Program'"))._println();
            _Nil tmp444 = (new CyString("Assert expression: 'currentmethodfullname == \"mindinhoDLevantar\"'"))._println();
            _Nil tmp445 = (new CyString("'currentmethodfullname' = "))._print();
            _Nil tmp446 = _currentmethodfullname._println();
        }
        // end of if
        CyBoolean tmp447 = _currentmethodfullname._equal_equal( (new CyString("MINDINHOELEVANTAR")));

        CyBoolean _ok;
        _ok = tmp447;
        CyBoolean tmp448 = _ok._exclamation();
        if ( tmp448.b ) {
            _Nil tmp449 = (new CyString("Assert failed in line 47 of prototype 'main.Program'"))._println();
            _Nil tmp450 = (new CyString("Assert expression: 'ok'"))._println();
        }
        // end of if
        return _Nil.prototype;
        } 

    public _Nil _anelarELevantar() {
        /* dedos =  (          @pushCompilationContext(atisemAn_id_15, "range", main, "C:\C\LP-2021\main\Program.cyan", 84)  ({ (: Int tmp402__ -> Int :)                         if tmp402__ < 0 || tmp402__ > 10 {
                self throw: ExceptionStr("In line 50 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is $tmp402__")
            }            ^ tmp402__
 } eval: (dedos + 1))         @popCompilationContext(atisemAn_id_15, "cyan.lang", "Int")  )  */
        _Fun__8____ tmp451 = new _Fun__8____(this);
        CyInt tmp453 = _dedos._plus( CyInt.one);
        CyInt tmp452 = tmp451._eval_1( tmp453);
        _dedos = tmp452;

        CyString _currentmethodfullname;
        _currentmethodfullname = (new CyString("anelarELevantar"));
        _Nil tmp454 = (new CyString("" + _currentmethodfullname._asString().s + " foi chamado com sucesso"))._println();
        return _Nil.prototype;
        } 

    public _Nil _meioELevantar() {
        /* dedos =  (          @pushCompilationContext(atisemAn_id_17, "range", main, "C:\C\LP-2021\main\Program.cyan", 84)  ({ (: Int tmp403__ -> Int :)                         if tmp403__ < 0 || tmp403__ > 10 {
                self throw: ExceptionStr("In line 55 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is $tmp403__")
            }            ^ tmp403__
 } eval: (dedos + 1))         @popCompilationContext(atisemAn_id_17, "cyan.lang", "Int")  )  */
        _Fun__9____ tmp455 = new _Fun__9____(this);
        CyInt tmp457 = _dedos._plus( CyInt.one);
        CyInt tmp456 = tmp455._eval_1( tmp457);
        _dedos = tmp456;

        CyString _currentmethodfullname;
        _currentmethodfullname = (new CyString("meioELevantar"));
        _Nil tmp458 = (new CyString("" + _currentmethodfullname._asString().s + " foi chamado com sucesso"))._println();
        return _Nil.prototype;
        } 

    public _Nil _indicadorELevantar() {
        /* dedos =  (          @pushCompilationContext(atisemAn_id_19, "range", main, "C:\C\LP-2021\main\Program.cyan", 84)  ({ (: Int tmp404__ -> Int :)                         if tmp404__ < 0 || tmp404__ > 10 {
                self throw: ExceptionStr("In line 60 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is $tmp404__")
            }            ^ tmp404__
 } eval: (dedos + 1))         @popCompilationContext(atisemAn_id_19, "cyan.lang", "Int")  )  */
        _Fun__10____ tmp459 = new _Fun__10____(this);
        CyInt tmp461 = _dedos._plus( CyInt.one);
        CyInt tmp460 = tmp459._eval_1( tmp461);
        _dedos = tmp460;

        CyString _currentmethodfullname;
        _currentmethodfullname = (new CyString("indicadorELevantar"));
        _Nil tmp462 = (new CyString("" + _currentmethodfullname._asString().s + " foi chamado com sucesso"))._println();
        return _Nil.prototype;
        } 

    public _Nil _polegarELevantar() {
        /* dedos =  (          @pushCompilationContext(atisemAn_id_21, "range", main, "C:\C\LP-2021\main\Program.cyan", 84)  ({ (: Int tmp405__ -> Int :)                         if tmp405__ < 0 || tmp405__ > 10 {
                self throw: ExceptionStr("In line 65 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is $tmp405__")
            }            ^ tmp405__
 } eval: (dedos + 1))         @popCompilationContext(atisemAn_id_21, "cyan.lang", "Int")  )  */
        _Fun__11____ tmp463 = new _Fun__11____(this);
        CyInt tmp465 = _dedos._plus( CyInt.one);
        CyInt tmp464 = tmp463._eval_1( tmp465);
        _dedos = tmp464;

        CyString _currentmethodfullname;
        _currentmethodfullname = (new CyString("polegarELevantar"));
        _Nil tmp466 = (new CyString("" + _currentmethodfullname._asString().s + " foi chamado com sucesso"))._println();
        return _Nil.prototype;
        } 

    public _Nil _mindinhoDLevantar() {
        /* dedos =  (          @pushCompilationContext(atisemAn_id_23, "range", main, "C:\C\LP-2021\main\Program.cyan", 84)  ({ (: Int tmp406__ -> Int :)                         if tmp406__ < 0 || tmp406__ > 10 {
                self throw: ExceptionStr("In line 70 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is $tmp406__")
            }            ^ tmp406__
 } eval: (dedos + 1))         @popCompilationContext(atisemAn_id_23, "cyan.lang", "Int")  )  */
        _Fun__12____ tmp467 = new _Fun__12____(this);
        CyInt tmp469 = _dedos._plus( CyInt.one);
        CyInt tmp468 = tmp467._eval_1( tmp469);
        _dedos = tmp468;
        return _Nil.prototype;
        } 

    public _Nil _anelarDLevantar() {
        /* dedos =  (          @pushCompilationContext(atisemAn_id_24, "range", main, "C:\C\LP-2021\main\Program.cyan", 84)  ({ (: Int tmp407__ -> Int :)                         if tmp407__ < 0 || tmp407__ > 10 {
                self throw: ExceptionStr("In line 73 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is $tmp407__")
            }            ^ tmp407__
 } eval: (dedos + 1))         @popCompilationContext(atisemAn_id_24, "cyan.lang", "Int")  )  */
        _Fun__13____ tmp470 = new _Fun__13____(this);
        CyInt tmp472 = _dedos._plus( CyInt.one);
        CyInt tmp471 = tmp470._eval_1( tmp472);
        _dedos = tmp471;
        return _Nil.prototype;
        } 

    public _Nil _meioDLevantar() {
        /* dedos =  (          @pushCompilationContext(atisemAn_id_25, "range", main, "C:\C\LP-2021\main\Program.cyan", 84)  ({ (: Int tmp408__ -> Int :)                         if tmp408__ < 0 || tmp408__ > 10 {
                self throw: ExceptionStr("In line 76 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is $tmp408__")
            }            ^ tmp408__
 } eval: (dedos + 1))         @popCompilationContext(atisemAn_id_25, "cyan.lang", "Int")  )  */
        _Fun__14____ tmp473 = new _Fun__14____(this);
        CyInt tmp475 = _dedos._plus( CyInt.one);
        CyInt tmp474 = tmp473._eval_1( tmp475);
        _dedos = tmp474;
        return _Nil.prototype;
        } 

    public _Nil _indicadorDLevantar() {
        /* dedos =  (          @pushCompilationContext(atisemAn_id_26, "range", main, "C:\C\LP-2021\main\Program.cyan", 84)  ({ (: Int tmp409__ -> Int :)                         if tmp409__ < 0 || tmp409__ > 10 {
                self throw: ExceptionStr("In line 79 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is $tmp409__")
            }            ^ tmp409__
 } eval: (dedos + 1))         @popCompilationContext(atisemAn_id_26, "cyan.lang", "Int")  )  */
        _Fun__15____ tmp476 = new _Fun__15____(this);
        CyInt tmp478 = _dedos._plus( CyInt.one);
        CyInt tmp477 = tmp476._eval_1( tmp478);
        _dedos = tmp477;
        return _Nil.prototype;
        } 

    public _Nil _polegarDLevantar() {
        /* dedos =  (          @pushCompilationContext(atisemAn_id_27, "range", main, "C:\C\LP-2021\main\Program.cyan", 84)  ({ (: Int tmp410__ -> Int :)                         if tmp410__ < 0 || tmp410__ > 10 {
                self throw: ExceptionStr("In line 82 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is $tmp410__")
            }            ^ tmp410__
 } eval: (dedos + 1))         @popCompilationContext(atisemAn_id_27, "cyan.lang", "Int")  )  */
        _Fun__16____ tmp479 = new _Fun__16____(this);
        CyInt tmp481 = _dedos._plus( CyInt.one);
        CyInt tmp480 = tmp479._eval_1( tmp481);
        _dedos = tmp480;
        return _Nil.prototype;
        } 

    public @Override main._Program _prototype() {
         return prototype;
        
        } 

    public @Override main._Program _clone() {
        
        try {
            return (_Program ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
        } 

    public @Override _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getFeatureListNameDoesNotCollide____() {
        _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT tmp482 = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();

        return tmp482;
        } 

    public @Override _Array_LT_GP__Any_GT _getAnnotListNameDoesNotCollide____() {
        _Array_LT_GP__Any_GT tmp483 = new _Array_LT_GP__Any_GT();

        return tmp483;
        } 

    public @Override _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getSlotFeatureListNameDoesNotCollide____() {
        _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT tmp484 = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();

        _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _slotFeatureList__name__does__not__collide____;
        _slotFeatureList__name__does__not__collide____ = tmp484;

        return _slotFeatureList__name__does__not__collide____;
        } 
    public static _Program prototype;
    private static _Fun__0____ prototypeFun_0__;

    static final String []fieldListFun_0__ = { "dedos" };
    static final String []fieldTypeListFun_0__ = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_0__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_0__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_0__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_0__ = { 
        new CyString("eval"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__1____ prototypeFun_1__;

    static final String []fieldListFun_1__ = { "dedos" };
    static final String []fieldTypeListFun_1__ = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_1__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_1__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_1__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_1__ = { 
        new CyString("eval"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__2____ prototypeFun_2__;

    static final String []fieldListFun_2__ = { "dedos" };
    static final String []fieldTypeListFun_2__ = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_2__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_2__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_2__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_2__ = { 
        new CyString("eval"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__3____ prototypeFun_3__;

    static final String []fieldListFun_3__ = { "dedos" };
    static final String []fieldTypeListFun_3__ = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_3__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_3__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_3__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_3__ = { 
        new CyString("eval: CyException"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__4____ prototypeFun_4__;

    static final String []fieldListFun_4__ = { "dedos" };
    static final String []fieldTypeListFun_4__ = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_4__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_4__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_4__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_4__ = { 
        new CyString("eval"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__5____ prototypeFun_5__;

    static final String []fieldListFun_5__ = { "dedos" };
    static final String []fieldTypeListFun_5__ = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_5__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_5__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_5__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_5__ = { 
        new CyString("eval"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__6____ prototypeFun_6__;

    static final String []fieldListFun_6__ = { "dedos" };
    static final String []fieldTypeListFun_6__ = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_6__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_6__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_6__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_6__ = { 
        new CyString("eval: CyException"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__7____ prototypeFun_7__;

    static final String []fieldListFun_7__ = { "dedos" };
    static final String []fieldTypeListFun_7__ = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_7__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_7__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_7__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_7__ = { 
        new CyString("eval: Int"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__8____ prototypeFun_8__;

    static final String []fieldListFun_8__ = { "dedos" };
    static final String []fieldTypeListFun_8__ = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_8__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_8__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_8__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_8__ = { 
        new CyString("eval: Int"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__9____ prototypeFun_9__;

    static final String []fieldListFun_9__ = { "dedos" };
    static final String []fieldTypeListFun_9__ = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_9__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_9__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_9__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_9__ = { 
        new CyString("eval: Int"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__10____ prototypeFun_10__;

    static final String []fieldListFun_10__ = { "dedos" };
    static final String []fieldTypeListFun_10__ = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_10__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_10__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_10__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_10__ = { 
        new CyString("eval: Int"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__11____ prototypeFun_11__;

    static final String []fieldListFun_11__ = { "dedos" };
    static final String []fieldTypeListFun_11__ = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_11__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_11__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_11__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_11__ = { 
        new CyString("eval: Int"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__12____ prototypeFun_12__;

    static final String []fieldListFun_12__ = { "dedos" };
    static final String []fieldTypeListFun_12__ = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_12__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_12__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_12__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_12__ = { 
        new CyString("eval: Int"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__13____ prototypeFun_13__;

    static final String []fieldListFun_13__ = { "dedos" };
    static final String []fieldTypeListFun_13__ = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_13__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_13__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_13__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_13__ = { 
        new CyString("eval: Int"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__14____ prototypeFun_14__;

    static final String []fieldListFun_14__ = { "dedos" };
    static final String []fieldTypeListFun_14__ = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_14__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_14__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_14__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_14__ = { 
        new CyString("eval: Int"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__15____ prototypeFun_15__;

    static final String []fieldListFun_15__ = { "dedos" };
    static final String []fieldTypeListFun_15__ = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_15__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_15__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_15__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_15__ = { 
        new CyString("eval: Int"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__16____ prototypeFun_16__;

    static final String []fieldListFun_16__ = { "dedos" };
    static final String []fieldTypeListFun_16__ = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_16__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_16__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_16__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_16__ = { 
        new CyString("eval: Int"),
        new CyString("clone"),
        new CyString("prototype")
        };


    static final String []fieldList = { "dedos" };
    static final String []fieldTypeList = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureList = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotList = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureList = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameList = { 
        new CyString("run"),
        new CyString("mindinhoELevantar"),
        new CyString("anelarELevantar"),
        new CyString("meioELevantar"),
        new CyString("indicadorELevantar"),
        new CyString("polegarELevantar"),
        new CyString("mindinhoDLevantar"),
        new CyString("anelarDLevantar"),
        new CyString("meioDLevantar"),
        new CyString("indicadorDLevantar"),
        new CyString("polegarDLevantar"),
        new CyString("prototype"),
        new CyString("clone"),
        new CyString("getFeatureListNameDoesNotCollide__"),
        new CyString("getAnnotListNameDoesNotCollide__"),
        new CyString("getSlotFeatureListNameDoesNotCollide__")
        };
    @Override protected CyString [] getMethodNameList2() { return methodNameList; }
    @Override protected String [] getFieldList2() { return fieldList; }

    private CyBoolean _eq_1_super__( Object p0 ) { return super._eq_1( p0 ); }
    private CyBoolean _neq_1_super__( Object p0 ) { return super._neq_1( p0 ); }
    private _Any _prototype_super__() { return super._prototype(); }
    private CyString _prototypeName_super__() { return super._prototypeName(); }
    private _Any _prototypeParent_super__() { return super._prototypeParent(); }
    private CyString _prototypePackageName_super__() { return super._prototypePackageName(); }
    private CyBoolean _isInterface_super__() { return super._isInterface(); }
    private CyBoolean _isA_1_super__( _Any p0 ) { return super._isA_1( p0 ); }
    private CyBoolean _notIsA_1_super__( _Any p0 ) { return super._notIsA_1( p0 ); }
    private Object _throw_1_super__( _CyException p0 ) { return super._throw_1( p0 ); }
    private _Any _clone_super__() { return super._clone(); }
    private CyString _plus_plus_super__(_Any _other) { return super._plus_plus(_other); }
    private CyString _asString_super__() { return super._asString(); }
    private CyString _asString_1_super__( CyInt p0 ) { return super._asString_1( p0 ); }
    private CyString _asStringThisOnly_1_super__( CyInt p0 ) { return super._asStringThisOnly_1( p0 ); }
    private CyString _asStringQuoteIfString_super__() { return super._asStringQuoteIfString(); }
    private CyBoolean _equal_equal_super__(Object _other) { return super._equal_equal(_other); }
    private CyBoolean _equal_equal_equal_super__(Object _other) { return super._equal_equal_equal(_other); }
    private CyBoolean _exclamation_equal_equal_super__(Object _other) { return super._exclamation_equal_equal(_other); }
    private CyBoolean _exclamation_equal_super__(Object _other) { return super._exclamation_equal(_other); }
    private CyBoolean _isCase_1_super__( _Any p0 ) { return super._isCase_1( p0 ); }
    private _Nil _assertxx_1_super__( CyBoolean p0 ) { return super._assertxx_1( p0 ); }
    private _Nil _assertxx_2_super__( CyBoolean p0, CyString p1 ) { return super._assertxx_2( p0, p1 ); }
    private _Nil _print_super__() { return super._print(); }
    private _Nil _println_super__() { return super._println(); }
    private _Nil _printspc_super__() { return super._printspc(); }
    private _Nil _printc_super__() { return super._printc(); }
    private _Any _toAny_1_super__( Object p0 ) { return super._toAny_1( p0 ); }
    private _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _featureList_super__() { return super._featureList(); }
    private _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _featureList_1_super__( CyString p0 ) { return super._featureList_1( p0 ); }
    private _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _slotFeatureList_super__() { return super._slotFeatureList(); }
    private _Array_LT_GP__Any_GT _annotList_super__() { return super._annotList(); }
    private _Array_LT_GP__Any_GT _annotList_1_super__( CyString p0 ) { return super._annotList_1( p0 ); }
    private Object _doesNotUnderstand_2_super__( CyString p0, _Array_LT_GP__Array_LT_GP_Object_GT_GT p1 ) { return super._doesNotUnderstand_2( p0, p1 ); }
    private _Any _functionForMethod_1_super__( CyString p0 ) { return super._functionForMethod_1( p0 ); }
    private _Any _functionForMethodWithSelf_1_super__( CyString p0 ) { return super._functionForMethodWithSelf_1( p0 ); }
    private CyInt _hashCode_super__() { return super._hashCode(); }
    private _Array_LT_GP_CyString_GT _getMethodNameList_super__() { return super._getMethodNameList(); }
    private _Array_LT_GP_CyString_GT _getFieldNameList_super__() { return super._getFieldNameList(); }
    private _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getFeatureListNameDoesNotCollide_____super__() { return super._getFeatureListNameDoesNotCollide____(); }
    private _Array_LT_GP__Any_GT _getAnnotListNameDoesNotCollide_____super__() { return super._getAnnotListNameDoesNotCollide____(); }
    private _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getSlotFeatureListNameDoesNotCollide_____super__() { return super._getSlotFeatureListNameDoesNotCollide____(); }
    
    @SuppressWarnings( { "unused", "cast", "hiding" } )
private class _Fun__0____ extends cyan.lang._Function_LT_GP_CyInt_GT
 {

	private static final long serialVersionUID = 8886654447734910976L;
        public _Fun__0____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        public _Fun__0____() { }

        public         _Fun__0____(main._Program _self____)  {

            
        this._self____ = _self____;
        
            } 

        public _Fun__0____  _new_1( main._Program _self____ )  {
             
            return new _Fun__0____(_self____);
        
            } 

        public @Override CyInt _eval() {

            CyInt _tmp398____;
            _tmp398____ = CyInt.zero;
            CyBoolean tmp487 = _tmp398____._greaterThan_equal( CyInt.zero);
            CyBoolean tmp486;
            if ( tmp487.b ) { 
                CyBoolean tmp488 = _tmp398____._lessThan_equal( CyInt.two);
                tmp486 = new CyBoolean(tmp488.b );
            }
            else {
                tmp486 = new CyBoolean(false);
            }
            CyBoolean tmp485 = tmp486._exclamation();
            if ( tmp485.b ) {
                _ExceptionStr tmp490 = new _ExceptionStr( (new CyString("In line 10 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression '0' should obey the restriction ' self >= 0 && self <= 2 '.  The expression value is " + _tmp398____._asString().s)));                Object tmp489 = _self____._throw_1( tmp490);
                return null;
            }
            // end of if

            return _tmp398____;
            } 

        public @Override _Fun__0____ _clone() {
            
        try {
            return (_Fun__0____ ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
            } 

        public @Override _Fun__0____ _prototype() {
             return prototypeFun_0__;
        
            } 
    public String []getFieldTypeList() { 
        return fieldTypeListFun_0__;
    }
    public String []getFieldList() { 
        return fieldListFun_0__;
    }
    public String asString(int ident) {
        String s =  "Fun_0__ {\n";
        s = s + "super(cyan.lang.Function<Int>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP_CyInt_GT.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Fun_0__";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureListFun_0__; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureListFun_0__; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotListFun_0__; }

}

    
    @SuppressWarnings( { "unused", "cast", "hiding" } )
private class _Fun__1____ extends cyan.lang._Function_LT_GP__Nil_GT
 {

	private static final long serialVersionUID = 279144571410163665L;
        public _Fun__1____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        private         Ref<cyan.lang.CyInt> _maos;
        public _Fun__1____() { }

        public         _Fun__1____(main._Program _self____, Ref<CyInt> _maos)  {

            
        this._self____ = _self____;
        this._maos = _maos;
        
            } 

        public _Fun__1____  _new_2( main._Program _self____, Ref<CyInt> _maos )  {
             
            return new _Fun__1____(_self____, _maos);
        
            } 

        public @Override _Nil _eval() {
            /* maos = ( (              @pushCompilationContext(atisemAn_id_3, "restrictTo", main, "C:\C\LP-2021\main\Program.cyan", 9)  Fun_2__(self__) eval             @popCompilationContext(atisemAn_id_3, "cyan.lang", "Int")  ) ) */
            _Fun__2____ tmp492 = new _Fun__2____( _self____);            CyInt tmp491 = tmp492._eval();
            _maos.elem = tmp491;
            return _Nil.prototype;
            } 

        public @Override _Fun__1____ _clone() {
            
        try {
            return (_Fun__1____ ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
            } 

        public @Override _Fun__1____ _prototype() {
             return prototypeFun_1__;
        
            } 
    public String []getFieldTypeList() { 
        return fieldTypeListFun_1__;
    }
    public String []getFieldList() { 
        return fieldListFun_1__;
    }
    public String asString(int ident) {
        String s =  "Fun_1__ {\n";
        s = s + "super(cyan.lang.Function<Nil>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        s = s + getWhiteSpaces(ident) + "maos: " + _maos.elem._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP__Nil_GT.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Fun_1__";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureListFun_1__; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureListFun_1__; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotListFun_1__; }

}

    
    @SuppressWarnings( { "unused", "cast", "hiding" } )
private class _Fun__2____ extends cyan.lang._Function_LT_GP_CyInt_GT
 {

	private static final long serialVersionUID = -573592701003332792L;
        public _Fun__2____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        public _Fun__2____() { }

        public         _Fun__2____(main._Program _self____)  {

            
        this._self____ = _self____;
        
            } 

        public _Fun__2____  _new_1( main._Program _self____ )  {
             
            return new _Fun__2____(_self____);
        
            } 

        public @Override CyInt _eval() {
            CyInt tmp493 = CyInt.one._minus();

            CyInt _tmp399____;
            _tmp399____ = tmp493;
            CyBoolean tmp496 = _tmp399____._greaterThan_equal( CyInt.zero);
            CyBoolean tmp495;
            if ( tmp496.b ) { 
                CyBoolean tmp497 = _tmp399____._lessThan_equal( CyInt.two);
                tmp495 = new CyBoolean(tmp497.b );
            }
            else {
                tmp495 = new CyBoolean(false);
            }
            CyBoolean tmp494 = tmp495._exclamation();
            if ( tmp494.b ) {
                _ExceptionStr tmp499 = new _ExceptionStr( (new CyString("In line 17 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression '-1' should obey the restriction ' self >= 0 && self <= 2 '.  The expression value is " + _tmp399____._asString().s)));                Object tmp498 = _self____._throw_1( tmp499);
                return null;
            }
            // end of if

            return _tmp399____;
            } 

        public @Override _Fun__2____ _clone() {
            
        try {
            return (_Fun__2____ ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
            } 

        public @Override _Fun__2____ _prototype() {
             return prototypeFun_2__;
        
            } 
    public String []getFieldTypeList() { 
        return fieldTypeListFun_2__;
    }
    public String []getFieldList() { 
        return fieldListFun_2__;
    }
    public String asString(int ident) {
        String s =  "Fun_2__ {\n";
        s = s + "super(cyan.lang.Function<Int>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP_CyInt_GT.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Fun_2__";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureListFun_2__; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureListFun_2__; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotListFun_2__; }

}

    
    @SuppressWarnings( { "unused", "cast", "hiding" } )
private class _Fun__3____ extends cyan.lang._Function_LT_GP__CyException_GP__Nil_GT
 {

	private static final long serialVersionUID = -7392324740483831445L;
        public _Fun__3____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        private         Ref<cyan.lang.CyBoolean> _ok;
        public _Fun__3____() { }

        public         _Fun__3____(main._Program _self____, Ref<CyBoolean> _ok)  {

            
        this._self____ = _self____;
        this._ok = _ok;
        
            } 

        public _Fun__3____  _new_2( main._Program _self____, Ref<CyBoolean> _ok )  {
             
            return new _Fun__3____(_self____, _ok);
        
            } 

        public @Override _Nil  _eval_1( _CyException _e )  {
            /* ok = true */
            CyBoolean tmp500 = CyBoolean.cyTrue;
            _ok.elem = tmp500;
            return _Nil.prototype;
            } 

        public @Override _Fun__3____ _clone() {
            
        try {
            return (_Fun__3____ ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
            } 

        public @Override _Fun__3____ _prototype() {
             return prototypeFun_3__;
        
            } 
    public String []getFieldTypeList() { 
        return fieldTypeListFun_3__;
    }
    public String []getFieldList() { 
        return fieldListFun_3__;
    }
    public String asString(int ident) {
        String s =  "Fun_3__ {\n";
        s = s + "super(cyan.lang.Function<CyException,Nil>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        s = s + getWhiteSpaces(ident) + "ok: " + _ok.elem._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP__CyException_GP__Nil_GT.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Fun_3__";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureListFun_3__; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureListFun_3__; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotListFun_3__; }

}

    
    @SuppressWarnings( { "unused", "cast", "hiding" } )
private class _Fun__4____ extends cyan.lang._Function_LT_GP__Nil_GT
 {

	private static final long serialVersionUID = 2995669229409517888L;
        public _Fun__4____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        private         Ref<cyan.lang.CyInt> _maos;
        public _Fun__4____() { }

        public         _Fun__4____(main._Program _self____, Ref<CyInt> _maos)  {

            
        this._self____ = _self____;
        this._maos = _maos;
        
            } 

        public _Fun__4____  _new_2( main._Program _self____, Ref<CyInt> _maos )  {
             
            return new _Fun__4____(_self____, _maos);
        
            } 

        public @Override _Nil _eval() {
            /* maos = ( (              @pushCompilationContext(atisemAn_id_6, "restrictTo", main, "C:\C\LP-2021\main\Program.cyan", 9)  Fun_5__(self__, maos) eval             @popCompilationContext(atisemAn_id_6, "cyan.lang", "Int")  ) ) */
            _Fun__5____ tmp502 = new _Fun__5____( _self____, _maos);            CyInt tmp501 = tmp502._eval();
            _maos.elem = tmp501;
            return _Nil.prototype;
            } 

        public @Override _Fun__4____ _clone() {
            
        try {
            return (_Fun__4____ ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
            } 

        public @Override _Fun__4____ _prototype() {
             return prototypeFun_4__;
        
            } 
    public String []getFieldTypeList() { 
        return fieldTypeListFun_4__;
    }
    public String []getFieldList() { 
        return fieldListFun_4__;
    }
    public String asString(int ident) {
        String s =  "Fun_4__ {\n";
        s = s + "super(cyan.lang.Function<Nil>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        s = s + getWhiteSpaces(ident) + "maos: " + _maos.elem._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP__Nil_GT.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Fun_4__";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureListFun_4__; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureListFun_4__; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotListFun_4__; }

}

    
    @SuppressWarnings( { "unused", "cast", "hiding" } )
private class _Fun__5____ extends cyan.lang._Function_LT_GP_CyInt_GT
 {

	private static final long serialVersionUID = -1577122236011089459L;
        public _Fun__5____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        private         Ref<cyan.lang.CyInt> _maos;
        public _Fun__5____() { }

        public         _Fun__5____(main._Program _self____, Ref<CyInt> _maos)  {

            
        this._self____ = _self____;
        this._maos = _maos;
        
            } 

        public _Fun__5____  _new_2( main._Program _self____, Ref<CyInt> _maos )  {
             
            return new _Fun__5____(_self____, _maos);
        
            } 

        public @Override CyInt _eval() {
            CyInt tmp503 = _maos.elem._plus( CyInt.one);

            CyInt _tmp400____;
            _tmp400____ = tmp503;
            CyBoolean tmp506 = _tmp400____._greaterThan_equal( CyInt.zero);
            CyBoolean tmp505;
            if ( tmp506.b ) { 
                CyBoolean tmp507 = _tmp400____._lessThan_equal( CyInt.two);
                tmp505 = new CyBoolean(tmp507.b );
            }
            else {
                tmp505 = new CyBoolean(false);
            }
            CyBoolean tmp504 = tmp505._exclamation();
            if ( tmp504.b ) {
                _ExceptionStr tmp509 = new _ExceptionStr( (new CyString("In line 28 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'maos + 1' should obey the restriction ' self >= 0 && self <= 2 '.  The expression value is " + _tmp400____._asString().s)));                Object tmp508 = _self____._throw_1( tmp509);
                return null;
            }
            // end of if

            return _tmp400____;
            } 

        public @Override _Fun__5____ _clone() {
            
        try {
            return (_Fun__5____ ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
            } 

        public @Override _Fun__5____ _prototype() {
             return prototypeFun_5__;
        
            } 
    public String []getFieldTypeList() { 
        return fieldTypeListFun_5__;
    }
    public String []getFieldList() { 
        return fieldListFun_5__;
    }
    public String asString(int ident) {
        String s =  "Fun_5__ {\n";
        s = s + "super(cyan.lang.Function<Int>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        s = s + getWhiteSpaces(ident) + "maos: " + _maos.elem._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP_CyInt_GT.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Fun_5__";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureListFun_5__; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureListFun_5__; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotListFun_5__; }

}

    
    @SuppressWarnings( { "unused", "cast", "hiding" } )
private class _Fun__6____ extends cyan.lang._Function_LT_GP__CyException_GP__Nil_GT
 {

	private static final long serialVersionUID = 2062021639695196696L;
        public _Fun__6____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        private         Ref<cyan.lang.CyBoolean> _ok;
        public _Fun__6____() { }

        public         _Fun__6____(main._Program _self____, Ref<CyBoolean> _ok)  {

            
        this._self____ = _self____;
        this._ok = _ok;
        
            } 

        public _Fun__6____  _new_2( main._Program _self____, Ref<CyBoolean> _ok )  {
             
            return new _Fun__6____(_self____, _ok);
        
            } 

        public @Override _Nil  _eval_1( _CyException _e )  {
            /* ok = true */
            CyBoolean tmp510 = CyBoolean.cyTrue;
            _ok.elem = tmp510;
            return _Nil.prototype;
            } 

        public @Override _Fun__6____ _clone() {
            
        try {
            return (_Fun__6____ ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
            } 

        public @Override _Fun__6____ _prototype() {
             return prototypeFun_6__;
        
            } 
    public String []getFieldTypeList() { 
        return fieldTypeListFun_6__;
    }
    public String []getFieldList() { 
        return fieldListFun_6__;
    }
    public String asString(int ident) {
        String s =  "Fun_6__ {\n";
        s = s + "super(cyan.lang.Function<CyException,Nil>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        s = s + getWhiteSpaces(ident) + "ok: " + _ok.elem._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP__CyException_GP__Nil_GT.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Fun_6__";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureListFun_6__; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureListFun_6__; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotListFun_6__; }

}

    
    @SuppressWarnings( { "unused", "cast", "hiding" } )
private class _Fun__7____ extends cyan.lang._Function_LT_GP_CyInt_GP_CyInt_GT
 {

	private static final long serialVersionUID = 192333485550123303L;
        public _Fun__7____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        public _Fun__7____() { }

        public         _Fun__7____(main._Program _self____)  {

            
        this._self____ = _self____;
        
            } 

        public _Fun__7____  _new_1( main._Program _self____ )  {
             
            return new _Fun__7____(_self____);
        
            } 

        public @Override CyInt  _eval_1( CyInt _tmp401____ )  {
            CyBoolean tmp512 = _tmp401____._lessThan( CyInt.zero);
            CyBoolean tmp511;
            if ( ! tmp512.b ) { 
                CyBoolean tmp513 = _tmp401____._greaterThan( (new CyInt( (int ) 10)));
                tmp511 = new CyBoolean(tmp513.b );
            }
            else {
                tmp511 = new CyBoolean(true);
            }
            if ( tmp511.b ) {
                _ExceptionStr tmp515 = new _ExceptionStr( (new CyString("In line 43 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is " + _tmp401____._asString().s)));                Object tmp514 = _self____._throw_1( tmp515);
                return null;
            }
            // end of if

            return _tmp401____;
            } 

        public @Override _Fun__7____ _clone() {
            
        try {
            return (_Fun__7____ ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
            } 

        public @Override _Fun__7____ _prototype() {
             return prototypeFun_7__;
        
            } 
    public String []getFieldTypeList() { 
        return fieldTypeListFun_7__;
    }
    public String []getFieldList() { 
        return fieldListFun_7__;
    }
    public String asString(int ident) {
        String s =  "Fun_7__ {\n";
        s = s + "super(cyan.lang.Function<Int,Int>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP_CyInt_GP_CyInt_GT.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Fun_7__";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureListFun_7__; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureListFun_7__; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotListFun_7__; }

}

    
    @SuppressWarnings( { "unused", "cast", "hiding" } )
private class _Fun__8____ extends cyan.lang._Function_LT_GP_CyInt_GP_CyInt_GT
 {

	private static final long serialVersionUID = -2460209995715011072L;
        public _Fun__8____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        public _Fun__8____() { }

        public         _Fun__8____(main._Program _self____)  {

            
        this._self____ = _self____;
        
            } 

        public _Fun__8____  _new_1( main._Program _self____ )  {
             
            return new _Fun__8____(_self____);
        
            } 

        public @Override CyInt  _eval_1( CyInt _tmp402____ )  {
            CyBoolean tmp517 = _tmp402____._lessThan( CyInt.zero);
            CyBoolean tmp516;
            if ( ! tmp517.b ) { 
                CyBoolean tmp518 = _tmp402____._greaterThan( (new CyInt( (int ) 10)));
                tmp516 = new CyBoolean(tmp518.b );
            }
            else {
                tmp516 = new CyBoolean(true);
            }
            if ( tmp516.b ) {
                _ExceptionStr tmp520 = new _ExceptionStr( (new CyString("In line 50 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is " + _tmp402____._asString().s)));                Object tmp519 = _self____._throw_1( tmp520);
                return null;
            }
            // end of if

            return _tmp402____;
            } 

        public @Override _Fun__8____ _clone() {
            
        try {
            return (_Fun__8____ ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
            } 

        public @Override _Fun__8____ _prototype() {
             return prototypeFun_8__;
        
            } 
    public String []getFieldTypeList() { 
        return fieldTypeListFun_8__;
    }
    public String []getFieldList() { 
        return fieldListFun_8__;
    }
    public String asString(int ident) {
        String s =  "Fun_8__ {\n";
        s = s + "super(cyan.lang.Function<Int,Int>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP_CyInt_GP_CyInt_GT.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Fun_8__";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureListFun_8__; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureListFun_8__; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotListFun_8__; }

}

    
    @SuppressWarnings( { "unused", "cast", "hiding" } )
private class _Fun__9____ extends cyan.lang._Function_LT_GP_CyInt_GP_CyInt_GT
 {

	private static final long serialVersionUID = -1169632101368907863L;
        public _Fun__9____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        public _Fun__9____() { }

        public         _Fun__9____(main._Program _self____)  {

            
        this._self____ = _self____;
        
            } 

        public _Fun__9____  _new_1( main._Program _self____ )  {
             
            return new _Fun__9____(_self____);
        
            } 

        public @Override CyInt  _eval_1( CyInt _tmp403____ )  {
            CyBoolean tmp522 = _tmp403____._lessThan( CyInt.zero);
            CyBoolean tmp521;
            if ( ! tmp522.b ) { 
                CyBoolean tmp523 = _tmp403____._greaterThan( (new CyInt( (int ) 10)));
                tmp521 = new CyBoolean(tmp523.b );
            }
            else {
                tmp521 = new CyBoolean(true);
            }
            if ( tmp521.b ) {
                _ExceptionStr tmp525 = new _ExceptionStr( (new CyString("In line 55 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is " + _tmp403____._asString().s)));                Object tmp524 = _self____._throw_1( tmp525);
                return null;
            }
            // end of if

            return _tmp403____;
            } 

        public @Override _Fun__9____ _clone() {
            
        try {
            return (_Fun__9____ ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
            } 

        public @Override _Fun__9____ _prototype() {
             return prototypeFun_9__;
        
            } 
    public String []getFieldTypeList() { 
        return fieldTypeListFun_9__;
    }
    public String []getFieldList() { 
        return fieldListFun_9__;
    }
    public String asString(int ident) {
        String s =  "Fun_9__ {\n";
        s = s + "super(cyan.lang.Function<Int,Int>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP_CyInt_GP_CyInt_GT.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Fun_9__";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureListFun_9__; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureListFun_9__; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotListFun_9__; }

}

    
    @SuppressWarnings( { "unused", "cast", "hiding" } )
private class _Fun__10____ extends cyan.lang._Function_LT_GP_CyInt_GP_CyInt_GT
 {

	private static final long serialVersionUID = 4114088213751597215L;
        public _Fun__10____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        public _Fun__10____() { }

        public         _Fun__10____(main._Program _self____)  {

            
        this._self____ = _self____;
        
            } 

        public _Fun__10____  _new_1( main._Program _self____ )  {
             
            return new _Fun__10____(_self____);
        
            } 

        public @Override CyInt  _eval_1( CyInt _tmp404____ )  {
            CyBoolean tmp527 = _tmp404____._lessThan( CyInt.zero);
            CyBoolean tmp526;
            if ( ! tmp527.b ) { 
                CyBoolean tmp528 = _tmp404____._greaterThan( (new CyInt( (int ) 10)));
                tmp526 = new CyBoolean(tmp528.b );
            }
            else {
                tmp526 = new CyBoolean(true);
            }
            if ( tmp526.b ) {
                _ExceptionStr tmp530 = new _ExceptionStr( (new CyString("In line 60 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is " + _tmp404____._asString().s)));                Object tmp529 = _self____._throw_1( tmp530);
                return null;
            }
            // end of if

            return _tmp404____;
            } 

        public @Override _Fun__10____ _clone() {
            
        try {
            return (_Fun__10____ ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
            } 

        public @Override _Fun__10____ _prototype() {
             return prototypeFun_10__;
        
            } 
    public String []getFieldTypeList() { 
        return fieldTypeListFun_10__;
    }
    public String []getFieldList() { 
        return fieldListFun_10__;
    }
    public String asString(int ident) {
        String s =  "Fun_10__ {\n";
        s = s + "super(cyan.lang.Function<Int,Int>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP_CyInt_GP_CyInt_GT.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Fun_10__";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureListFun_10__; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureListFun_10__; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotListFun_10__; }

}

    
    @SuppressWarnings( { "unused", "cast", "hiding" } )
private class _Fun__11____ extends cyan.lang._Function_LT_GP_CyInt_GP_CyInt_GT
 {

	private static final long serialVersionUID = -1887048267758993408L;
        public _Fun__11____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        public _Fun__11____() { }

        public         _Fun__11____(main._Program _self____)  {

            
        this._self____ = _self____;
        
            } 

        public _Fun__11____  _new_1( main._Program _self____ )  {
             
            return new _Fun__11____(_self____);
        
            } 

        public @Override CyInt  _eval_1( CyInt _tmp405____ )  {
            CyBoolean tmp532 = _tmp405____._lessThan( CyInt.zero);
            CyBoolean tmp531;
            if ( ! tmp532.b ) { 
                CyBoolean tmp533 = _tmp405____._greaterThan( (new CyInt( (int ) 10)));
                tmp531 = new CyBoolean(tmp533.b );
            }
            else {
                tmp531 = new CyBoolean(true);
            }
            if ( tmp531.b ) {
                _ExceptionStr tmp535 = new _ExceptionStr( (new CyString("In line 65 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is " + _tmp405____._asString().s)));                Object tmp534 = _self____._throw_1( tmp535);
                return null;
            }
            // end of if

            return _tmp405____;
            } 

        public @Override _Fun__11____ _clone() {
            
        try {
            return (_Fun__11____ ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
            } 

        public @Override _Fun__11____ _prototype() {
             return prototypeFun_11__;
        
            } 
    public String []getFieldTypeList() { 
        return fieldTypeListFun_11__;
    }
    public String []getFieldList() { 
        return fieldListFun_11__;
    }
    public String asString(int ident) {
        String s =  "Fun_11__ {\n";
        s = s + "super(cyan.lang.Function<Int,Int>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP_CyInt_GP_CyInt_GT.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Fun_11__";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureListFun_11__; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureListFun_11__; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotListFun_11__; }

}

    
    @SuppressWarnings( { "unused", "cast", "hiding" } )
private class _Fun__12____ extends cyan.lang._Function_LT_GP_CyInt_GP_CyInt_GT
 {

	private static final long serialVersionUID = 1743971805751864737L;
        public _Fun__12____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        public _Fun__12____() { }

        public         _Fun__12____(main._Program _self____)  {

            
        this._self____ = _self____;
        
            } 

        public _Fun__12____  _new_1( main._Program _self____ )  {
             
            return new _Fun__12____(_self____);
        
            } 

        public @Override CyInt  _eval_1( CyInt _tmp406____ )  {
            CyBoolean tmp537 = _tmp406____._lessThan( CyInt.zero);
            CyBoolean tmp536;
            if ( ! tmp537.b ) { 
                CyBoolean tmp538 = _tmp406____._greaterThan( (new CyInt( (int ) 10)));
                tmp536 = new CyBoolean(tmp538.b );
            }
            else {
                tmp536 = new CyBoolean(true);
            }
            if ( tmp536.b ) {
                _ExceptionStr tmp540 = new _ExceptionStr( (new CyString("In line 70 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is " + _tmp406____._asString().s)));                Object tmp539 = _self____._throw_1( tmp540);
                return null;
            }
            // end of if

            return _tmp406____;
            } 

        public @Override _Fun__12____ _clone() {
            
        try {
            return (_Fun__12____ ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
            } 

        public @Override _Fun__12____ _prototype() {
             return prototypeFun_12__;
        
            } 
    public String []getFieldTypeList() { 
        return fieldTypeListFun_12__;
    }
    public String []getFieldList() { 
        return fieldListFun_12__;
    }
    public String asString(int ident) {
        String s =  "Fun_12__ {\n";
        s = s + "super(cyan.lang.Function<Int,Int>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP_CyInt_GP_CyInt_GT.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Fun_12__";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureListFun_12__; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureListFun_12__; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotListFun_12__; }

}

    
    @SuppressWarnings( { "unused", "cast", "hiding" } )
private class _Fun__13____ extends cyan.lang._Function_LT_GP_CyInt_GP_CyInt_GT
 {

	private static final long serialVersionUID = 1286381063305918600L;
        public _Fun__13____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        public _Fun__13____() { }

        public         _Fun__13____(main._Program _self____)  {

            
        this._self____ = _self____;
        
            } 

        public _Fun__13____  _new_1( main._Program _self____ )  {
             
            return new _Fun__13____(_self____);
        
            } 

        public @Override CyInt  _eval_1( CyInt _tmp407____ )  {
            CyBoolean tmp542 = _tmp407____._lessThan( CyInt.zero);
            CyBoolean tmp541;
            if ( ! tmp542.b ) { 
                CyBoolean tmp543 = _tmp407____._greaterThan( (new CyInt( (int ) 10)));
                tmp541 = new CyBoolean(tmp543.b );
            }
            else {
                tmp541 = new CyBoolean(true);
            }
            if ( tmp541.b ) {
                _ExceptionStr tmp545 = new _ExceptionStr( (new CyString("In line 73 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is " + _tmp407____._asString().s)));                Object tmp544 = _self____._throw_1( tmp545);
                return null;
            }
            // end of if

            return _tmp407____;
            } 

        public @Override _Fun__13____ _clone() {
            
        try {
            return (_Fun__13____ ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
            } 

        public @Override _Fun__13____ _prototype() {
             return prototypeFun_13__;
        
            } 
    public String []getFieldTypeList() { 
        return fieldTypeListFun_13__;
    }
    public String []getFieldList() { 
        return fieldListFun_13__;
    }
    public String asString(int ident) {
        String s =  "Fun_13__ {\n";
        s = s + "super(cyan.lang.Function<Int,Int>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP_CyInt_GP_CyInt_GT.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Fun_13__";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureListFun_13__; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureListFun_13__; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotListFun_13__; }

}

    
    @SuppressWarnings( { "unused", "cast", "hiding" } )
private class _Fun__14____ extends cyan.lang._Function_LT_GP_CyInt_GP_CyInt_GT
 {

	private static final long serialVersionUID = 1466156207634466747L;
        public _Fun__14____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        public _Fun__14____() { }

        public         _Fun__14____(main._Program _self____)  {

            
        this._self____ = _self____;
        
            } 

        public _Fun__14____  _new_1( main._Program _self____ )  {
             
            return new _Fun__14____(_self____);
        
            } 

        public @Override CyInt  _eval_1( CyInt _tmp408____ )  {
            CyBoolean tmp547 = _tmp408____._lessThan( CyInt.zero);
            CyBoolean tmp546;
            if ( ! tmp547.b ) { 
                CyBoolean tmp548 = _tmp408____._greaterThan( (new CyInt( (int ) 10)));
                tmp546 = new CyBoolean(tmp548.b );
            }
            else {
                tmp546 = new CyBoolean(true);
            }
            if ( tmp546.b ) {
                _ExceptionStr tmp550 = new _ExceptionStr( (new CyString("In line 76 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is " + _tmp408____._asString().s)));                Object tmp549 = _self____._throw_1( tmp550);
                return null;
            }
            // end of if

            return _tmp408____;
            } 

        public @Override _Fun__14____ _clone() {
            
        try {
            return (_Fun__14____ ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
            } 

        public @Override _Fun__14____ _prototype() {
             return prototypeFun_14__;
        
            } 
    public String []getFieldTypeList() { 
        return fieldTypeListFun_14__;
    }
    public String []getFieldList() { 
        return fieldListFun_14__;
    }
    public String asString(int ident) {
        String s =  "Fun_14__ {\n";
        s = s + "super(cyan.lang.Function<Int,Int>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP_CyInt_GP_CyInt_GT.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Fun_14__";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureListFun_14__; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureListFun_14__; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotListFun_14__; }

}

    
    @SuppressWarnings( { "unused", "cast", "hiding" } )
private class _Fun__15____ extends cyan.lang._Function_LT_GP_CyInt_GP_CyInt_GT
 {

	private static final long serialVersionUID = 7009273941468807744L;
        public _Fun__15____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        public _Fun__15____() { }

        public         _Fun__15____(main._Program _self____)  {

            
        this._self____ = _self____;
        
            } 

        public _Fun__15____  _new_1( main._Program _self____ )  {
             
            return new _Fun__15____(_self____);
        
            } 

        public @Override CyInt  _eval_1( CyInt _tmp409____ )  {
            CyBoolean tmp552 = _tmp409____._lessThan( CyInt.zero);
            CyBoolean tmp551;
            if ( ! tmp552.b ) { 
                CyBoolean tmp553 = _tmp409____._greaterThan( (new CyInt( (int ) 10)));
                tmp551 = new CyBoolean(tmp553.b );
            }
            else {
                tmp551 = new CyBoolean(true);
            }
            if ( tmp551.b ) {
                _ExceptionStr tmp555 = new _ExceptionStr( (new CyString("In line 79 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is " + _tmp409____._asString().s)));                Object tmp554 = _self____._throw_1( tmp555);
                return null;
            }
            // end of if

            return _tmp409____;
            } 

        public @Override _Fun__15____ _clone() {
            
        try {
            return (_Fun__15____ ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
            } 

        public @Override _Fun__15____ _prototype() {
             return prototypeFun_15__;
        
            } 
    public String []getFieldTypeList() { 
        return fieldTypeListFun_15__;
    }
    public String []getFieldList() { 
        return fieldListFun_15__;
    }
    public String asString(int ident) {
        String s =  "Fun_15__ {\n";
        s = s + "super(cyan.lang.Function<Int,Int>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP_CyInt_GP_CyInt_GT.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Fun_15__";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureListFun_15__; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureListFun_15__; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotListFun_15__; }

}

    
    @SuppressWarnings( { "unused", "cast", "hiding" } )
private class _Fun__16____ extends cyan.lang._Function_LT_GP_CyInt_GP_CyInt_GT
 {

	private static final long serialVersionUID = 4194966893830688541L;
        public _Fun__16____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        public _Fun__16____() { }

        public         _Fun__16____(main._Program _self____)  {

            
        this._self____ = _self____;
        
            } 

        public _Fun__16____  _new_1( main._Program _self____ )  {
             
            return new _Fun__16____(_self____);
        
            } 

        public @Override CyInt  _eval_1( CyInt _tmp410____ )  {
            CyBoolean tmp557 = _tmp410____._lessThan( CyInt.zero);
            CyBoolean tmp556;
            if ( ! tmp557.b ) { 
                CyBoolean tmp558 = _tmp410____._greaterThan( (new CyInt( (int ) 10)));
                tmp556 = new CyBoolean(tmp558.b );
            }
            else {
                tmp556 = new CyBoolean(true);
            }
            if ( tmp556.b ) {
                _ExceptionStr tmp560 = new _ExceptionStr( (new CyString("In line 82 of file 'C:\\C\\LP-2021\\main\\Program.cyan' expression 'dedos + 1' should be between 0 and 10 Its value is " + _tmp410____._asString().s)));                Object tmp559 = _self____._throw_1( tmp560);
                return null;
            }
            // end of if

            return _tmp410____;
            } 

        public @Override _Fun__16____ _clone() {
            
        try {
            return (_Fun__16____ ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
            } 

        public @Override _Fun__16____ _prototype() {
             return prototypeFun_16__;
        
            } 
    public String []getFieldTypeList() { 
        return fieldTypeListFun_16__;
    }
    public String []getFieldList() { 
        return fieldListFun_16__;
    }
    public String asString(int ident) {
        String s =  "Fun_16__ {\n";
        s = s + "super(cyan.lang.Function<Int,Int>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP_CyInt_GP_CyInt_GT.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Fun_16__";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureListFun_16__; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureListFun_16__; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotListFun_16__; }

}

    public String []getFieldTypeList() { 
        return fieldTypeList;
    }
    public String []getFieldList() { 
        return fieldList;
    }
    public String asString(int ident) {
        String s =  "Program {\n";
        s = s + "super(Any):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "dedos: " + _dedos._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Any.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Program";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureList; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureList; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotList; }
    static {
    }

}
