package main;
import cyanruntime.*;

import cyan.lang.*;

    /**
    Victoria Resende
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
    Victoria Resende
    */
    private     cyan.lang.CyInt _bebe;
    private     cyan.lang.CyInt _crianca;

    public     _Program() {

    this._bebe = CyInt.zero;

    this._crianca = (new CyInt( (int ) 5));

        } 

    public main._Program _new() {
         
            return new _Program();        
        } 

    public _Nil _run() {
        Ref<CyInt> _recemnascido = new Ref<CyInt>();
        /* recemnascido =  (          @pushCompilationContext(atisemAn_id_0, "restrictTo", main, "C:\C\LP-2021\gion\main\Program.cyan", 9)  { (:  -> Int :)             let Int tmp398__ = 0; 
                        if !(tmp398__ >= 0 && tmp398__ < 4) {
                self throw: ExceptionStr("In line 11 of file 'C:\\C\\LP-2021\\gion\\main\\Program.cyan' expression '0' should obey the restriction ' self >= 0 && self < 4 '.  The expression value is $tmp398__")
            }            ^ tmp398__
 } eval         @popCompilationContext(atisemAn_id_0, "cyan.lang", "Int")  )  */
        _Fun__0____ tmp407 = new _Fun__0____(this);
        CyInt tmp406 = tmp407._eval();
        _recemnascido.elem = tmp406;

        Ref<CyInt> _teste = new Ref<CyInt>();
        _teste.elem = CyInt.zero;
        CyInt tmp410 = _teste.elem._plus( CyInt.two);
        CyString tmp409 = (new CyString("'teste + 2' == "))._plus_plus( tmp410);
        _Nil tmp408 = _Out.prototype._println_1( tmp409);
        CyBoolean tmp411 = CyBoolean.cyFalse;

        Ref<CyBoolean> _ok = new Ref<CyBoolean>();
        _ok.elem = tmp411;
        _Fun__1____ tmp412 = new _Fun__1____(this, _recemnascido, _teste);
        _Fun__3____ tmp414 = new _Fun__3____(this, _ok);
        _Nil tmp413 = tmp412._catch_1( tmp414);
        CyBoolean tmp415 = _ok.elem._exclamation();
        if ( tmp415.b ) {
            _Nil tmp416 = (new CyString("Assert failed in line 25 of prototype 'main.Program'"))._println();
            _Nil tmp417 = (new CyString("Assert expression: 'ok'"))._println();
        }
        // end of if
        CyBoolean tmp419 = CyBoolean.cyFalse;
        CyBoolean tmp418 = _ok.elem._equal_equal( tmp419);
        if ( tmp418.b ) {
            _Contar();
            _ContarBebe();
            _ContarCrianca();
        }
        // end of if
        CyBoolean tmp421 = CyBoolean.cyTrue;
        CyBoolean tmp420 = _ok.elem._equal_equal( tmp421);
        if ( tmp420.b ) {
            _CrescerAmbos();
            _CrescerBebe();
            _CrescerCrianca();
        }
        // end of if
        /* ok = false */
        CyBoolean tmp422 = CyBoolean.cyFalse;
        _ok.elem = tmp422;
        _Fun__4____ tmp423 = new _Fun__4____(this, _recemnascido);
        _Fun__6____ tmp425 = new _Fun__6____(this, _ok);
        _Nil tmp424 = tmp423._catch_1( tmp425);
        CyBoolean tmp426 = _ok.elem._exclamation();
        if ( tmp426.b ) {
            _Nil tmp427 = (new CyString("Assert failed in line 39 of prototype 'main.Program'"))._println();
            _Nil tmp428 = (new CyString("Assert expression: 'ok'"))._println();
        }
        // end of if
        /* ok = false */
        CyBoolean tmp429 = CyBoolean.cyFalse;
        _ok.elem = tmp429;
        _Fun__7____ tmp430 = new _Fun__7____(this, _recemnascido);
        _Fun__9____ tmp432 = new _Fun__9____(this, _ok);
        _Nil tmp431 = tmp430._catch_1( tmp432);
        CyBoolean tmp433 = _ok.elem._exclamation();
        if ( tmp433.b ) {
            _Nil tmp434 = (new CyString("Assert failed in line 47 of prototype 'main.Program'"))._println();
            _Nil tmp435 = (new CyString("Assert expression: 'ok'"))._println();
        }
        // end of if
        _CrescerAmbos();
        _CrescerBebe();
        _CrescerCrianca();
        _Contar();
        _ContarBebe();
        _ContarCrianca();
        return _Nil.prototype;
        } 

    public _Nil _CrescerAmbos() {
        CyInt tmp438 = _bebe._plus( CyInt.one);
        CyString tmp437 = (new CyString("'bebe + 1' == "))._plus_plus( tmp438);
        _Nil tmp436 = _Out.prototype._println_1( tmp437);
        /* bebe =  (          @pushCompilationContext(atisemAn_id_14, "range", main, "C:\C\LP-2021\gion\main\Program.cyan", 86)  ({ (: Int tmp402__ -> Int :)                         if tmp402__ < 0 || tmp402__ > 4 {
                self throw: ExceptionStr("In line 58 of file 'C:\\C\\LP-2021\\gion\\main\\Program.cyan' expression 'bebe + 1' should be between 0 and 4 Its value is $tmp402__")
            }            ^ tmp402__
 } eval: (bebe + 1))         @popCompilationContext(atisemAn_id_14, "cyan.lang", "Int")  )  */
        _Fun__10____ tmp439 = new _Fun__10____(this);
        CyInt tmp441 = _bebe._plus( CyInt.one);
        CyInt tmp440 = tmp439._eval_1( tmp441);
        _bebe = tmp440;
        CyInt tmp444 = _crianca._plus( CyInt.one);
        CyString tmp443 = (new CyString("'crianca + 1' == "))._plus_plus( tmp444);
        _Nil tmp442 = _Out.prototype._println_1( tmp443);
        /* crianca =  (          @pushCompilationContext(atisemAn_id_16, "range", main, "C:\C\LP-2021\gion\main\Program.cyan", 87)  ({ (: Int tmp403__ -> Int :)                         if tmp403__ < 5 || tmp403__ > 11 {
                self throw: ExceptionStr("In line 60 of file 'C:\\C\\LP-2021\\gion\\main\\Program.cyan' expression 'crianca + 1' should be between 5 and 11 Its value is $tmp403__")
            }            ^ tmp403__
 } eval: (crianca + 1))         @popCompilationContext(atisemAn_id_16, "cyan.lang", "Int")  )  */
        _Fun__11____ tmp445 = new _Fun__11____(this);
        CyInt tmp447 = _crianca._plus( CyInt.one);
        CyInt tmp446 = tmp445._eval_1( tmp447);
        _crianca = tmp446;
        _Nil tmp448 = (new CyString("AMBOS CRESCERAM."))._println();
        return _Nil.prototype;
        } 

    public _Nil _Contar() {

        CyString _metodo;
        _metodo = (new CyString("Contar"));
        _Nil tmp449 = (new CyString("Metodo " + _metodo._asString().s + " foi chamado."))._println();
        return _Nil.prototype;
        } 

    public _Nil _CrescerBebe() {
        /* bebe =  (          @pushCompilationContext(atisemAn_id_19, "range", main, "C:\C\LP-2021\gion\main\Program.cyan", 86)  ({ (: Int tmp404__ -> Int :)                         if tmp404__ < 0 || tmp404__ > 4 {
                self throw: ExceptionStr("In line 71 of file 'C:\\C\\LP-2021\\gion\\main\\Program.cyan' expression 'bebe + 1' should be between 0 and 4 Its value is $tmp404__")
            }            ^ tmp404__
 } eval: (bebe + 1))         @popCompilationContext(atisemAn_id_19, "cyan.lang", "Int")  )  */
        _Fun__12____ tmp450 = new _Fun__12____(this);
        CyInt tmp452 = _bebe._plus( CyInt.one);
        CyInt tmp451 = tmp450._eval_1( tmp452);
        _bebe = tmp451;
        return _Nil.prototype;
        } 

    public _Nil _CrescerCrianca() {
        /* crianca =  (          @pushCompilationContext(atisemAn_id_20, "range", main, "C:\C\LP-2021\gion\main\Program.cyan", 87)  ({ (: Int tmp405__ -> Int :)                         if tmp405__ < 5 || tmp405__ > 11 {
                self throw: ExceptionStr("In line 75 of file 'C:\\C\\LP-2021\\gion\\main\\Program.cyan' expression 'crianca + 1' should be between 5 and 11 Its value is $tmp405__")
            }            ^ tmp405__
 } eval: (crianca + 1))         @popCompilationContext(atisemAn_id_20, "cyan.lang", "Int")  )  */
        _Fun__13____ tmp453 = new _Fun__13____(this);
        CyInt tmp455 = _crianca._plus( CyInt.one);
        CyInt tmp454 = tmp453._eval_1( tmp455);
        _crianca = tmp454;
        return _Nil.prototype;
        } 

    public _Nil _ContarBebe() {
        _Nil tmp456 = (new CyString("O bebe tem " + _bebe._asString().s + " anos."))._println();
        return _Nil.prototype;
        } 

    public _Nil _ContarCrianca() {
        _Nil tmp457 = (new CyString("A crianca tem " + _crianca._asString().s + " anos."))._println();
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
        _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT tmp458 = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();

        return tmp458;
        } 

    public @Override _Array_LT_GP__Any_GT _getAnnotListNameDoesNotCollide____() {
        _Array_LT_GP__Any_GT tmp459 = new _Array_LT_GP__Any_GT();

        return tmp459;
        } 

    public @Override _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getSlotFeatureListNameDoesNotCollide____() {
        _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT tmp460 = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();

        _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _slotFeatureList__name__does__not__collide____;
        _slotFeatureList__name__does__not__collide____ = tmp460;

        return _slotFeatureList__name__does__not__collide____;
        } 
    public static _Program prototype;
    private static _Fun__0____ prototypeFun_0__;

    static final String []fieldListFun_0__ = { "bebe", "crianca" };
    static final String []fieldTypeListFun_0__ = { "cyan.lang.Int", "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_0__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_0__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_0__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_0__ = { 
        new CyString("eval"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__1____ prototypeFun_1__;

    static final String []fieldListFun_1__ = { "bebe", "crianca" };
    static final String []fieldTypeListFun_1__ = { "cyan.lang.Int", "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_1__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_1__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_1__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_1__ = { 
        new CyString("eval"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__2____ prototypeFun_2__;

    static final String []fieldListFun_2__ = { "bebe", "crianca" };
    static final String []fieldTypeListFun_2__ = { "cyan.lang.Int", "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_2__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_2__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_2__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_2__ = { 
        new CyString("eval"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__3____ prototypeFun_3__;

    static final String []fieldListFun_3__ = { "bebe", "crianca" };
    static final String []fieldTypeListFun_3__ = { "cyan.lang.Int", "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_3__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_3__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_3__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_3__ = { 
        new CyString("eval: CyException"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__4____ prototypeFun_4__;

    static final String []fieldListFun_4__ = { "bebe", "crianca" };
    static final String []fieldTypeListFun_4__ = { "cyan.lang.Int", "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_4__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_4__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_4__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_4__ = { 
        new CyString("eval"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__5____ prototypeFun_5__;

    static final String []fieldListFun_5__ = { "bebe", "crianca" };
    static final String []fieldTypeListFun_5__ = { "cyan.lang.Int", "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_5__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_5__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_5__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_5__ = { 
        new CyString("eval"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__6____ prototypeFun_6__;

    static final String []fieldListFun_6__ = { "bebe", "crianca" };
    static final String []fieldTypeListFun_6__ = { "cyan.lang.Int", "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_6__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_6__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_6__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_6__ = { 
        new CyString("eval: CyException"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__7____ prototypeFun_7__;

    static final String []fieldListFun_7__ = { "bebe", "crianca" };
    static final String []fieldTypeListFun_7__ = { "cyan.lang.Int", "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_7__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_7__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_7__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_7__ = { 
        new CyString("eval"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__8____ prototypeFun_8__;

    static final String []fieldListFun_8__ = { "bebe", "crianca" };
    static final String []fieldTypeListFun_8__ = { "cyan.lang.Int", "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_8__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_8__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_8__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_8__ = { 
        new CyString("eval"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__9____ prototypeFun_9__;

    static final String []fieldListFun_9__ = { "bebe", "crianca" };
    static final String []fieldTypeListFun_9__ = { "cyan.lang.Int", "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_9__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_9__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_9__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_9__ = { 
        new CyString("eval: CyException"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__10____ prototypeFun_10__;

    static final String []fieldListFun_10__ = { "bebe", "crianca" };
    static final String []fieldTypeListFun_10__ = { "cyan.lang.Int", "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_10__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_10__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_10__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_10__ = { 
        new CyString("eval: Int"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__11____ prototypeFun_11__;

    static final String []fieldListFun_11__ = { "bebe", "crianca" };
    static final String []fieldTypeListFun_11__ = { "cyan.lang.Int", "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_11__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_11__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_11__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_11__ = { 
        new CyString("eval: Int"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__12____ prototypeFun_12__;

    static final String []fieldListFun_12__ = { "bebe", "crianca" };
    static final String []fieldTypeListFun_12__ = { "cyan.lang.Int", "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_12__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_12__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_12__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_12__ = { 
        new CyString("eval: Int"),
        new CyString("clone"),
        new CyString("prototype")
        };

    private static _Fun__13____ prototypeFun_13__;

    static final String []fieldListFun_13__ = { "bebe", "crianca" };
    static final String []fieldTypeListFun_13__ = { "cyan.lang.Int", "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_13__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_13__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_13__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_13__ = { 
        new CyString("eval: Int"),
        new CyString("clone"),
        new CyString("prototype")
        };


    static final String []fieldList = { "bebe", "crianca" };
    static final String []fieldTypeList = { "cyan.lang.Int", "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureList = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotList = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureList = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameList = { 
        new CyString("run"),
        new CyString("CrescerAmbos"),
        new CyString("Contar"),
        new CyString("CrescerBebe"),
        new CyString("CrescerCrianca"),
        new CyString("ContarBebe"),
        new CyString("ContarCrianca"),
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
            CyBoolean tmp463 = _tmp398____._greaterThan_equal( CyInt.zero);
            CyBoolean tmp462;
            if ( tmp463.b ) { 
                CyBoolean tmp464 = _tmp398____._lessThan( (new CyInt( (int ) 4)));
                tmp462 = new CyBoolean(tmp464.b );
            }
            else {
                tmp462 = new CyBoolean(false);
            }
            CyBoolean tmp461 = tmp462._exclamation();
            if ( tmp461.b ) {
                _ExceptionStr tmp466 = new _ExceptionStr( (new CyString("In line 11 of file 'C:\\C\\LP-2021\\gion\\main\\Program.cyan' expression '0' should obey the restriction ' self >= 0 && self < 4 '.  The expression value is " + _tmp398____._asString().s)));                Object tmp465 = _self____._throw_1( tmp466);
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
        private         Ref<cyan.lang.CyInt> _recemnascido;
        private         Ref<cyan.lang.CyInt> _teste;
        public _Fun__1____() { }

        public         _Fun__1____(main._Program _self____, Ref<CyInt> _recemnascido, Ref<CyInt> _teste)  {

            
        this._self____ = _self____;
        this._recemnascido = _recemnascido;
        this._teste = _teste;
        
            } 

        public _Fun__1____  _new_3( main._Program _self____, Ref<CyInt> _recemnascido, Ref<CyInt> _teste )  {
             
            return new _Fun__1____(_self____, _recemnascido, _teste);
        
            } 

        public @Override _Nil _eval() {
            /* recemnascido = ( (              @pushCompilationContext(atisemAn_id_3, "restrictTo", main, "C:\C\LP-2021\gion\main\Program.cyan", 9)  Fun_2__(self__, teste) eval             @popCompilationContext(atisemAn_id_3, "cyan.lang", "Int")  ) ) */
            _Fun__2____ tmp468 = new _Fun__2____( _self____, _teste);            CyInt tmp467 = tmp468._eval();
            _recemnascido.elem = tmp467;
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
        s = s + getWhiteSpaces(ident) + "recemnascido: " + _recemnascido.elem._asString().s + "\n";
        s = s + getWhiteSpaces(ident) + "teste: " + _teste.elem._asString().s + "\n";
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
        private         Ref<cyan.lang.CyInt> _teste;
        public _Fun__2____() { }

        public         _Fun__2____(main._Program _self____, Ref<CyInt> _teste)  {

            
        this._self____ = _self____;
        this._teste = _teste;
        
            } 

        public _Fun__2____  _new_2( main._Program _self____, Ref<CyInt> _teste )  {
             
            return new _Fun__2____(_self____, _teste);
        
            } 

        public @Override CyInt _eval() {
            CyInt tmp469 = _teste.elem._plus( CyInt.two);

            CyInt _tmp399____;
            _tmp399____ = tmp469;
            CyBoolean tmp472 = _tmp399____._greaterThan_equal( CyInt.zero);
            CyBoolean tmp471;
            if ( tmp472.b ) { 
                CyBoolean tmp473 = _tmp399____._lessThan( (new CyInt( (int ) 4)));
                tmp471 = new CyBoolean(tmp473.b );
            }
            else {
                tmp471 = new CyBoolean(false);
            }
            CyBoolean tmp470 = tmp471._exclamation();
            if ( tmp470.b ) {
                _ExceptionStr tmp475 = new _ExceptionStr( (new CyString("In line 21 of file 'C:\\C\\LP-2021\\gion\\main\\Program.cyan' expression 'teste + 2' should obey the restriction ' self >= 0 && self < 4 '.  The expression value is " + _tmp399____._asString().s)));                Object tmp474 = _self____._throw_1( tmp475);
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
        s = s + getWhiteSpaces(ident) + "teste: " + _teste.elem._asString().s + "\n";
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
            CyBoolean tmp476 = CyBoolean.cyTrue;
            _ok.elem = tmp476;
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
        private         Ref<cyan.lang.CyInt> _recemnascido;
        public _Fun__4____() { }

        public         _Fun__4____(main._Program _self____, Ref<CyInt> _recemnascido)  {

            
        this._self____ = _self____;
        this._recemnascido = _recemnascido;
        
            } 

        public _Fun__4____  _new_2( main._Program _self____, Ref<CyInt> _recemnascido )  {
             
            return new _Fun__4____(_self____, _recemnascido);
        
            } 

        public @Override _Nil _eval() {
            /* recemnascido = ( (              @pushCompilationContext(atisemAn_id_7, "restrictTo", main, "C:\C\LP-2021\gion\main\Program.cyan", 9)  Fun_5__(self__, recemnascido) eval             @popCompilationContext(atisemAn_id_7, "cyan.lang", "Int")  ) ) */
            _Fun__5____ tmp478 = new _Fun__5____( _self____, _recemnascido);            CyInt tmp477 = tmp478._eval();
            _recemnascido.elem = tmp477;
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
        s = s + getWhiteSpaces(ident) + "recemnascido: " + _recemnascido.elem._asString().s + "\n";
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
        private         Ref<cyan.lang.CyInt> _recemnascido;
        public _Fun__5____() { }

        public         _Fun__5____(main._Program _self____, Ref<CyInt> _recemnascido)  {

            
        this._self____ = _self____;
        this._recemnascido = _recemnascido;
        
            } 

        public _Fun__5____  _new_2( main._Program _self____, Ref<CyInt> _recemnascido )  {
             
            return new _Fun__5____(_self____, _recemnascido);
        
            } 

        public @Override CyInt _eval() {
            CyInt tmp479 = _recemnascido.elem._plus( CyInt.one);

            CyInt _tmp400____;
            _tmp400____ = tmp479;
            CyBoolean tmp482 = _tmp400____._greaterThan_equal( CyInt.zero);
            CyBoolean tmp481;
            if ( tmp482.b ) { 
                CyBoolean tmp483 = _tmp400____._lessThan( (new CyInt( (int ) 4)));
                tmp481 = new CyBoolean(tmp483.b );
            }
            else {
                tmp481 = new CyBoolean(false);
            }
            CyBoolean tmp480 = tmp481._exclamation();
            if ( tmp480.b ) {
                _ExceptionStr tmp485 = new _ExceptionStr( (new CyString("In line 35 of file 'C:\\C\\LP-2021\\gion\\main\\Program.cyan' expression 'recemnascido + 1' should obey the restriction ' self >= 0 && self < 4 '.  The expression value is " + _tmp400____._asString().s)));                Object tmp484 = _self____._throw_1( tmp485);
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
        s = s + getWhiteSpaces(ident) + "recemnascido: " + _recemnascido.elem._asString().s + "\n";
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
            CyBoolean tmp486 = CyBoolean.cyTrue;
            _ok.elem = tmp486;
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
private class _Fun__7____ extends cyan.lang._Function_LT_GP__Nil_GT
 {

	private static final long serialVersionUID = 192333485550123303L;
        public _Fun__7____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        private         Ref<cyan.lang.CyInt> _recemnascido;
        public _Fun__7____() { }

        public         _Fun__7____(main._Program _self____, Ref<CyInt> _recemnascido)  {

            
        this._self____ = _self____;
        this._recemnascido = _recemnascido;
        
            } 

        public _Fun__7____  _new_2( main._Program _self____, Ref<CyInt> _recemnascido )  {
             
            return new _Fun__7____(_self____, _recemnascido);
        
            } 

        public @Override _Nil _eval() {
            /* recemnascido = ( (              @pushCompilationContext(atisemAn_id_9, "restrictTo", main, "C:\C\LP-2021\gion\main\Program.cyan", 9)  Fun_8__(self__, recemnascido) eval             @popCompilationContext(atisemAn_id_9, "cyan.lang", "Int")  ) ) */
            _Fun__8____ tmp488 = new _Fun__8____( _self____, _recemnascido);            CyInt tmp487 = tmp488._eval();
            _recemnascido.elem = tmp487;
            return _Nil.prototype;
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
        s = s + "super(cyan.lang.Function<Nil>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        s = s + getWhiteSpaces(ident) + "recemnascido: " + _recemnascido.elem._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP__Nil_GT.prototype;
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
private class _Fun__8____ extends cyan.lang._Function_LT_GP_CyInt_GT
 {

	private static final long serialVersionUID = -2460209995715011072L;
        public _Fun__8____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        private         Ref<cyan.lang.CyInt> _recemnascido;
        public _Fun__8____() { }

        public         _Fun__8____(main._Program _self____, Ref<CyInt> _recemnascido)  {

            
        this._self____ = _self____;
        this._recemnascido = _recemnascido;
        
            } 

        public _Fun__8____  _new_2( main._Program _self____, Ref<CyInt> _recemnascido )  {
             
            return new _Fun__8____(_self____, _recemnascido);
        
            } 

        public @Override CyInt _eval() {
            CyInt tmp489 = _recemnascido.elem._plus( CyInt.one);

            CyInt _tmp401____;
            _tmp401____ = tmp489;
            CyBoolean tmp492 = _tmp401____._greaterThan_equal( CyInt.zero);
            CyBoolean tmp491;
            if ( tmp492.b ) { 
                CyBoolean tmp493 = _tmp401____._lessThan( (new CyInt( (int ) 4)));
                tmp491 = new CyBoolean(tmp493.b );
            }
            else {
                tmp491 = new CyBoolean(false);
            }
            CyBoolean tmp490 = tmp491._exclamation();
            if ( tmp490.b ) {
                _ExceptionStr tmp495 = new _ExceptionStr( (new CyString("In line 43 of file 'C:\\C\\LP-2021\\gion\\main\\Program.cyan' expression 'recemnascido + 1' should obey the restriction ' self >= 0 && self < 4 '.  The expression value is " + _tmp401____._asString().s)));                Object tmp494 = _self____._throw_1( tmp495);
                return null;
            }
            // end of if

            return _tmp401____;
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
        s = s + "super(cyan.lang.Function<Int>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        s = s + getWhiteSpaces(ident) + "recemnascido: " + _recemnascido.elem._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP_CyInt_GT.prototype;
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
private class _Fun__9____ extends cyan.lang._Function_LT_GP__CyException_GP__Nil_GT
 {

	private static final long serialVersionUID = -1169632101368907863L;
        public _Fun__9____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._Program _self____;
        private         Ref<cyan.lang.CyBoolean> _ok;
        public _Fun__9____() { }

        public         _Fun__9____(main._Program _self____, Ref<CyBoolean> _ok)  {

            
        this._self____ = _self____;
        this._ok = _ok;
        
            } 

        public _Fun__9____  _new_2( main._Program _self____, Ref<CyBoolean> _ok )  {
             
            return new _Fun__9____(_self____, _ok);
        
            } 

        public @Override _Nil  _eval_1( _CyException _e )  {
            /* ok = true */
            CyBoolean tmp496 = CyBoolean.cyTrue;
            _ok.elem = tmp496;
            return _Nil.prototype;
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

        public @Override CyInt  _eval_1( CyInt _tmp402____ )  {
            CyBoolean tmp498 = _tmp402____._lessThan( CyInt.zero);
            CyBoolean tmp497;
            if ( ! tmp498.b ) { 
                CyBoolean tmp499 = _tmp402____._greaterThan( (new CyInt( (int ) 4)));
                tmp497 = new CyBoolean(tmp499.b );
            }
            else {
                tmp497 = new CyBoolean(true);
            }
            if ( tmp497.b ) {
                _ExceptionStr tmp501 = new _ExceptionStr( (new CyString("In line 58 of file 'C:\\C\\LP-2021\\gion\\main\\Program.cyan' expression 'bebe + 1' should be between 0 and 4 Its value is " + _tmp402____._asString().s)));                Object tmp500 = _self____._throw_1( tmp501);
                return null;
            }
            // end of if

            return _tmp402____;
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

        public @Override CyInt  _eval_1( CyInt _tmp403____ )  {
            CyBoolean tmp503 = _tmp403____._lessThan( (new CyInt( (int ) 5)));
            CyBoolean tmp502;
            if ( ! tmp503.b ) { 
                CyBoolean tmp504 = _tmp403____._greaterThan( (new CyInt( (int ) 11)));
                tmp502 = new CyBoolean(tmp504.b );
            }
            else {
                tmp502 = new CyBoolean(true);
            }
            if ( tmp502.b ) {
                _ExceptionStr tmp506 = new _ExceptionStr( (new CyString("In line 60 of file 'C:\\C\\LP-2021\\gion\\main\\Program.cyan' expression 'crianca + 1' should be between 5 and 11 Its value is " + _tmp403____._asString().s)));                Object tmp505 = _self____._throw_1( tmp506);
                return null;
            }
            // end of if

            return _tmp403____;
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

        public @Override CyInt  _eval_1( CyInt _tmp404____ )  {
            CyBoolean tmp508 = _tmp404____._lessThan( CyInt.zero);
            CyBoolean tmp507;
            if ( ! tmp508.b ) { 
                CyBoolean tmp509 = _tmp404____._greaterThan( (new CyInt( (int ) 4)));
                tmp507 = new CyBoolean(tmp509.b );
            }
            else {
                tmp507 = new CyBoolean(true);
            }
            if ( tmp507.b ) {
                _ExceptionStr tmp511 = new _ExceptionStr( (new CyString("In line 71 of file 'C:\\C\\LP-2021\\gion\\main\\Program.cyan' expression 'bebe + 1' should be between 0 and 4 Its value is " + _tmp404____._asString().s)));                Object tmp510 = _self____._throw_1( tmp511);
                return null;
            }
            // end of if

            return _tmp404____;
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

        public @Override CyInt  _eval_1( CyInt _tmp405____ )  {
            CyBoolean tmp513 = _tmp405____._lessThan( (new CyInt( (int ) 5)));
            CyBoolean tmp512;
            if ( ! tmp513.b ) { 
                CyBoolean tmp514 = _tmp405____._greaterThan( (new CyInt( (int ) 11)));
                tmp512 = new CyBoolean(tmp514.b );
            }
            else {
                tmp512 = new CyBoolean(true);
            }
            if ( tmp512.b ) {
                _ExceptionStr tmp516 = new _ExceptionStr( (new CyString("In line 75 of file 'C:\\C\\LP-2021\\gion\\main\\Program.cyan' expression 'crianca + 1' should be between 5 and 11 Its value is " + _tmp405____._asString().s)));                Object tmp515 = _self____._throw_1( tmp516);
                return null;
            }
            // end of if

            return _tmp405____;
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
        s = s + getWhiteSpaces(ident) + "bebe: " + _bebe._asString().s + "\n";
        s = s + getWhiteSpaces(ident) + "crianca: " + _crianca._asString().s + "\n";
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
