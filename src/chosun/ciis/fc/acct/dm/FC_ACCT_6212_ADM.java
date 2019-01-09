/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_6212_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String incmg_pers;
	public String cmpy_cd;
	public String erplace_cd;
	public String vat_fr_yymm;
	public String vat_to_yymm;
	public long ma_amt_01;
	public long ma_vat_01;
	public long ma_amt_02;
	public long ma_vat_02;
	public long ma_amt_03;
	public long ma_vat_03;
	public long ma_amt_04;
	public long ma_vat_04;
	public long ma_amt_05;
	public long ma_amt_06;
	public long ma_amt_07;
	public long ma_vat_07;
	public long ma_amt_08;
	public long ma_vat_08;
	public long ma_amt_09;
	public long ma_vat_09;
	public long mb_amt_10;
	public long mb_vat_10;
	public long mb_amt_11;
	public long mb_vat_11;
	public long mb_amt_12;
	public long mb_vat_12;
	public long mb_amt_13;
	public long mb_vat_13;
	public long mb_amt_14;
	public long mb_vat_14;
	public long mb_amt_15;
	public long mb_vat_15;
	public long mb_amt_16;
	public long mb_vat_16;
	public long mb_amt_17;
	public long mb_vat_17;
	public long mb_vat_17_d;
	public long mc_vat_18;
	public long mc_amt_19;
	public long mc_vat_19;
	public long mc_vat_20;
	public long mc_vat_21;
	public long mc_vat_22;
	public long mc_vat_23;
	public long mc_vat_24;
	public long mc_vat_25;
	public long md_vat_26;
	public long md_vat_26_b;
	public long me_amt_31;
	public long mg_amt_32;
	public long mg_vat_32;
	public long mg_amt_33;
	public long mg_vat_33;
	public long mg_amt_34;
	public long mg_amt_35;
	public long mg_amt_36;
	public long mg_vat_36;
	public long mg_amt_37;
	public long mg_vat_37;
	public long mg_amt_38;
	public long mg_vat_38;
	public long mg_amt_39;
	public long mg_vat_39;
	public long mh_amt_40;
	public long mh_vat_40;
	public long mh_amt_41;
	public long mh_vat_41;
	public long mh_amt_42;
	public long mh_vat_42;
	public long mh_amt_43;
	public long mh_vat_43;
	public long mh_amt_44;
	public long mh_vat_44;
	public long mh_vat_45;
	public long mh_vat_46;
	public long mh_vat_47;
	public long mh_amt_48;
	public long mh_vat_48;
	public long mi_amt_49;
	public long mi_vat_49;
	public long mi_amt_50;
	public long mi_vat_50;
	public long mi_amt_51;
	public long mi_vat_51;
	public long mi_amt_52;
	public long mi_vat_52;
	public long mj_vat_53;
	public long mj_vat_54;
	public long mj_vat_55;
	public long mj_vat_56;
	public long mj_vat_57;
	public long mj_vat_58;
	public long mk_amt_59;
	public long mk_vat_59;
	public long mk_amt_60;
	public long mk_vat_60;
	public long mk_amt_61;
	public long mk_vat_61;
	public long mk_amt_62;
	public long mk_vat_62;
	public long mk_amt_63;
	public long mk_vat_63;
	public long mk_amt_64;
	public long mk_vat_64;
	public long mk_amt_65;
	public long mk_vat_65;
	public long mk_amt_66;
	public long mk_vat_66;
	public long mk_amt_67;
	public long mk_vat_67;
	public long mk_amt_68;
	public long mk_vat_68;
	public long mk_amt_69;
	public long mk_vat_69;
	public long mk_amt_70;
	public long mk_vat_70;
	public long mk_amt_71;
	public long mk_vat_71;
	public long mk_amt_72;
	public long mk_vat_72;
	public long mk_amt_73;
	public long mk_vat_73;
	public long mk_amt_74;
	public long mk_vat_74;
	public long mk_amt_75;
	public long mk_vat_75;
	public long mk_amt_76;
	public long mk_vat_76;
	public long mk_vat_77;

	public FC_ACCT_6212_ADM(){}
	public FC_ACCT_6212_ADM(String flag, String incmg_pers, String cmpy_cd, String erplace_cd, String vat_fr_yymm, String vat_to_yymm, long ma_amt_01, long ma_vat_01, long ma_amt_02, long ma_vat_02, long ma_amt_03, long ma_vat_03, long ma_amt_04, long ma_vat_04, long ma_amt_05, long ma_amt_06, long ma_amt_07, long ma_vat_07, long ma_amt_08, long ma_vat_08, long ma_amt_09, long ma_vat_09, long mb_amt_10, long mb_vat_10, long mb_amt_11, long mb_vat_11, long mb_amt_12, long mb_vat_12, long mb_amt_13, long mb_vat_13, long mb_amt_14, long mb_vat_14, long mb_amt_15, long mb_vat_15, long mb_amt_16, long mb_vat_16, long mb_amt_17, long mb_vat_17, long mb_vat_17_d, long mc_vat_18, long mc_amt_19, long mc_vat_19, long mc_vat_20, long mc_vat_21, long mc_vat_22, long mc_vat_23, long mc_vat_24, long mc_vat_25, long md_vat_26_b, long me_amt_31, long mg_amt_32, long mg_vat_32, long mg_amt_33, long mg_vat_33, long mg_amt_34, long mg_amt_35, long mg_amt_36, long mg_vat_36, long mg_amt_37, long mg_vat_37, long mg_amt_38, long mg_vat_38, long mg_amt_39, long mg_vat_39, long mh_amt_40, long mh_vat_40, long mh_amt_41, long mh_vat_41, long mh_amt_42, long mh_vat_42, long mh_amt_43, long mh_vat_43, long mh_amt_44, long mh_vat_44, long mh_vat_45, long mh_vat_46, long mh_vat_47, long mh_amt_48, long mh_vat_48, long mi_amt_49, long mi_vat_49, long mi_amt_50, long mi_vat_50, long mi_amt_51, long mi_vat_51, long mi_amt_52, long mi_vat_52, long mj_vat_53, long mj_vat_54, long mj_vat_55, long mj_vat_56, long mj_vat_57, long mj_vat_58, long mk_amt_59, long mk_vat_59, long mk_amt_60, long mk_vat_60, long mk_amt_61, long mk_vat_61, long mk_amt_62, long mk_vat_62, long mk_amt_63, long mk_vat_63, long mk_amt_64, long mk_vat_64, long mk_amt_65, long mk_vat_65, long mk_amt_66, long mk_vat_66, long mk_amt_67, long mk_vat_67, long mk_amt_68, long mk_vat_68, long mk_amt_69, long mk_vat_69, long mk_amt_70, long mk_vat_70, long mk_amt_71, long mk_vat_71, long mk_amt_72, long mk_vat_72, long mk_amt_73, long mk_vat_73, long mk_amt_74, long mk_vat_74, long mk_amt_75, long mk_vat_75, long mk_amt_76, long mk_vat_76, long mk_vat_77){
		this.flag = flag;
		this.incmg_pers = incmg_pers;
		this.cmpy_cd = cmpy_cd;
		this.erplace_cd = erplace_cd;
		this.vat_fr_yymm = vat_fr_yymm;
		this.vat_to_yymm = vat_to_yymm;
		this.ma_amt_01 = ma_amt_01;
		this.ma_vat_01 = ma_vat_01;
		this.ma_amt_02 = ma_amt_02;
		this.ma_vat_02 = ma_vat_02;
		this.ma_amt_03 = ma_amt_03;
		this.ma_vat_03 = ma_vat_03;
		this.ma_amt_04 = ma_amt_04;
		this.ma_vat_04 = ma_vat_04;
		this.ma_amt_05 = ma_amt_05;
		this.ma_amt_06 = ma_amt_06;
		this.ma_amt_07 = ma_amt_07;
		this.ma_vat_07 = ma_vat_07;
		this.ma_amt_08 = ma_amt_08;
		this.ma_vat_08 = ma_vat_08;
		this.ma_amt_09 = ma_amt_09;
		this.ma_vat_09 = ma_vat_09;
		this.mb_amt_10 = mb_amt_10;
		this.mb_vat_10 = mb_vat_10;
		this.mb_amt_11 = mb_amt_11;
		this.mb_vat_11 = mb_vat_11;
		this.mb_amt_12 = mb_amt_12;
		this.mb_vat_12 = mb_vat_12;
		this.mb_amt_13 = mb_amt_13;
		this.mb_vat_13 = mb_vat_13;
		this.mb_amt_14 = mb_amt_14;
		this.mb_vat_14 = mb_vat_14;
		this.mb_amt_15 = mb_amt_15;
		this.mb_vat_15 = mb_vat_15;
		this.mb_amt_16 = mb_amt_16;
		this.mb_vat_16 = mb_vat_16;
		this.mb_amt_17 = mb_amt_17;
		this.mb_vat_17 = mb_vat_17;
		this.mb_vat_17_d = mb_vat_17_d;
		this.mc_vat_18 = mc_vat_18;
		this.mc_amt_19 = mc_amt_19;
		this.mc_vat_19 = mc_vat_19;
		this.mc_vat_20 = mc_vat_20;
		this.mc_vat_21 = mc_vat_21;
		this.mc_vat_22 = mc_vat_22;
		this.mc_vat_23 = mc_vat_23;
		this.mc_vat_24 = mc_vat_24;
		this.mc_vat_25 = mc_vat_25;
		this.md_vat_26_b = md_vat_26_b;
		this.me_amt_31 = me_amt_31;
		this.mg_amt_32 = mg_amt_32;
		this.mg_vat_32 = mg_vat_32;
		this.mg_amt_33 = mg_amt_33;
		this.mg_vat_33 = mg_vat_33;
		this.mg_amt_34 = mg_amt_34;
		this.mg_amt_35 = mg_amt_35;
		this.mg_amt_36 = mg_amt_36;
		this.mg_vat_36 = mg_vat_36;
		this.mg_amt_37 = mg_amt_37;
		this.mg_vat_37 = mg_vat_37;
		this.mg_amt_38 = mg_amt_38;
		this.mg_vat_38 = mg_vat_38;
		this.mg_amt_39 = mg_amt_39;
		this.mg_vat_39 = mg_vat_39;
		this.mh_amt_40 = mh_amt_40;
		this.mh_vat_40 = mh_vat_40;
		this.mh_amt_41 = mh_amt_41;
		this.mh_vat_41 = mh_vat_41;
		this.mh_amt_42 = mh_amt_42;
		this.mh_vat_42 = mh_vat_42;
		this.mh_amt_43 = mh_amt_43;
		this.mh_vat_43 = mh_vat_43;
		this.mh_amt_44 = mh_amt_44;
		this.mh_vat_44 = mh_vat_44;
		this.mh_vat_45 = mh_vat_45;
		this.mh_vat_46 = mh_vat_46;
		this.mh_vat_47 = mh_vat_47;
		this.mh_amt_48 = mh_amt_48;
		this.mh_vat_48 = mh_vat_48;
		this.mi_amt_49 = mi_amt_49;
		this.mi_vat_49 = mi_vat_49;
		this.mi_amt_50 = mi_amt_50;
		this.mi_vat_50 = mi_vat_50;
		this.mi_amt_51 = mi_amt_51;
		this.mi_vat_51 = mi_vat_51;
		this.mi_amt_52 = mi_amt_52;
		this.mi_vat_52 = mi_vat_52;
		this.mj_vat_53 = mj_vat_53;
		this.mj_vat_54 = mj_vat_54;
		this.mj_vat_55 = mj_vat_55;
		this.mj_vat_56 = mj_vat_56;
		this.mj_vat_57 = mj_vat_57;
		this.mj_vat_58 = mj_vat_58;
		this.mk_amt_59 = mk_amt_59;
		this.mk_vat_59 = mk_vat_59;
		this.mk_amt_60 = mk_amt_60;
		this.mk_vat_60 = mk_vat_60;
		this.mk_amt_61 = mk_amt_61;
		this.mk_vat_61 = mk_vat_61;
		this.mk_amt_62 = mk_amt_62;
		this.mk_vat_62 = mk_vat_62;
		this.mk_amt_63 = mk_amt_63;
		this.mk_vat_63 = mk_vat_63;
		this.mk_amt_64 = mk_amt_64;
		this.mk_vat_64 = mk_vat_64;
		this.mk_amt_65 = mk_amt_65;
		this.mk_vat_65 = mk_vat_65;
		this.mk_amt_66 = mk_amt_66;
		this.mk_vat_66 = mk_vat_66;
		this.mk_amt_67 = mk_amt_67;
		this.mk_vat_67 = mk_vat_67;
		this.mk_amt_68 = mk_amt_68;
		this.mk_vat_68 = mk_vat_68;
		this.mk_amt_69 = mk_amt_69;
		this.mk_vat_69 = mk_vat_69;
		this.mk_amt_70 = mk_amt_70;
		this.mk_vat_70 = mk_vat_70;
		this.mk_amt_71 = mk_amt_71;
		this.mk_vat_71 = mk_vat_71;
		this.mk_amt_72 = mk_amt_72;
		this.mk_vat_72 = mk_vat_72;
		this.mk_amt_73 = mk_amt_73;
		this.mk_vat_73 = mk_vat_73;
		this.mk_amt_74 = mk_amt_74;
		this.mk_vat_74 = mk_vat_74;
		this.mk_amt_75 = mk_amt_75;
		this.mk_vat_75 = mk_vat_75;
		this.mk_amt_76 = mk_amt_76;
		this.mk_vat_76 = mk_vat_76;
		this.mk_vat_77 = mk_vat_77;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setVat_fr_yymm(String vat_fr_yymm){
		this.vat_fr_yymm = vat_fr_yymm;
	}

	public void setVat_to_yymm(String vat_to_yymm){
		this.vat_to_yymm = vat_to_yymm;
	}

	public void setMa_amt_01(long ma_amt_01){
		this.ma_amt_01 = ma_amt_01;
	}

	public void setMa_vat_01(long ma_vat_01){
		this.ma_vat_01 = ma_vat_01;
	}

	public void setMa_amt_02(long ma_amt_02){
		this.ma_amt_02 = ma_amt_02;
	}

	public void setMa_vat_02(long ma_vat_02){
		this.ma_vat_02 = ma_vat_02;
	}

	public void setMa_amt_03(long ma_amt_03){
		this.ma_amt_03 = ma_amt_03;
	}

	public void setMa_vat_03(long ma_vat_03){
		this.ma_vat_03 = ma_vat_03;
	}

	public void setMa_amt_04(long ma_amt_04){
		this.ma_amt_04 = ma_amt_04;
	}

	public void setMa_vat_04(long ma_vat_04){
		this.ma_vat_04 = ma_vat_04;
	}

	public void setMa_amt_05(long ma_amt_05){
		this.ma_amt_05 = ma_amt_05;
	}

	public void setMa_amt_06(long ma_amt_06){
		this.ma_amt_06 = ma_amt_06;
	}

	public void setMa_amt_07(long ma_amt_07){
		this.ma_amt_07 = ma_amt_07;
	}

	public void setMa_vat_07(long ma_vat_07){
		this.ma_vat_07 = ma_vat_07;
	}

	public void setMa_amt_08(long ma_amt_08){
		this.ma_amt_08 = ma_amt_08;
	}

	public void setMa_vat_08(long ma_vat_08){
		this.ma_vat_08 = ma_vat_08;
	}

	public void setMa_amt_09(long ma_amt_09){
		this.ma_amt_09 = ma_amt_09;
	}

	public void setMa_vat_09(long ma_vat_09){
		this.ma_vat_09 = ma_vat_09;
	}

	public void setMb_amt_10(long mb_amt_10){
		this.mb_amt_10 = mb_amt_10;
	}

	public void setMb_vat_10(long mb_vat_10){
		this.mb_vat_10 = mb_vat_10;
	}

	public void setMb_amt_11(long mb_amt_11){
		this.mb_amt_11 = mb_amt_11;
	}

	public void setMb_vat_11(long mb_vat_11){
		this.mb_vat_11 = mb_vat_11;
	}

	public void setMb_amt_12(long mb_amt_12){
		this.mb_amt_12 = mb_amt_12;
	}

	public void setMb_vat_12(long mb_vat_12){
		this.mb_vat_12 = mb_vat_12;
	}

	public void setMb_amt_13(long mb_amt_13){
		this.mb_amt_13 = mb_amt_13;
	}

	public void setMb_vat_13(long mb_vat_13){
		this.mb_vat_13 = mb_vat_13;
	}

	public void setMb_amt_14(long mb_amt_14){
		this.mb_amt_14 = mb_amt_14;
	}

	public void setMb_vat_14(long mb_vat_14){
		this.mb_vat_14 = mb_vat_14;
	}

	public void setMb_amt_15(long mb_amt_15){
		this.mb_amt_15 = mb_amt_15;
	}

	public void setMb_vat_15(long mb_vat_15){
		this.mb_vat_15 = mb_vat_15;
	}

	public void setMb_amt_16(long mb_amt_16){
		this.mb_amt_16 = mb_amt_16;
	}

	public void setMb_vat_16(long mb_vat_16){
		this.mb_vat_16 = mb_vat_16;
	}

	public void setMb_amt_17(long mb_amt_17){
		this.mb_amt_17 = mb_amt_17;
	}

	public void setMb_vat_17(long mb_vat_17){
		this.mb_vat_17 = mb_vat_17;
	}

	public void setMb_vat_17_d(long mb_vat_17_d){
		this.mb_vat_17_d = mb_vat_17_d;
	}

	public void setMc_vat_18(long mc_vat_18){
		this.mc_vat_18 = mc_vat_18;
	}

	public void setMc_amt_19(long mc_amt_19){
		this.mc_amt_19 = mc_amt_19;
	}

	public void setMc_vat_19(long mc_vat_19){
		this.mc_vat_19 = mc_vat_19;
	}

	public void setMc_vat_20(long mc_vat_20){
		this.mc_vat_20 = mc_vat_20;
	}

	public void setMc_vat_21(long mc_vat_21){
		this.mc_vat_21 = mc_vat_21;
	}

	public void setMc_vat_22(long mc_vat_22){
		this.mc_vat_22 = mc_vat_22;
	}

	public void setMc_vat_23(long mc_vat_23){
		this.mc_vat_23 = mc_vat_23;
	}

	public void setMc_vat_24(long mc_vat_24){
		this.mc_vat_24 = mc_vat_24;
	}

	public void setMc_vat_25(long mc_vat_25){
		this.mc_vat_25 = mc_vat_25;
	}

	public void setMd_vat_26_b(long md_vat_26_b){
		this.md_vat_26_b = md_vat_26_b;
	}

	public void setMe_amt_31(long me_amt_31){
		this.me_amt_31 = me_amt_31;
	}

	public void setMg_amt_32(long mg_amt_32){
		this.mg_amt_32 = mg_amt_32;
	}

	public void setMg_vat_32(long mg_vat_32){
		this.mg_vat_32 = mg_vat_32;
	}

	public void setMg_amt_33(long mg_amt_33){
		this.mg_amt_33 = mg_amt_33;
	}

	public void setMg_vat_33(long mg_vat_33){
		this.mg_vat_33 = mg_vat_33;
	}

	public void setMg_amt_34(long mg_amt_34){
		this.mg_amt_34 = mg_amt_34;
	}

	public void setMg_amt_35(long mg_amt_35){
		this.mg_amt_35 = mg_amt_35;
	}

	public void setMg_amt_36(long mg_amt_36){
		this.mg_amt_36 = mg_amt_36;
	}

	public void setMg_vat_36(long mg_vat_36){
		this.mg_vat_36 = mg_vat_36;
	}

	public void setMg_amt_37(long mg_amt_37){
		this.mg_amt_37 = mg_amt_37;
	}

	public void setMg_vat_37(long mg_vat_37){
		this.mg_vat_37 = mg_vat_37;
	}

	public void setMg_amt_38(long mg_amt_38){
		this.mg_amt_38 = mg_amt_38;
	}

	public void setMg_vat_38(long mg_vat_38){
		this.mg_vat_38 = mg_vat_38;
	}

	public void setMg_amt_39(long mg_amt_39){
		this.mg_amt_39 = mg_amt_39;
	}

	public void setMg_vat_39(long mg_vat_39){
		this.mg_vat_39 = mg_vat_39;
	}

	public void setMh_amt_40(long mh_amt_40){
		this.mh_amt_40 = mh_amt_40;
	}

	public void setMh_vat_40(long mh_vat_40){
		this.mh_vat_40 = mh_vat_40;
	}

	public void setMh_amt_41(long mh_amt_41){
		this.mh_amt_41 = mh_amt_41;
	}

	public void setMh_vat_41(long mh_vat_41){
		this.mh_vat_41 = mh_vat_41;
	}

	public void setMh_amt_42(long mh_amt_42){
		this.mh_amt_42 = mh_amt_42;
	}

	public void setMh_vat_42(long mh_vat_42){
		this.mh_vat_42 = mh_vat_42;
	}

	public void setMh_amt_43(long mh_amt_43){
		this.mh_amt_43 = mh_amt_43;
	}

	public void setMh_vat_43(long mh_vat_43){
		this.mh_vat_43 = mh_vat_43;
	}

	public void setMh_amt_44(long mh_amt_44){
		this.mh_amt_44 = mh_amt_44;
	}

	public void setMh_vat_44(long mh_vat_44){
		this.mh_vat_44 = mh_vat_44;
	}

	public void setMh_vat_45(long mh_vat_45){
		this.mh_vat_45 = mh_vat_45;
	}

	public void setMh_vat_46(long mh_vat_46){
		this.mh_vat_46 = mh_vat_46;
	}

	public void setMh_vat_47(long mh_vat_47){
		this.mh_vat_47 = mh_vat_47;
	}

	public void setMh_amt_48(long mh_amt_48){
		this.mh_amt_48 = mh_amt_48;
	}

	public void setMh_vat_48(long mh_vat_48){
		this.mh_vat_48 = mh_vat_48;
	}

	public void setMi_amt_49(long mi_amt_49){
		this.mi_amt_49 = mi_amt_49;
	}

	public void setMi_vat_49(long mi_vat_49){
		this.mi_vat_49 = mi_vat_49;
	}

	public void setMi_amt_50(long mi_amt_50){
		this.mi_amt_50 = mi_amt_50;
	}

	public void setMi_vat_50(long mi_vat_50){
		this.mi_vat_50 = mi_vat_50;
	}

	public void setMi_amt_51(long mi_amt_51){
		this.mi_amt_51 = mi_amt_51;
	}

	public void setMi_vat_51(long mi_vat_51){
		this.mi_vat_51 = mi_vat_51;
	}

	public void setMi_amt_52(long mi_amt_52){
		this.mi_amt_52 = mi_amt_52;
	}

	public void setMi_vat_52(long mi_vat_52){
		this.mi_vat_52 = mi_vat_52;
	}

	public void setMj_vat_53(long mj_vat_53){
		this.mj_vat_53 = mj_vat_53;
	}

	public void setMj_vat_54(long mj_vat_54){
		this.mj_vat_54 = mj_vat_54;
	}

	public void setMj_vat_55(long mj_vat_55){
		this.mj_vat_55 = mj_vat_55;
	}

	public void setMj_vat_56(long mj_vat_56){
		this.mj_vat_56 = mj_vat_56;
	}

	public void setMj_vat_57(long mj_vat_57){
		this.mj_vat_57 = mj_vat_57;
	}

	public void setMj_vat_58(long mj_vat_58){
		this.mj_vat_58 = mj_vat_58;
	}

	public void setMk_amt_59(long mk_amt_59){
		this.mk_amt_59 = mk_amt_59;
	}

	public void setMk_vat_59(long mk_vat_59){
		this.mk_vat_59 = mk_vat_59;
	}

	public void setMk_amt_60(long mk_amt_60){
		this.mk_amt_60 = mk_amt_60;
	}

	public void setMk_vat_60(long mk_vat_60){
		this.mk_vat_60 = mk_vat_60;
	}

	public void setMk_amt_61(long mk_amt_61){
		this.mk_amt_61 = mk_amt_61;
	}

	public void setMk_vat_61(long mk_vat_61){
		this.mk_vat_61 = mk_vat_61;
	}

	public void setMk_amt_62(long mk_amt_62){
		this.mk_amt_62 = mk_amt_62;
	}

	public void setMk_vat_62(long mk_vat_62){
		this.mk_vat_62 = mk_vat_62;
	}

	public void setMk_amt_63(long mk_amt_63){
		this.mk_amt_63 = mk_amt_63;
	}

	public void setMk_vat_63(long mk_vat_63){
		this.mk_vat_63 = mk_vat_63;
	}

	public void setMk_amt_64(long mk_amt_64){
		this.mk_amt_64 = mk_amt_64;
	}

	public void setMk_vat_64(long mk_vat_64){
		this.mk_vat_64 = mk_vat_64;
	}

	public void setMk_amt_65(long mk_amt_65){
		this.mk_amt_65 = mk_amt_65;
	}

	public void setMk_vat_65(long mk_vat_65){
		this.mk_vat_65 = mk_vat_65;
	}

	public void setMk_amt_66(long mk_amt_66){
		this.mk_amt_66 = mk_amt_66;
	}

	public void setMk_vat_66(long mk_vat_66){
		this.mk_vat_66 = mk_vat_66;
	}

	public void setMk_amt_67(long mk_amt_67){
		this.mk_amt_67 = mk_amt_67;
	}

	public void setMk_vat_67(long mk_vat_67){
		this.mk_vat_67 = mk_vat_67;
	}

	public void setMk_amt_68(long mk_amt_68){
		this.mk_amt_68 = mk_amt_68;
	}

	public void setMk_vat_68(long mk_vat_68){
		this.mk_vat_68 = mk_vat_68;
	}

	public void setMk_amt_69(long mk_amt_69){
		this.mk_amt_69 = mk_amt_69;
	}

	public void setMk_vat_69(long mk_vat_69){
		this.mk_vat_69 = mk_vat_69;
	}

	public void setMk_amt_70(long mk_amt_70){
		this.mk_amt_70 = mk_amt_70;
	}

	public void setMk_vat_70(long mk_vat_70){
		this.mk_vat_70 = mk_vat_70;
	}

	public void setMk_amt_71(long mk_amt_71){
		this.mk_amt_71 = mk_amt_71;
	}

	public void setMk_vat_71(long mk_vat_71){
		this.mk_vat_71 = mk_vat_71;
	}

	public void setMk_amt_72(long mk_amt_72){
		this.mk_amt_72 = mk_amt_72;
	}

	public void setMk_vat_72(long mk_vat_72){
		this.mk_vat_72 = mk_vat_72;
	}

	public void setMk_amt_73(long mk_amt_73){
		this.mk_amt_73 = mk_amt_73;
	}

	public void setMk_vat_73(long mk_vat_73){
		this.mk_vat_73 = mk_vat_73;
	}

	public void setMk_amt_74(long mk_amt_74){
		this.mk_amt_74 = mk_amt_74;
	}

	public void setMk_vat_74(long mk_vat_74){
		this.mk_vat_74 = mk_vat_74;
	}

	public void setMk_amt_75(long mk_amt_75){
		this.mk_amt_75 = mk_amt_75;
	}

	public void setMk_vat_75(long mk_vat_75){
		this.mk_vat_75 = mk_vat_75;
	}

	public void setMk_amt_76(long mk_amt_76){
		this.mk_amt_76 = mk_amt_76;
	}

	public void setMk_vat_76(long mk_vat_76){
		this.mk_vat_76 = mk_vat_76;
	}

	public void setMk_vat_77(long mk_vat_77){
		this.mk_vat_77 = mk_vat_77;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getVat_fr_yymm(){
		return this.vat_fr_yymm;
	}

	public String getVat_to_yymm(){
		return this.vat_to_yymm;
	}

	public long getMa_amt_01(){
		return this.ma_amt_01;
	}

	public long getMa_vat_01(){
		return this.ma_vat_01;
	}

	public long getMa_amt_02(){
		return this.ma_amt_02;
	}

	public long getMa_vat_02(){
		return this.ma_vat_02;
	}

	public long getMa_amt_03(){
		return this.ma_amt_03;
	}

	public long getMa_vat_03(){
		return this.ma_vat_03;
	}

	public long getMa_amt_04(){
		return this.ma_amt_04;
	}

	public long getMa_vat_04(){
		return this.ma_vat_04;
	}

	public long getMa_amt_05(){
		return this.ma_amt_05;
	}

	public long getMa_amt_06(){
		return this.ma_amt_06;
	}

	public long getMa_amt_07(){
		return this.ma_amt_07;
	}

	public long getMa_vat_07(){
		return this.ma_vat_07;
	}

	public long getMa_amt_08(){
		return this.ma_amt_08;
	}

	public long getMa_vat_08(){
		return this.ma_vat_08;
	}

	public long getMa_amt_09(){
		return this.ma_amt_09;
	}

	public long getMa_vat_09(){
		return this.ma_vat_09;
	}

	public long getMb_amt_10(){
		return this.mb_amt_10;
	}

	public long getMb_vat_10(){
		return this.mb_vat_10;
	}

	public long getMb_amt_11(){
		return this.mb_amt_11;
	}

	public long getMb_vat_11(){
		return this.mb_vat_11;
	}

	public long getMb_amt_12(){
		return this.mb_amt_12;
	}

	public long getMb_vat_12(){
		return this.mb_vat_12;
	}

	public long getMb_amt_13(){
		return this.mb_amt_13;
	}

	public long getMb_vat_13(){
		return this.mb_vat_13;
	}

	public long getMb_amt_14(){
		return this.mb_amt_14;
	}

	public long getMb_vat_14(){
		return this.mb_vat_14;
	}

	public long getMb_amt_15(){
		return this.mb_amt_15;
	}

	public long getMb_vat_15(){
		return this.mb_vat_15;
	}

	public long getMb_amt_16(){
		return this.mb_amt_16;
	}

	public long getMb_vat_16(){
		return this.mb_vat_16;
	}

	public long getMb_amt_17(){
		return this.mb_amt_17;
	}

	public long getMb_vat_17(){
		return this.mb_vat_17;
	}

	public long getMb_vat_17_d(){
		return this.mb_vat_17_d;
	}

	public long getMc_vat_18(){
		return this.mc_vat_18;
	}

	public long getMc_amt_19(){
		return this.mc_amt_19;
	}

	public long getMc_vat_19(){
		return this.mc_vat_19;
	}

	public long getMc_vat_20(){
		return this.mc_vat_20;
	}

	public long getMc_vat_21(){
		return this.mc_vat_21;
	}

	public long getMc_vat_22(){
		return this.mc_vat_22;
	}

	public long getMc_vat_23(){
		return this.mc_vat_23;
	}

	public long getMc_vat_24(){
		return this.mc_vat_24;
	}

	public long getMc_vat_25(){
		return this.mc_vat_25;
	}

	public long getMd_vat_26_b(){
		return this.md_vat_26_b;
	}

	public long getMe_amt_31(){
		return this.me_amt_31;
	}

	public long getMg_amt_32(){
		return this.mg_amt_32;
	}

	public long getMg_vat_32(){
		return this.mg_vat_32;
	}

	public long getMg_amt_33(){
		return this.mg_amt_33;
	}

	public long getMg_vat_33(){
		return this.mg_vat_33;
	}

	public long getMg_amt_34(){
		return this.mg_amt_34;
	}

	public long getMg_amt_35(){
		return this.mg_amt_35;
	}

	public long getMg_amt_36(){
		return this.mg_amt_36;
	}

	public long getMg_vat_36(){
		return this.mg_vat_36;
	}

	public long getMg_amt_37(){
		return this.mg_amt_37;
	}

	public long getMg_vat_37(){
		return this.mg_vat_37;
	}

	public long getMg_amt_38(){
		return this.mg_amt_38;
	}

	public long getMg_vat_38(){
		return this.mg_vat_38;
	}

	public long getMg_amt_39(){
		return this.mg_amt_39;
	}

	public long getMg_vat_39(){
		return this.mg_vat_39;
	}

	public long getMh_amt_40(){
		return this.mh_amt_40;
	}

	public long getMh_vat_40(){
		return this.mh_vat_40;
	}

	public long getMh_amt_41(){
		return this.mh_amt_41;
	}

	public long getMh_vat_41(){
		return this.mh_vat_41;
	}

	public long getMh_amt_42(){
		return this.mh_amt_42;
	}

	public long getMh_vat_42(){
		return this.mh_vat_42;
	}

	public long getMh_amt_43(){
		return this.mh_amt_43;
	}

	public long getMh_vat_43(){
		return this.mh_vat_43;
	}

	public long getMh_amt_44(){
		return this.mh_amt_44;
	}

	public long getMh_vat_44(){
		return this.mh_vat_44;
	}

	public long getMh_vat_45(){
		return this.mh_vat_45;
	}

	public long getMh_vat_46(){
		return this.mh_vat_46;
	}

	public long getMh_vat_47(){
		return this.mh_vat_47;
	}

	public long getMh_amt_48(){
		return this.mh_amt_48;
	}

	public long getMh_vat_48(){
		return this.mh_vat_48;
	}

	public long getMi_amt_49(){
		return this.mi_amt_49;
	}

	public long getMi_vat_49(){
		return this.mi_vat_49;
	}

	public long getMi_amt_50(){
		return this.mi_amt_50;
	}

	public long getMi_vat_50(){
		return this.mi_vat_50;
	}

	public long getMi_amt_51(){
		return this.mi_amt_51;
	}

	public long getMi_vat_51(){
		return this.mi_vat_51;
	}

	public long getMi_amt_52(){
		return this.mi_amt_52;
	}

	public long getMi_vat_52(){
		return this.mi_vat_52;
	}

	public long getMj_vat_53(){
		return this.mj_vat_53;
	}

	public long getMj_vat_54(){
		return this.mj_vat_54;
	}

	public long getMj_vat_55(){
		return this.mj_vat_55;
	}

	public long getMj_vat_56(){
		return this.mj_vat_56;
	}

	public long getMj_vat_57(){
		return this.mj_vat_57;
	}

	public long getMj_vat_58(){
		return this.mj_vat_58;
	}

	public long getMk_amt_59(){
		return this.mk_amt_59;
	}

	public long getMk_vat_59(){
		return this.mk_vat_59;
	}

	public long getMk_amt_60(){
		return this.mk_amt_60;
	}

	public long getMk_vat_60(){
		return this.mk_vat_60;
	}

	public long getMk_amt_61(){
		return this.mk_amt_61;
	}

	public long getMk_vat_61(){
		return this.mk_vat_61;
	}

	public long getMk_amt_62(){
		return this.mk_amt_62;
	}

	public long getMk_vat_62(){
		return this.mk_vat_62;
	}

	public long getMk_amt_63(){
		return this.mk_amt_63;
	}

	public long getMk_vat_63(){
		return this.mk_vat_63;
	}

	public long getMk_amt_64(){
		return this.mk_amt_64;
	}

	public long getMk_vat_64(){
		return this.mk_vat_64;
	}

	public long getMk_amt_65(){
		return this.mk_amt_65;
	}

	public long getMk_vat_65(){
		return this.mk_vat_65;
	}

	public long getMk_amt_66(){
		return this.mk_amt_66;
	}

	public long getMk_vat_66(){
		return this.mk_vat_66;
	}

	public long getMk_amt_67(){
		return this.mk_amt_67;
	}

	public long getMk_vat_67(){
		return this.mk_vat_67;
	}

	public long getMk_amt_68(){
		return this.mk_amt_68;
	}

	public long getMk_vat_68(){
		return this.mk_vat_68;
	}

	public long getMk_amt_69(){
		return this.mk_amt_69;
	}

	public long getMk_vat_69(){
		return this.mk_vat_69;
	}

	public long getMk_amt_70(){
		return this.mk_amt_70;
	}

	public long getMk_vat_70(){
		return this.mk_vat_70;
	}

	public long getMk_amt_71(){
		return this.mk_amt_71;
	}

	public long getMk_vat_71(){
		return this.mk_vat_71;
	}

	public long getMk_amt_72(){
		return this.mk_amt_72;
	}

	public long getMk_vat_72(){
		return this.mk_vat_72;
	}

	public long getMk_amt_73(){
		return this.mk_amt_73;
	}

	public long getMk_vat_73(){
		return this.mk_vat_73;
	}

	public long getMk_amt_74(){
		return this.mk_amt_74;
	}

	public long getMk_vat_74(){
		return this.mk_vat_74;
	}

	public long getMk_amt_75(){
		return this.mk_amt_75;
	}

	public long getMk_vat_75(){
		return this.mk_vat_75;
	}

	public long getMk_amt_76(){
		return this.mk_amt_76;
	}

	public long getMk_vat_76(){
		return this.mk_vat_76;
	}

	public long getMk_vat_77(){
		return this.mk_vat_77;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6212_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6212_ADM dm = (FC_ACCT_6212_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.setString(6, dm.erplace_cd);
		cstmt.setString(7, dm.vat_fr_yymm);
		cstmt.setString(8, dm.vat_to_yymm);
		cstmt.setLong(9, dm.ma_amt_01);
		cstmt.setLong(10, dm.ma_vat_01);
		cstmt.setLong(11, dm.ma_amt_02);
		cstmt.setLong(12, dm.ma_vat_02);
		cstmt.setLong(13, dm.ma_amt_03);
		cstmt.setLong(14, dm.ma_vat_03);
		cstmt.setLong(15, dm.ma_amt_04);
		cstmt.setLong(16, dm.ma_vat_04);
		cstmt.setLong(17, dm.ma_amt_05);
		cstmt.setLong(18, dm.ma_amt_06);
		cstmt.setLong(19, dm.ma_amt_07);
		cstmt.setLong(20, dm.ma_vat_07);
		cstmt.setLong(21, dm.ma_amt_08);
		cstmt.setLong(22, dm.ma_vat_08);
		cstmt.setLong(23, dm.ma_amt_09);
		cstmt.setLong(24, dm.ma_vat_09);
		cstmt.setLong(25, dm.mb_amt_10);
		cstmt.setLong(26, dm.mb_vat_10);
		cstmt.setLong(27, dm.mb_amt_11);
		cstmt.setLong(28, dm.mb_vat_11);
		cstmt.setLong(29, dm.mb_amt_12);
		cstmt.setLong(30, dm.mb_vat_12);
		cstmt.setLong(31, dm.mb_amt_13);
		cstmt.setLong(32, dm.mb_vat_13);
		cstmt.setLong(33, dm.mb_amt_14);
		cstmt.setLong(34, dm.mb_vat_14);
		cstmt.setLong(35, dm.mb_amt_15);
		cstmt.setLong(36, dm.mb_vat_15);
		cstmt.setLong(37, dm.mb_amt_16);
		cstmt.setLong(38, dm.mb_vat_16);
		cstmt.setLong(39, dm.mb_amt_17);
		cstmt.setLong(40, dm.mb_vat_17);
		cstmt.setLong(41, dm.mb_vat_17_d);
		cstmt.setLong(42, dm.mc_vat_18);
		cstmt.setLong(43, dm.mc_amt_19);
		cstmt.setLong(44, dm.mc_vat_19);
		cstmt.setLong(45, dm.mc_vat_20);
		cstmt.setLong(46, dm.mc_vat_21);
		cstmt.setLong(47, dm.mc_vat_22);
		cstmt.setLong(48, dm.mc_vat_23);
		cstmt.setLong(49, dm.mc_vat_24);
		cstmt.setLong(50, dm.mc_vat_25);
		cstmt.setLong(51, dm.md_vat_26_b);
		cstmt.setLong(52, dm.me_amt_31);
		cstmt.setLong(53, dm.mg_amt_32);
		cstmt.setLong(54, dm.mg_vat_32);
		cstmt.setLong(55, dm.mg_amt_33);
		cstmt.setLong(56, dm.mg_vat_33);
		cstmt.setLong(57, dm.mg_amt_34);
		cstmt.setLong(58, dm.mg_amt_35);
		cstmt.setLong(59, dm.mg_amt_36);
		cstmt.setLong(60, dm.mg_vat_36);
		cstmt.setLong(61, dm.mg_amt_37);
		cstmt.setLong(62, dm.mg_vat_37);
		cstmt.setLong(63, dm.mg_amt_38);
		cstmt.setLong(64, dm.mg_vat_38);
		cstmt.setLong(65, dm.mg_amt_39);
		cstmt.setLong(66, dm.mg_vat_39);
		cstmt.setLong(67, dm.mh_amt_40);
		cstmt.setLong(68, dm.mh_vat_40);
		cstmt.setLong(69, dm.mh_amt_41);
		cstmt.setLong(70, dm.mh_vat_41);
		cstmt.setLong(71, dm.mh_amt_42);
		cstmt.setLong(72, dm.mh_vat_42);
		cstmt.setLong(73, dm.mh_amt_43);
		cstmt.setLong(74, dm.mh_vat_43);
		cstmt.setLong(75, dm.mh_amt_44);
		cstmt.setLong(76, dm.mh_vat_44);
		cstmt.setLong(77, dm.mh_vat_45);
		cstmt.setLong(78, dm.mh_vat_46);
		cstmt.setLong(79, dm.mh_vat_47);
		cstmt.setLong(80, dm.mh_amt_48);
		cstmt.setLong(81, dm.mh_vat_48);
		cstmt.setLong(82, dm.mi_amt_49);
		cstmt.setLong(83, dm.mi_vat_49);
		cstmt.setLong(84, dm.mi_amt_50);
		cstmt.setLong(85, dm.mi_vat_50);
		cstmt.setLong(86, dm.mi_amt_51);
		cstmt.setLong(87, dm.mi_vat_51);
		cstmt.setLong(88, dm.mi_amt_52);
		cstmt.setLong(89, dm.mi_vat_52);
		cstmt.setLong(90, dm.mj_vat_53);
		cstmt.setLong(91, dm.mj_vat_54);
		cstmt.setLong(92, dm.mj_vat_55);
		cstmt.setLong(93, dm.mj_vat_56);
		cstmt.setLong(94, dm.mj_vat_57);
		cstmt.setLong(95, dm.mj_vat_58);
		cstmt.setLong(96, dm.mk_amt_59);
		cstmt.setLong(97, dm.mk_vat_59);
		cstmt.setLong(98, dm.mk_amt_60);
		cstmt.setLong(99, dm.mk_vat_60);
		cstmt.setLong(100, dm.mk_amt_61);
		cstmt.setLong(101, dm.mk_vat_61);
		cstmt.setLong(102, dm.mk_amt_62);
		cstmt.setLong(103, dm.mk_vat_62);
		cstmt.setLong(104, dm.mk_amt_63);
		cstmt.setLong(105, dm.mk_vat_63);
		cstmt.setLong(106, dm.mk_amt_64);
		cstmt.setLong(107, dm.mk_vat_64);
		cstmt.setLong(108, dm.mk_amt_65);
		cstmt.setLong(109, dm.mk_vat_65);
		cstmt.setLong(110, dm.mk_amt_66);
		cstmt.setLong(111, dm.mk_vat_66);
		cstmt.setLong(112, dm.mk_amt_67);
		cstmt.setLong(113, dm.mk_vat_67);
		cstmt.setLong(114, dm.mk_amt_68);
		cstmt.setLong(115, dm.mk_vat_68);
		cstmt.setLong(116, dm.mk_amt_69);
		cstmt.setLong(117, dm.mk_vat_69);
		cstmt.setLong(118, dm.mk_amt_70);
		cstmt.setLong(119, dm.mk_vat_70);
		cstmt.setLong(120, dm.mk_amt_71);
		cstmt.setLong(121, dm.mk_vat_71);
		cstmt.setLong(122, dm.mk_amt_72);
		cstmt.setLong(123, dm.mk_vat_72);
		cstmt.setLong(124, dm.mk_amt_73);
		cstmt.setLong(125, dm.mk_vat_73);
		cstmt.setLong(126, dm.mk_amt_74);
		cstmt.setLong(127, dm.mk_vat_74);
		cstmt.setLong(128, dm.mk_amt_75);
		cstmt.setLong(129, dm.mk_vat_75);
		cstmt.setLong(130, dm.mk_amt_76);
		cstmt.setLong(131, dm.mk_vat_76);
		cstmt.setLong(132, dm.mk_vat_77);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6212_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("vat_fr_yymm = [" + getVat_fr_yymm() + "]");
		System.out.println("vat_to_yymm = [" + getVat_to_yymm() + "]");
		System.out.println("ma_amt_01 = [" + getMa_amt_01() + "]");
		System.out.println("ma_vat_01 = [" + getMa_vat_01() + "]");
		System.out.println("ma_amt_02 = [" + getMa_amt_02() + "]");
		System.out.println("ma_vat_02 = [" + getMa_vat_02() + "]");
		System.out.println("ma_amt_03 = [" + getMa_amt_03() + "]");
		System.out.println("ma_vat_03 = [" + getMa_vat_03() + "]");
		System.out.println("ma_amt_04 = [" + getMa_amt_04() + "]");
		System.out.println("ma_vat_04 = [" + getMa_vat_04() + "]");
		System.out.println("ma_amt_05 = [" + getMa_amt_05() + "]");
		System.out.println("ma_amt_06 = [" + getMa_amt_06() + "]");
		System.out.println("ma_amt_07 = [" + getMa_amt_07() + "]");
		System.out.println("ma_vat_07 = [" + getMa_vat_07() + "]");
		System.out.println("ma_amt_08 = [" + getMa_amt_08() + "]");
		System.out.println("ma_vat_08 = [" + getMa_vat_08() + "]");
		System.out.println("ma_amt_09 = [" + getMa_amt_09() + "]");
		System.out.println("ma_vat_09 = [" + getMa_vat_09() + "]");
		System.out.println("mb_amt_10 = [" + getMb_amt_10() + "]");
		System.out.println("mb_vat_10 = [" + getMb_vat_10() + "]");
		System.out.println("mb_amt_11 = [" + getMb_amt_11() + "]");
		System.out.println("mb_vat_11 = [" + getMb_vat_11() + "]");
		System.out.println("mb_amt_12 = [" + getMb_amt_12() + "]");
		System.out.println("mb_vat_12 = [" + getMb_vat_12() + "]");
		System.out.println("mb_amt_13 = [" + getMb_amt_13() + "]");
		System.out.println("mb_vat_13 = [" + getMb_vat_13() + "]");
		System.out.println("mb_amt_14 = [" + getMb_amt_14() + "]");
		System.out.println("mb_vat_14 = [" + getMb_vat_14() + "]");
		System.out.println("mb_amt_15 = [" + getMb_amt_15() + "]");
		System.out.println("mb_vat_15 = [" + getMb_vat_15() + "]");
		System.out.println("mb_amt_16 = [" + getMb_amt_16() + "]");
		System.out.println("mb_vat_16 = [" + getMb_vat_16() + "]");
		System.out.println("mb_amt_17 = [" + getMb_amt_17() + "]");
		System.out.println("mb_vat_17 = [" + getMb_vat_17() + "]");
		System.out.println("mb_vat_17_d = [" + getMb_vat_17_d() + "]");
		System.out.println("mc_vat_18 = [" + getMc_vat_18() + "]");
		System.out.println("mc_amt_19 = [" + getMc_amt_19() + "]");
		System.out.println("mc_vat_19 = [" + getMc_vat_19() + "]");
		System.out.println("mc_vat_20 = [" + getMc_vat_20() + "]");
		System.out.println("mc_vat_21 = [" + getMc_vat_21() + "]");
		System.out.println("mc_vat_22 = [" + getMc_vat_22() + "]");
		System.out.println("mc_vat_23 = [" + getMc_vat_23() + "]");
		System.out.println("mc_vat_24 = [" + getMc_vat_24() + "]");
		System.out.println("mc_vat_25 = [" + getMc_vat_25() + "]");
		System.out.println("md_vat_26_b = [" + getMd_vat_26_b() + "]");
		System.out.println("me_amt_31 = [" + getMe_amt_31() + "]");
		System.out.println("mg_amt_32 = [" + getMg_amt_32() + "]");
		System.out.println("mg_vat_32 = [" + getMg_vat_32() + "]");
		System.out.println("mg_amt_33 = [" + getMg_amt_33() + "]");
		System.out.println("mg_vat_33 = [" + getMg_vat_33() + "]");
		System.out.println("mg_amt_34 = [" + getMg_amt_34() + "]");
		System.out.println("mg_amt_35 = [" + getMg_amt_35() + "]");
		System.out.println("mg_amt_36 = [" + getMg_amt_36() + "]");
		System.out.println("mg_vat_36 = [" + getMg_vat_36() + "]");
		System.out.println("mg_amt_37 = [" + getMg_amt_37() + "]");
		System.out.println("mg_vat_37 = [" + getMg_vat_37() + "]");
		System.out.println("mg_amt_38 = [" + getMg_amt_38() + "]");
		System.out.println("mg_vat_38 = [" + getMg_vat_38() + "]");
		System.out.println("mg_amt_39 = [" + getMg_amt_39() + "]");
		System.out.println("mg_vat_39 = [" + getMg_vat_39() + "]");
		System.out.println("mh_amt_40 = [" + getMh_amt_40() + "]");
		System.out.println("mh_vat_40 = [" + getMh_vat_40() + "]");
		System.out.println("mh_amt_41 = [" + getMh_amt_41() + "]");
		System.out.println("mh_vat_41 = [" + getMh_vat_41() + "]");
		System.out.println("mh_amt_42 = [" + getMh_amt_42() + "]");
		System.out.println("mh_vat_42 = [" + getMh_vat_42() + "]");
		System.out.println("mh_amt_43 = [" + getMh_amt_43() + "]");
		System.out.println("mh_vat_43 = [" + getMh_vat_43() + "]");
		System.out.println("mh_amt_44 = [" + getMh_amt_44() + "]");
		System.out.println("mh_vat_44 = [" + getMh_vat_44() + "]");
		System.out.println("mh_vat_45 = [" + getMh_vat_45() + "]");
		System.out.println("mh_vat_46 = [" + getMh_vat_46() + "]");
		System.out.println("mh_vat_47 = [" + getMh_vat_47() + "]");
		System.out.println("mh_amt_48 = [" + getMh_amt_48() + "]");
		System.out.println("mh_vat_48 = [" + getMh_vat_48() + "]");
		System.out.println("mi_amt_49 = [" + getMi_amt_49() + "]");
		System.out.println("mi_vat_49 = [" + getMi_vat_49() + "]");
		System.out.println("mi_amt_50 = [" + getMi_amt_50() + "]");
		System.out.println("mi_vat_50 = [" + getMi_vat_50() + "]");
		System.out.println("mi_amt_51 = [" + getMi_amt_51() + "]");
		System.out.println("mi_vat_51 = [" + getMi_vat_51() + "]");
		System.out.println("mi_amt_52 = [" + getMi_amt_52() + "]");
		System.out.println("mi_vat_52 = [" + getMi_vat_52() + "]");
		System.out.println("mj_vat_53 = [" + getMj_vat_53() + "]");
		System.out.println("mj_vat_54 = [" + getMj_vat_54() + "]");
		System.out.println("mj_vat_55 = [" + getMj_vat_55() + "]");
		System.out.println("mj_vat_56 = [" + getMj_vat_56() + "]");
		System.out.println("mj_vat_57 = [" + getMj_vat_57() + "]");
		System.out.println("mj_vat_58 = [" + getMj_vat_58() + "]");
		System.out.println("mk_amt_59 = [" + getMk_amt_59() + "]");
		System.out.println("mk_vat_59 = [" + getMk_vat_59() + "]");
		System.out.println("mk_amt_60 = [" + getMk_amt_60() + "]");
		System.out.println("mk_vat_60 = [" + getMk_vat_60() + "]");
		System.out.println("mk_amt_61 = [" + getMk_amt_61() + "]");
		System.out.println("mk_vat_61 = [" + getMk_vat_61() + "]");
		System.out.println("mk_amt_62 = [" + getMk_amt_62() + "]");
		System.out.println("mk_vat_62 = [" + getMk_vat_62() + "]");
		System.out.println("mk_amt_63 = [" + getMk_amt_63() + "]");
		System.out.println("mk_vat_63 = [" + getMk_vat_63() + "]");
		System.out.println("mk_amt_64 = [" + getMk_amt_64() + "]");
		System.out.println("mk_vat_64 = [" + getMk_vat_64() + "]");
		System.out.println("mk_amt_65 = [" + getMk_amt_65() + "]");
		System.out.println("mk_vat_65 = [" + getMk_vat_65() + "]");
		System.out.println("mk_amt_66 = [" + getMk_amt_66() + "]");
		System.out.println("mk_vat_66 = [" + getMk_vat_66() + "]");
		System.out.println("mk_amt_67 = [" + getMk_amt_67() + "]");
		System.out.println("mk_vat_67 = [" + getMk_vat_67() + "]");
		System.out.println("mk_amt_68 = [" + getMk_amt_68() + "]");
		System.out.println("mk_vat_68 = [" + getMk_vat_68() + "]");
		System.out.println("mk_amt_69 = [" + getMk_amt_69() + "]");
		System.out.println("mk_vat_69 = [" + getMk_vat_69() + "]");
		System.out.println("mk_amt_70 = [" + getMk_amt_70() + "]");
		System.out.println("mk_vat_70 = [" + getMk_vat_70() + "]");
		System.out.println("mk_amt_71 = [" + getMk_amt_71() + "]");
		System.out.println("mk_vat_71 = [" + getMk_vat_71() + "]");
		System.out.println("mk_amt_72 = [" + getMk_amt_72() + "]");
		System.out.println("mk_vat_72 = [" + getMk_vat_72() + "]");
		System.out.println("mk_amt_73 = [" + getMk_amt_73() + "]");
		System.out.println("mk_vat_73 = [" + getMk_vat_73() + "]");
		System.out.println("mk_amt_74 = [" + getMk_amt_74() + "]");
		System.out.println("mk_vat_74 = [" + getMk_vat_74() + "]");
		System.out.println("mk_amt_75 = [" + getMk_amt_75() + "]");
		System.out.println("mk_vat_75 = [" + getMk_vat_75() + "]");
		System.out.println("mk_amt_76 = [" + getMk_amt_76() + "]");
		System.out.println("mk_vat_76 = [" + getMk_vat_76() + "]");
		System.out.println("mk_vat_77 = [" + getMk_vat_77() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String vat_fr_yymm = req.getParameter("vat_fr_yymm");
if( vat_fr_yymm == null){
	System.out.println(this.toString+" : vat_fr_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_fr_yymm is "+vat_fr_yymm );
}
String vat_to_yymm = req.getParameter("vat_to_yymm");
if( vat_to_yymm == null){
	System.out.println(this.toString+" : vat_to_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_to_yymm is "+vat_to_yymm );
}
String ma_amt_01 = req.getParameter("ma_amt_01");
if( ma_amt_01 == null){
	System.out.println(this.toString+" : ma_amt_01 is null" );
}else{
	System.out.println(this.toString+" : ma_amt_01 is "+ma_amt_01 );
}
String ma_vat_01 = req.getParameter("ma_vat_01");
if( ma_vat_01 == null){
	System.out.println(this.toString+" : ma_vat_01 is null" );
}else{
	System.out.println(this.toString+" : ma_vat_01 is "+ma_vat_01 );
}
String ma_amt_02 = req.getParameter("ma_amt_02");
if( ma_amt_02 == null){
	System.out.println(this.toString+" : ma_amt_02 is null" );
}else{
	System.out.println(this.toString+" : ma_amt_02 is "+ma_amt_02 );
}
String ma_vat_02 = req.getParameter("ma_vat_02");
if( ma_vat_02 == null){
	System.out.println(this.toString+" : ma_vat_02 is null" );
}else{
	System.out.println(this.toString+" : ma_vat_02 is "+ma_vat_02 );
}
String ma_amt_03 = req.getParameter("ma_amt_03");
if( ma_amt_03 == null){
	System.out.println(this.toString+" : ma_amt_03 is null" );
}else{
	System.out.println(this.toString+" : ma_amt_03 is "+ma_amt_03 );
}
String ma_vat_03 = req.getParameter("ma_vat_03");
if( ma_vat_03 == null){
	System.out.println(this.toString+" : ma_vat_03 is null" );
}else{
	System.out.println(this.toString+" : ma_vat_03 is "+ma_vat_03 );
}
String ma_amt_04 = req.getParameter("ma_amt_04");
if( ma_amt_04 == null){
	System.out.println(this.toString+" : ma_amt_04 is null" );
}else{
	System.out.println(this.toString+" : ma_amt_04 is "+ma_amt_04 );
}
String ma_vat_04 = req.getParameter("ma_vat_04");
if( ma_vat_04 == null){
	System.out.println(this.toString+" : ma_vat_04 is null" );
}else{
	System.out.println(this.toString+" : ma_vat_04 is "+ma_vat_04 );
}
String ma_amt_05 = req.getParameter("ma_amt_05");
if( ma_amt_05 == null){
	System.out.println(this.toString+" : ma_amt_05 is null" );
}else{
	System.out.println(this.toString+" : ma_amt_05 is "+ma_amt_05 );
}
String ma_amt_06 = req.getParameter("ma_amt_06");
if( ma_amt_06 == null){
	System.out.println(this.toString+" : ma_amt_06 is null" );
}else{
	System.out.println(this.toString+" : ma_amt_06 is "+ma_amt_06 );
}
String ma_amt_07 = req.getParameter("ma_amt_07");
if( ma_amt_07 == null){
	System.out.println(this.toString+" : ma_amt_07 is null" );
}else{
	System.out.println(this.toString+" : ma_amt_07 is "+ma_amt_07 );
}
String ma_vat_07 = req.getParameter("ma_vat_07");
if( ma_vat_07 == null){
	System.out.println(this.toString+" : ma_vat_07 is null" );
}else{
	System.out.println(this.toString+" : ma_vat_07 is "+ma_vat_07 );
}
String ma_amt_08 = req.getParameter("ma_amt_08");
if( ma_amt_08 == null){
	System.out.println(this.toString+" : ma_amt_08 is null" );
}else{
	System.out.println(this.toString+" : ma_amt_08 is "+ma_amt_08 );
}
String ma_vat_08 = req.getParameter("ma_vat_08");
if( ma_vat_08 == null){
	System.out.println(this.toString+" : ma_vat_08 is null" );
}else{
	System.out.println(this.toString+" : ma_vat_08 is "+ma_vat_08 );
}
String ma_amt_09 = req.getParameter("ma_amt_09");
if( ma_amt_09 == null){
	System.out.println(this.toString+" : ma_amt_09 is null" );
}else{
	System.out.println(this.toString+" : ma_amt_09 is "+ma_amt_09 );
}
String ma_vat_09 = req.getParameter("ma_vat_09");
if( ma_vat_09 == null){
	System.out.println(this.toString+" : ma_vat_09 is null" );
}else{
	System.out.println(this.toString+" : ma_vat_09 is "+ma_vat_09 );
}
String mb_amt_10 = req.getParameter("mb_amt_10");
if( mb_amt_10 == null){
	System.out.println(this.toString+" : mb_amt_10 is null" );
}else{
	System.out.println(this.toString+" : mb_amt_10 is "+mb_amt_10 );
}
String mb_vat_10 = req.getParameter("mb_vat_10");
if( mb_vat_10 == null){
	System.out.println(this.toString+" : mb_vat_10 is null" );
}else{
	System.out.println(this.toString+" : mb_vat_10 is "+mb_vat_10 );
}
String mb_amt_11 = req.getParameter("mb_amt_11");
if( mb_amt_11 == null){
	System.out.println(this.toString+" : mb_amt_11 is null" );
}else{
	System.out.println(this.toString+" : mb_amt_11 is "+mb_amt_11 );
}
String mb_vat_11 = req.getParameter("mb_vat_11");
if( mb_vat_11 == null){
	System.out.println(this.toString+" : mb_vat_11 is null" );
}else{
	System.out.println(this.toString+" : mb_vat_11 is "+mb_vat_11 );
}
String mb_amt_12 = req.getParameter("mb_amt_12");
if( mb_amt_12 == null){
	System.out.println(this.toString+" : mb_amt_12 is null" );
}else{
	System.out.println(this.toString+" : mb_amt_12 is "+mb_amt_12 );
}
String mb_vat_12 = req.getParameter("mb_vat_12");
if( mb_vat_12 == null){
	System.out.println(this.toString+" : mb_vat_12 is null" );
}else{
	System.out.println(this.toString+" : mb_vat_12 is "+mb_vat_12 );
}
String mb_amt_13 = req.getParameter("mb_amt_13");
if( mb_amt_13 == null){
	System.out.println(this.toString+" : mb_amt_13 is null" );
}else{
	System.out.println(this.toString+" : mb_amt_13 is "+mb_amt_13 );
}
String mb_vat_13 = req.getParameter("mb_vat_13");
if( mb_vat_13 == null){
	System.out.println(this.toString+" : mb_vat_13 is null" );
}else{
	System.out.println(this.toString+" : mb_vat_13 is "+mb_vat_13 );
}
String mb_amt_14 = req.getParameter("mb_amt_14");
if( mb_amt_14 == null){
	System.out.println(this.toString+" : mb_amt_14 is null" );
}else{
	System.out.println(this.toString+" : mb_amt_14 is "+mb_amt_14 );
}
String mb_vat_14 = req.getParameter("mb_vat_14");
if( mb_vat_14 == null){
	System.out.println(this.toString+" : mb_vat_14 is null" );
}else{
	System.out.println(this.toString+" : mb_vat_14 is "+mb_vat_14 );
}
String mb_amt_15 = req.getParameter("mb_amt_15");
if( mb_amt_15 == null){
	System.out.println(this.toString+" : mb_amt_15 is null" );
}else{
	System.out.println(this.toString+" : mb_amt_15 is "+mb_amt_15 );
}
String mb_vat_15 = req.getParameter("mb_vat_15");
if( mb_vat_15 == null){
	System.out.println(this.toString+" : mb_vat_15 is null" );
}else{
	System.out.println(this.toString+" : mb_vat_15 is "+mb_vat_15 );
}
String mb_amt_16 = req.getParameter("mb_amt_16");
if( mb_amt_16 == null){
	System.out.println(this.toString+" : mb_amt_16 is null" );
}else{
	System.out.println(this.toString+" : mb_amt_16 is "+mb_amt_16 );
}
String mb_vat_16 = req.getParameter("mb_vat_16");
if( mb_vat_16 == null){
	System.out.println(this.toString+" : mb_vat_16 is null" );
}else{
	System.out.println(this.toString+" : mb_vat_16 is "+mb_vat_16 );
}
String mb_amt_17 = req.getParameter("mb_amt_17");
if( mb_amt_17 == null){
	System.out.println(this.toString+" : mb_amt_17 is null" );
}else{
	System.out.println(this.toString+" : mb_amt_17 is "+mb_amt_17 );
}
String mb_vat_17 = req.getParameter("mb_vat_17");
if( mb_vat_17 == null){
	System.out.println(this.toString+" : mb_vat_17 is null" );
}else{
	System.out.println(this.toString+" : mb_vat_17 is "+mb_vat_17 );
}
String mb_vat_17_d = req.getParameter("mb_vat_17_d");
if( mb_vat_17_d == null){
	System.out.println(this.toString+" : mb_vat_17_d is null" );
}else{
	System.out.println(this.toString+" : mb_vat_17_d is "+mb_vat_17_d );
}
String mc_vat_18 = req.getParameter("mc_vat_18");
if( mc_vat_18 == null){
	System.out.println(this.toString+" : mc_vat_18 is null" );
}else{
	System.out.println(this.toString+" : mc_vat_18 is "+mc_vat_18 );
}
String mc_amt_19 = req.getParameter("mc_amt_19");
if( mc_amt_19 == null){
	System.out.println(this.toString+" : mc_amt_19 is null" );
}else{
	System.out.println(this.toString+" : mc_amt_19 is "+mc_amt_19 );
}
String mc_vat_19 = req.getParameter("mc_vat_19");
if( mc_vat_19 == null){
	System.out.println(this.toString+" : mc_vat_19 is null" );
}else{
	System.out.println(this.toString+" : mc_vat_19 is "+mc_vat_19 );
}
String mc_vat_20 = req.getParameter("mc_vat_20");
if( mc_vat_20 == null){
	System.out.println(this.toString+" : mc_vat_20 is null" );
}else{
	System.out.println(this.toString+" : mc_vat_20 is "+mc_vat_20 );
}
String mc_vat_21 = req.getParameter("mc_vat_21");
if( mc_vat_21 == null){
	System.out.println(this.toString+" : mc_vat_21 is null" );
}else{
	System.out.println(this.toString+" : mc_vat_21 is "+mc_vat_21 );
}
String mc_vat_22 = req.getParameter("mc_vat_22");
if( mc_vat_22 == null){
	System.out.println(this.toString+" : mc_vat_22 is null" );
}else{
	System.out.println(this.toString+" : mc_vat_22 is "+mc_vat_22 );
}
String mc_vat_23 = req.getParameter("mc_vat_23");
if( mc_vat_23 == null){
	System.out.println(this.toString+" : mc_vat_23 is null" );
}else{
	System.out.println(this.toString+" : mc_vat_23 is "+mc_vat_23 );
}
String mc_vat_24 = req.getParameter("mc_vat_24");
if( mc_vat_24 == null){
	System.out.println(this.toString+" : mc_vat_24 is null" );
}else{
	System.out.println(this.toString+" : mc_vat_24 is "+mc_vat_24 );
}
String mc_vat_25 = req.getParameter("mc_vat_25");
if( mc_vat_25 == null){
	System.out.println(this.toString+" : mc_vat_25 is null" );
}else{
	System.out.println(this.toString+" : mc_vat_25 is "+mc_vat_25 );
}
String md_vat_26_b = req.getParameter("md_vat_26_b");
if( md_vat_26_b == null){
	System.out.println(this.toString+" : md_vat_26_b is null" );
}else{
	System.out.println(this.toString+" : md_vat_26_b is "+md_vat_26_b );
}
String me_amt_31 = req.getParameter("me_amt_31");
if( me_amt_31 == null){
	System.out.println(this.toString+" : me_amt_31 is null" );
}else{
	System.out.println(this.toString+" : me_amt_31 is "+me_amt_31 );
}
String mg_amt_32 = req.getParameter("mg_amt_32");
if( mg_amt_32 == null){
	System.out.println(this.toString+" : mg_amt_32 is null" );
}else{
	System.out.println(this.toString+" : mg_amt_32 is "+mg_amt_32 );
}
String mg_vat_32 = req.getParameter("mg_vat_32");
if( mg_vat_32 == null){
	System.out.println(this.toString+" : mg_vat_32 is null" );
}else{
	System.out.println(this.toString+" : mg_vat_32 is "+mg_vat_32 );
}
String mg_amt_33 = req.getParameter("mg_amt_33");
if( mg_amt_33 == null){
	System.out.println(this.toString+" : mg_amt_33 is null" );
}else{
	System.out.println(this.toString+" : mg_amt_33 is "+mg_amt_33 );
}
String mg_vat_33 = req.getParameter("mg_vat_33");
if( mg_vat_33 == null){
	System.out.println(this.toString+" : mg_vat_33 is null" );
}else{
	System.out.println(this.toString+" : mg_vat_33 is "+mg_vat_33 );
}
String mg_amt_34 = req.getParameter("mg_amt_34");
if( mg_amt_34 == null){
	System.out.println(this.toString+" : mg_amt_34 is null" );
}else{
	System.out.println(this.toString+" : mg_amt_34 is "+mg_amt_34 );
}
String mg_amt_35 = req.getParameter("mg_amt_35");
if( mg_amt_35 == null){
	System.out.println(this.toString+" : mg_amt_35 is null" );
}else{
	System.out.println(this.toString+" : mg_amt_35 is "+mg_amt_35 );
}
String mg_amt_36 = req.getParameter("mg_amt_36");
if( mg_amt_36 == null){
	System.out.println(this.toString+" : mg_amt_36 is null" );
}else{
	System.out.println(this.toString+" : mg_amt_36 is "+mg_amt_36 );
}
String mg_vat_36 = req.getParameter("mg_vat_36");
if( mg_vat_36 == null){
	System.out.println(this.toString+" : mg_vat_36 is null" );
}else{
	System.out.println(this.toString+" : mg_vat_36 is "+mg_vat_36 );
}
String mg_amt_37 = req.getParameter("mg_amt_37");
if( mg_amt_37 == null){
	System.out.println(this.toString+" : mg_amt_37 is null" );
}else{
	System.out.println(this.toString+" : mg_amt_37 is "+mg_amt_37 );
}
String mg_vat_37 = req.getParameter("mg_vat_37");
if( mg_vat_37 == null){
	System.out.println(this.toString+" : mg_vat_37 is null" );
}else{
	System.out.println(this.toString+" : mg_vat_37 is "+mg_vat_37 );
}
String mg_amt_38 = req.getParameter("mg_amt_38");
if( mg_amt_38 == null){
	System.out.println(this.toString+" : mg_amt_38 is null" );
}else{
	System.out.println(this.toString+" : mg_amt_38 is "+mg_amt_38 );
}
String mg_vat_38 = req.getParameter("mg_vat_38");
if( mg_vat_38 == null){
	System.out.println(this.toString+" : mg_vat_38 is null" );
}else{
	System.out.println(this.toString+" : mg_vat_38 is "+mg_vat_38 );
}
String mg_amt_39 = req.getParameter("mg_amt_39");
if( mg_amt_39 == null){
	System.out.println(this.toString+" : mg_amt_39 is null" );
}else{
	System.out.println(this.toString+" : mg_amt_39 is "+mg_amt_39 );
}
String mg_vat_39 = req.getParameter("mg_vat_39");
if( mg_vat_39 == null){
	System.out.println(this.toString+" : mg_vat_39 is null" );
}else{
	System.out.println(this.toString+" : mg_vat_39 is "+mg_vat_39 );
}
String mh_amt_40 = req.getParameter("mh_amt_40");
if( mh_amt_40 == null){
	System.out.println(this.toString+" : mh_amt_40 is null" );
}else{
	System.out.println(this.toString+" : mh_amt_40 is "+mh_amt_40 );
}
String mh_vat_40 = req.getParameter("mh_vat_40");
if( mh_vat_40 == null){
	System.out.println(this.toString+" : mh_vat_40 is null" );
}else{
	System.out.println(this.toString+" : mh_vat_40 is "+mh_vat_40 );
}
String mh_amt_41 = req.getParameter("mh_amt_41");
if( mh_amt_41 == null){
	System.out.println(this.toString+" : mh_amt_41 is null" );
}else{
	System.out.println(this.toString+" : mh_amt_41 is "+mh_amt_41 );
}
String mh_vat_41 = req.getParameter("mh_vat_41");
if( mh_vat_41 == null){
	System.out.println(this.toString+" : mh_vat_41 is null" );
}else{
	System.out.println(this.toString+" : mh_vat_41 is "+mh_vat_41 );
}
String mh_amt_42 = req.getParameter("mh_amt_42");
if( mh_amt_42 == null){
	System.out.println(this.toString+" : mh_amt_42 is null" );
}else{
	System.out.println(this.toString+" : mh_amt_42 is "+mh_amt_42 );
}
String mh_vat_42 = req.getParameter("mh_vat_42");
if( mh_vat_42 == null){
	System.out.println(this.toString+" : mh_vat_42 is null" );
}else{
	System.out.println(this.toString+" : mh_vat_42 is "+mh_vat_42 );
}
String mh_amt_43 = req.getParameter("mh_amt_43");
if( mh_amt_43 == null){
	System.out.println(this.toString+" : mh_amt_43 is null" );
}else{
	System.out.println(this.toString+" : mh_amt_43 is "+mh_amt_43 );
}
String mh_vat_43 = req.getParameter("mh_vat_43");
if( mh_vat_43 == null){
	System.out.println(this.toString+" : mh_vat_43 is null" );
}else{
	System.out.println(this.toString+" : mh_vat_43 is "+mh_vat_43 );
}
String mh_amt_44 = req.getParameter("mh_amt_44");
if( mh_amt_44 == null){
	System.out.println(this.toString+" : mh_amt_44 is null" );
}else{
	System.out.println(this.toString+" : mh_amt_44 is "+mh_amt_44 );
}
String mh_vat_44 = req.getParameter("mh_vat_44");
if( mh_vat_44 == null){
	System.out.println(this.toString+" : mh_vat_44 is null" );
}else{
	System.out.println(this.toString+" : mh_vat_44 is "+mh_vat_44 );
}
String mh_vat_45 = req.getParameter("mh_vat_45");
if( mh_vat_45 == null){
	System.out.println(this.toString+" : mh_vat_45 is null" );
}else{
	System.out.println(this.toString+" : mh_vat_45 is "+mh_vat_45 );
}
String mh_vat_46 = req.getParameter("mh_vat_46");
if( mh_vat_46 == null){
	System.out.println(this.toString+" : mh_vat_46 is null" );
}else{
	System.out.println(this.toString+" : mh_vat_46 is "+mh_vat_46 );
}
String mh_vat_47 = req.getParameter("mh_vat_47");
if( mh_vat_47 == null){
	System.out.println(this.toString+" : mh_vat_47 is null" );
}else{
	System.out.println(this.toString+" : mh_vat_47 is "+mh_vat_47 );
}
String mh_amt_48 = req.getParameter("mh_amt_48");
if( mh_amt_48 == null){
	System.out.println(this.toString+" : mh_amt_48 is null" );
}else{
	System.out.println(this.toString+" : mh_amt_48 is "+mh_amt_48 );
}
String mh_vat_48 = req.getParameter("mh_vat_48");
if( mh_vat_48 == null){
	System.out.println(this.toString+" : mh_vat_48 is null" );
}else{
	System.out.println(this.toString+" : mh_vat_48 is "+mh_vat_48 );
}
String mi_amt_49 = req.getParameter("mi_amt_49");
if( mi_amt_49 == null){
	System.out.println(this.toString+" : mi_amt_49 is null" );
}else{
	System.out.println(this.toString+" : mi_amt_49 is "+mi_amt_49 );
}
String mi_vat_49 = req.getParameter("mi_vat_49");
if( mi_vat_49 == null){
	System.out.println(this.toString+" : mi_vat_49 is null" );
}else{
	System.out.println(this.toString+" : mi_vat_49 is "+mi_vat_49 );
}
String mi_amt_50 = req.getParameter("mi_amt_50");
if( mi_amt_50 == null){
	System.out.println(this.toString+" : mi_amt_50 is null" );
}else{
	System.out.println(this.toString+" : mi_amt_50 is "+mi_amt_50 );
}
String mi_vat_50 = req.getParameter("mi_vat_50");
if( mi_vat_50 == null){
	System.out.println(this.toString+" : mi_vat_50 is null" );
}else{
	System.out.println(this.toString+" : mi_vat_50 is "+mi_vat_50 );
}
String mi_amt_51 = req.getParameter("mi_amt_51");
if( mi_amt_51 == null){
	System.out.println(this.toString+" : mi_amt_51 is null" );
}else{
	System.out.println(this.toString+" : mi_amt_51 is "+mi_amt_51 );
}
String mi_vat_51 = req.getParameter("mi_vat_51");
if( mi_vat_51 == null){
	System.out.println(this.toString+" : mi_vat_51 is null" );
}else{
	System.out.println(this.toString+" : mi_vat_51 is "+mi_vat_51 );
}
String mi_amt_52 = req.getParameter("mi_amt_52");
if( mi_amt_52 == null){
	System.out.println(this.toString+" : mi_amt_52 is null" );
}else{
	System.out.println(this.toString+" : mi_amt_52 is "+mi_amt_52 );
}
String mi_vat_52 = req.getParameter("mi_vat_52");
if( mi_vat_52 == null){
	System.out.println(this.toString+" : mi_vat_52 is null" );
}else{
	System.out.println(this.toString+" : mi_vat_52 is "+mi_vat_52 );
}
String mj_vat_53 = req.getParameter("mj_vat_53");
if( mj_vat_53 == null){
	System.out.println(this.toString+" : mj_vat_53 is null" );
}else{
	System.out.println(this.toString+" : mj_vat_53 is "+mj_vat_53 );
}
String mj_vat_54 = req.getParameter("mj_vat_54");
if( mj_vat_54 == null){
	System.out.println(this.toString+" : mj_vat_54 is null" );
}else{
	System.out.println(this.toString+" : mj_vat_54 is "+mj_vat_54 );
}
String mj_vat_55 = req.getParameter("mj_vat_55");
if( mj_vat_55 == null){
	System.out.println(this.toString+" : mj_vat_55 is null" );
}else{
	System.out.println(this.toString+" : mj_vat_55 is "+mj_vat_55 );
}
String mj_vat_56 = req.getParameter("mj_vat_56");
if( mj_vat_56 == null){
	System.out.println(this.toString+" : mj_vat_56 is null" );
}else{
	System.out.println(this.toString+" : mj_vat_56 is "+mj_vat_56 );
}
String mj_vat_57 = req.getParameter("mj_vat_57");
if( mj_vat_57 == null){
	System.out.println(this.toString+" : mj_vat_57 is null" );
}else{
	System.out.println(this.toString+" : mj_vat_57 is "+mj_vat_57 );
}
String mj_vat_58 = req.getParameter("mj_vat_58");
if( mj_vat_58 == null){
	System.out.println(this.toString+" : mj_vat_58 is null" );
}else{
	System.out.println(this.toString+" : mj_vat_58 is "+mj_vat_58 );
}
String mk_amt_59 = req.getParameter("mk_amt_59");
if( mk_amt_59 == null){
	System.out.println(this.toString+" : mk_amt_59 is null" );
}else{
	System.out.println(this.toString+" : mk_amt_59 is "+mk_amt_59 );
}
String mk_vat_59 = req.getParameter("mk_vat_59");
if( mk_vat_59 == null){
	System.out.println(this.toString+" : mk_vat_59 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_59 is "+mk_vat_59 );
}
String mk_amt_60 = req.getParameter("mk_amt_60");
if( mk_amt_60 == null){
	System.out.println(this.toString+" : mk_amt_60 is null" );
}else{
	System.out.println(this.toString+" : mk_amt_60 is "+mk_amt_60 );
}
String mk_vat_60 = req.getParameter("mk_vat_60");
if( mk_vat_60 == null){
	System.out.println(this.toString+" : mk_vat_60 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_60 is "+mk_vat_60 );
}
String mk_amt_61 = req.getParameter("mk_amt_61");
if( mk_amt_61 == null){
	System.out.println(this.toString+" : mk_amt_61 is null" );
}else{
	System.out.println(this.toString+" : mk_amt_61 is "+mk_amt_61 );
}
String mk_vat_61 = req.getParameter("mk_vat_61");
if( mk_vat_61 == null){
	System.out.println(this.toString+" : mk_vat_61 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_61 is "+mk_vat_61 );
}
String mk_amt_62 = req.getParameter("mk_amt_62");
if( mk_amt_62 == null){
	System.out.println(this.toString+" : mk_amt_62 is null" );
}else{
	System.out.println(this.toString+" : mk_amt_62 is "+mk_amt_62 );
}
String mk_vat_62 = req.getParameter("mk_vat_62");
if( mk_vat_62 == null){
	System.out.println(this.toString+" : mk_vat_62 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_62 is "+mk_vat_62 );
}
String mk_amt_63 = req.getParameter("mk_amt_63");
if( mk_amt_63 == null){
	System.out.println(this.toString+" : mk_amt_63 is null" );
}else{
	System.out.println(this.toString+" : mk_amt_63 is "+mk_amt_63 );
}
String mk_vat_63 = req.getParameter("mk_vat_63");
if( mk_vat_63 == null){
	System.out.println(this.toString+" : mk_vat_63 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_63 is "+mk_vat_63 );
}
String mk_amt_64 = req.getParameter("mk_amt_64");
if( mk_amt_64 == null){
	System.out.println(this.toString+" : mk_amt_64 is null" );
}else{
	System.out.println(this.toString+" : mk_amt_64 is "+mk_amt_64 );
}
String mk_vat_64 = req.getParameter("mk_vat_64");
if( mk_vat_64 == null){
	System.out.println(this.toString+" : mk_vat_64 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_64 is "+mk_vat_64 );
}
String mk_amt_65 = req.getParameter("mk_amt_65");
if( mk_amt_65 == null){
	System.out.println(this.toString+" : mk_amt_65 is null" );
}else{
	System.out.println(this.toString+" : mk_amt_65 is "+mk_amt_65 );
}
String mk_vat_65 = req.getParameter("mk_vat_65");
if( mk_vat_65 == null){
	System.out.println(this.toString+" : mk_vat_65 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_65 is "+mk_vat_65 );
}
String mk_amt_66 = req.getParameter("mk_amt_66");
if( mk_amt_66 == null){
	System.out.println(this.toString+" : mk_amt_66 is null" );
}else{
	System.out.println(this.toString+" : mk_amt_66 is "+mk_amt_66 );
}
String mk_vat_66 = req.getParameter("mk_vat_66");
if( mk_vat_66 == null){
	System.out.println(this.toString+" : mk_vat_66 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_66 is "+mk_vat_66 );
}
String mk_amt_67 = req.getParameter("mk_amt_67");
if( mk_amt_67 == null){
	System.out.println(this.toString+" : mk_amt_67 is null" );
}else{
	System.out.println(this.toString+" : mk_amt_67 is "+mk_amt_67 );
}
String mk_vat_67 = req.getParameter("mk_vat_67");
if( mk_vat_67 == null){
	System.out.println(this.toString+" : mk_vat_67 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_67 is "+mk_vat_67 );
}
String mk_amt_68 = req.getParameter("mk_amt_68");
if( mk_amt_68 == null){
	System.out.println(this.toString+" : mk_amt_68 is null" );
}else{
	System.out.println(this.toString+" : mk_amt_68 is "+mk_amt_68 );
}
String mk_vat_68 = req.getParameter("mk_vat_68");
if( mk_vat_68 == null){
	System.out.println(this.toString+" : mk_vat_68 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_68 is "+mk_vat_68 );
}
String mk_amt_69 = req.getParameter("mk_amt_69");
if( mk_amt_69 == null){
	System.out.println(this.toString+" : mk_amt_69 is null" );
}else{
	System.out.println(this.toString+" : mk_amt_69 is "+mk_amt_69 );
}
String mk_vat_69 = req.getParameter("mk_vat_69");
if( mk_vat_69 == null){
	System.out.println(this.toString+" : mk_vat_69 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_69 is "+mk_vat_69 );
}
String mk_amt_70 = req.getParameter("mk_amt_70");
if( mk_amt_70 == null){
	System.out.println(this.toString+" : mk_amt_70 is null" );
}else{
	System.out.println(this.toString+" : mk_amt_70 is "+mk_amt_70 );
}
String mk_vat_70 = req.getParameter("mk_vat_70");
if( mk_vat_70 == null){
	System.out.println(this.toString+" : mk_vat_70 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_70 is "+mk_vat_70 );
}
String mk_amt_71 = req.getParameter("mk_amt_71");
if( mk_amt_71 == null){
	System.out.println(this.toString+" : mk_amt_71 is null" );
}else{
	System.out.println(this.toString+" : mk_amt_71 is "+mk_amt_71 );
}
String mk_vat_71 = req.getParameter("mk_vat_71");
if( mk_vat_71 == null){
	System.out.println(this.toString+" : mk_vat_71 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_71 is "+mk_vat_71 );
}
String mk_amt_72 = req.getParameter("mk_amt_72");
if( mk_amt_72 == null){
	System.out.println(this.toString+" : mk_amt_72 is null" );
}else{
	System.out.println(this.toString+" : mk_amt_72 is "+mk_amt_72 );
}
String mk_vat_72 = req.getParameter("mk_vat_72");
if( mk_vat_72 == null){
	System.out.println(this.toString+" : mk_vat_72 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_72 is "+mk_vat_72 );
}
String mk_amt_73 = req.getParameter("mk_amt_73");
if( mk_amt_73 == null){
	System.out.println(this.toString+" : mk_amt_73 is null" );
}else{
	System.out.println(this.toString+" : mk_amt_73 is "+mk_amt_73 );
}
String mk_vat_73 = req.getParameter("mk_vat_73");
if( mk_vat_73 == null){
	System.out.println(this.toString+" : mk_vat_73 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_73 is "+mk_vat_73 );
}
String mk_amt_74 = req.getParameter("mk_amt_74");
if( mk_amt_74 == null){
	System.out.println(this.toString+" : mk_amt_74 is null" );
}else{
	System.out.println(this.toString+" : mk_amt_74 is "+mk_amt_74 );
}
String mk_vat_74 = req.getParameter("mk_vat_74");
if( mk_vat_74 == null){
	System.out.println(this.toString+" : mk_vat_74 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_74 is "+mk_vat_74 );
}
String mk_amt_75 = req.getParameter("mk_amt_75");
if( mk_amt_75 == null){
	System.out.println(this.toString+" : mk_amt_75 is null" );
}else{
	System.out.println(this.toString+" : mk_amt_75 is "+mk_amt_75 );
}
String mk_vat_75 = req.getParameter("mk_vat_75");
if( mk_vat_75 == null){
	System.out.println(this.toString+" : mk_vat_75 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_75 is "+mk_vat_75 );
}
String mk_amt_76 = req.getParameter("mk_amt_76");
if( mk_amt_76 == null){
	System.out.println(this.toString+" : mk_amt_76 is null" );
}else{
	System.out.println(this.toString+" : mk_amt_76 is "+mk_amt_76 );
}
String mk_vat_76 = req.getParameter("mk_vat_76");
if( mk_vat_76 == null){
	System.out.println(this.toString+" : mk_vat_76 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_76 is "+mk_vat_76 );
}
String mk_vat_77 = req.getParameter("mk_vat_77");
if( mk_vat_77 == null){
	System.out.println(this.toString+" : mk_vat_77 is null" );
}else{
	System.out.println(this.toString+" : mk_vat_77 is "+mk_vat_77 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String vat_fr_yymm = Util.checkString(req.getParameter("vat_fr_yymm"));
String vat_to_yymm = Util.checkString(req.getParameter("vat_to_yymm"));
String ma_amt_01 = Util.checkString(req.getParameter("ma_amt_01"));
String ma_vat_01 = Util.checkString(req.getParameter("ma_vat_01"));
String ma_amt_02 = Util.checkString(req.getParameter("ma_amt_02"));
String ma_vat_02 = Util.checkString(req.getParameter("ma_vat_02"));
String ma_amt_03 = Util.checkString(req.getParameter("ma_amt_03"));
String ma_vat_03 = Util.checkString(req.getParameter("ma_vat_03"));
String ma_amt_04 = Util.checkString(req.getParameter("ma_amt_04"));
String ma_vat_04 = Util.checkString(req.getParameter("ma_vat_04"));
String ma_amt_05 = Util.checkString(req.getParameter("ma_amt_05"));
String ma_amt_06 = Util.checkString(req.getParameter("ma_amt_06"));
String ma_amt_07 = Util.checkString(req.getParameter("ma_amt_07"));
String ma_vat_07 = Util.checkString(req.getParameter("ma_vat_07"));
String ma_amt_08 = Util.checkString(req.getParameter("ma_amt_08"));
String ma_vat_08 = Util.checkString(req.getParameter("ma_vat_08"));
String ma_amt_09 = Util.checkString(req.getParameter("ma_amt_09"));
String ma_vat_09 = Util.checkString(req.getParameter("ma_vat_09"));
String mb_amt_10 = Util.checkString(req.getParameter("mb_amt_10"));
String mb_vat_10 = Util.checkString(req.getParameter("mb_vat_10"));
String mb_amt_11 = Util.checkString(req.getParameter("mb_amt_11"));
String mb_vat_11 = Util.checkString(req.getParameter("mb_vat_11"));
String mb_amt_12 = Util.checkString(req.getParameter("mb_amt_12"));
String mb_vat_12 = Util.checkString(req.getParameter("mb_vat_12"));
String mb_amt_13 = Util.checkString(req.getParameter("mb_amt_13"));
String mb_vat_13 = Util.checkString(req.getParameter("mb_vat_13"));
String mb_amt_14 = Util.checkString(req.getParameter("mb_amt_14"));
String mb_vat_14 = Util.checkString(req.getParameter("mb_vat_14"));
String mb_amt_15 = Util.checkString(req.getParameter("mb_amt_15"));
String mb_vat_15 = Util.checkString(req.getParameter("mb_vat_15"));
String mb_amt_16 = Util.checkString(req.getParameter("mb_amt_16"));
String mb_vat_16 = Util.checkString(req.getParameter("mb_vat_16"));
String mb_amt_17 = Util.checkString(req.getParameter("mb_amt_17"));
String mb_vat_17 = Util.checkString(req.getParameter("mb_vat_17"));
String mb_vat_17_d = Util.checkString(req.getParameter("mb_vat_17_d"));
String mc_vat_18 = Util.checkString(req.getParameter("mc_vat_18"));
String mc_amt_19 = Util.checkString(req.getParameter("mc_amt_19"));
String mc_vat_19 = Util.checkString(req.getParameter("mc_vat_19"));
String mc_vat_20 = Util.checkString(req.getParameter("mc_vat_20"));
String mc_vat_21 = Util.checkString(req.getParameter("mc_vat_21"));
String mc_vat_22 = Util.checkString(req.getParameter("mc_vat_22"));
String mc_vat_23 = Util.checkString(req.getParameter("mc_vat_23"));
String mc_vat_24 = Util.checkString(req.getParameter("mc_vat_24"));
String mc_vat_25 = Util.checkString(req.getParameter("mc_vat_25"));
String md_vat_26_b = Util.checkString(req.getParameter("md_vat_26_b"));
String me_amt_31 = Util.checkString(req.getParameter("me_amt_31"));
String mg_amt_32 = Util.checkString(req.getParameter("mg_amt_32"));
String mg_vat_32 = Util.checkString(req.getParameter("mg_vat_32"));
String mg_amt_33 = Util.checkString(req.getParameter("mg_amt_33"));
String mg_vat_33 = Util.checkString(req.getParameter("mg_vat_33"));
String mg_amt_34 = Util.checkString(req.getParameter("mg_amt_34"));
String mg_amt_35 = Util.checkString(req.getParameter("mg_amt_35"));
String mg_amt_36 = Util.checkString(req.getParameter("mg_amt_36"));
String mg_vat_36 = Util.checkString(req.getParameter("mg_vat_36"));
String mg_amt_37 = Util.checkString(req.getParameter("mg_amt_37"));
String mg_vat_37 = Util.checkString(req.getParameter("mg_vat_37"));
String mg_amt_38 = Util.checkString(req.getParameter("mg_amt_38"));
String mg_vat_38 = Util.checkString(req.getParameter("mg_vat_38"));
String mg_amt_39 = Util.checkString(req.getParameter("mg_amt_39"));
String mg_vat_39 = Util.checkString(req.getParameter("mg_vat_39"));
String mh_amt_40 = Util.checkString(req.getParameter("mh_amt_40"));
String mh_vat_40 = Util.checkString(req.getParameter("mh_vat_40"));
String mh_amt_41 = Util.checkString(req.getParameter("mh_amt_41"));
String mh_vat_41 = Util.checkString(req.getParameter("mh_vat_41"));
String mh_amt_42 = Util.checkString(req.getParameter("mh_amt_42"));
String mh_vat_42 = Util.checkString(req.getParameter("mh_vat_42"));
String mh_amt_43 = Util.checkString(req.getParameter("mh_amt_43"));
String mh_vat_43 = Util.checkString(req.getParameter("mh_vat_43"));
String mh_amt_44 = Util.checkString(req.getParameter("mh_amt_44"));
String mh_vat_44 = Util.checkString(req.getParameter("mh_vat_44"));
String mh_vat_45 = Util.checkString(req.getParameter("mh_vat_45"));
String mh_vat_46 = Util.checkString(req.getParameter("mh_vat_46"));
String mh_vat_47 = Util.checkString(req.getParameter("mh_vat_47"));
String mh_amt_48 = Util.checkString(req.getParameter("mh_amt_48"));
String mh_vat_48 = Util.checkString(req.getParameter("mh_vat_48"));
String mi_amt_49 = Util.checkString(req.getParameter("mi_amt_49"));
String mi_vat_49 = Util.checkString(req.getParameter("mi_vat_49"));
String mi_amt_50 = Util.checkString(req.getParameter("mi_amt_50"));
String mi_vat_50 = Util.checkString(req.getParameter("mi_vat_50"));
String mi_amt_51 = Util.checkString(req.getParameter("mi_amt_51"));
String mi_vat_51 = Util.checkString(req.getParameter("mi_vat_51"));
String mi_amt_52 = Util.checkString(req.getParameter("mi_amt_52"));
String mi_vat_52 = Util.checkString(req.getParameter("mi_vat_52"));
String mj_vat_53 = Util.checkString(req.getParameter("mj_vat_53"));
String mj_vat_54 = Util.checkString(req.getParameter("mj_vat_54"));
String mj_vat_55 = Util.checkString(req.getParameter("mj_vat_55"));
String mj_vat_56 = Util.checkString(req.getParameter("mj_vat_56"));
String mj_vat_57 = Util.checkString(req.getParameter("mj_vat_57"));
String mj_vat_58 = Util.checkString(req.getParameter("mj_vat_58"));
String mk_amt_59 = Util.checkString(req.getParameter("mk_amt_59"));
String mk_vat_59 = Util.checkString(req.getParameter("mk_vat_59"));
String mk_amt_60 = Util.checkString(req.getParameter("mk_amt_60"));
String mk_vat_60 = Util.checkString(req.getParameter("mk_vat_60"));
String mk_amt_61 = Util.checkString(req.getParameter("mk_amt_61"));
String mk_vat_61 = Util.checkString(req.getParameter("mk_vat_61"));
String mk_amt_62 = Util.checkString(req.getParameter("mk_amt_62"));
String mk_vat_62 = Util.checkString(req.getParameter("mk_vat_62"));
String mk_amt_63 = Util.checkString(req.getParameter("mk_amt_63"));
String mk_vat_63 = Util.checkString(req.getParameter("mk_vat_63"));
String mk_amt_64 = Util.checkString(req.getParameter("mk_amt_64"));
String mk_vat_64 = Util.checkString(req.getParameter("mk_vat_64"));
String mk_amt_65 = Util.checkString(req.getParameter("mk_amt_65"));
String mk_vat_65 = Util.checkString(req.getParameter("mk_vat_65"));
String mk_amt_66 = Util.checkString(req.getParameter("mk_amt_66"));
String mk_vat_66 = Util.checkString(req.getParameter("mk_vat_66"));
String mk_amt_67 = Util.checkString(req.getParameter("mk_amt_67"));
String mk_vat_67 = Util.checkString(req.getParameter("mk_vat_67"));
String mk_amt_68 = Util.checkString(req.getParameter("mk_amt_68"));
String mk_vat_68 = Util.checkString(req.getParameter("mk_vat_68"));
String mk_amt_69 = Util.checkString(req.getParameter("mk_amt_69"));
String mk_vat_69 = Util.checkString(req.getParameter("mk_vat_69"));
String mk_amt_70 = Util.checkString(req.getParameter("mk_amt_70"));
String mk_vat_70 = Util.checkString(req.getParameter("mk_vat_70"));
String mk_amt_71 = Util.checkString(req.getParameter("mk_amt_71"));
String mk_vat_71 = Util.checkString(req.getParameter("mk_vat_71"));
String mk_amt_72 = Util.checkString(req.getParameter("mk_amt_72"));
String mk_vat_72 = Util.checkString(req.getParameter("mk_vat_72"));
String mk_amt_73 = Util.checkString(req.getParameter("mk_amt_73"));
String mk_vat_73 = Util.checkString(req.getParameter("mk_vat_73"));
String mk_amt_74 = Util.checkString(req.getParameter("mk_amt_74"));
String mk_vat_74 = Util.checkString(req.getParameter("mk_vat_74"));
String mk_amt_75 = Util.checkString(req.getParameter("mk_amt_75"));
String mk_vat_75 = Util.checkString(req.getParameter("mk_vat_75"));
String mk_amt_76 = Util.checkString(req.getParameter("mk_amt_76"));
String mk_vat_76 = Util.checkString(req.getParameter("mk_vat_76"));
String mk_vat_77 = Util.checkString(req.getParameter("mk_vat_77"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String vat_fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_fr_yymm")));
String vat_to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_to_yymm")));
String ma_amt_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("ma_amt_01")));
String ma_vat_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("ma_vat_01")));
String ma_amt_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("ma_amt_02")));
String ma_vat_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("ma_vat_02")));
String ma_amt_03 = Util.Uni2Ksc(Util.checkString(req.getParameter("ma_amt_03")));
String ma_vat_03 = Util.Uni2Ksc(Util.checkString(req.getParameter("ma_vat_03")));
String ma_amt_04 = Util.Uni2Ksc(Util.checkString(req.getParameter("ma_amt_04")));
String ma_vat_04 = Util.Uni2Ksc(Util.checkString(req.getParameter("ma_vat_04")));
String ma_amt_05 = Util.Uni2Ksc(Util.checkString(req.getParameter("ma_amt_05")));
String ma_amt_06 = Util.Uni2Ksc(Util.checkString(req.getParameter("ma_amt_06")));
String ma_amt_07 = Util.Uni2Ksc(Util.checkString(req.getParameter("ma_amt_07")));
String ma_vat_07 = Util.Uni2Ksc(Util.checkString(req.getParameter("ma_vat_07")));
String ma_amt_08 = Util.Uni2Ksc(Util.checkString(req.getParameter("ma_amt_08")));
String ma_vat_08 = Util.Uni2Ksc(Util.checkString(req.getParameter("ma_vat_08")));
String ma_amt_09 = Util.Uni2Ksc(Util.checkString(req.getParameter("ma_amt_09")));
String ma_vat_09 = Util.Uni2Ksc(Util.checkString(req.getParameter("ma_vat_09")));
String mb_amt_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("mb_amt_10")));
String mb_vat_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("mb_vat_10")));
String mb_amt_11 = Util.Uni2Ksc(Util.checkString(req.getParameter("mb_amt_11")));
String mb_vat_11 = Util.Uni2Ksc(Util.checkString(req.getParameter("mb_vat_11")));
String mb_amt_12 = Util.Uni2Ksc(Util.checkString(req.getParameter("mb_amt_12")));
String mb_vat_12 = Util.Uni2Ksc(Util.checkString(req.getParameter("mb_vat_12")));
String mb_amt_13 = Util.Uni2Ksc(Util.checkString(req.getParameter("mb_amt_13")));
String mb_vat_13 = Util.Uni2Ksc(Util.checkString(req.getParameter("mb_vat_13")));
String mb_amt_14 = Util.Uni2Ksc(Util.checkString(req.getParameter("mb_amt_14")));
String mb_vat_14 = Util.Uni2Ksc(Util.checkString(req.getParameter("mb_vat_14")));
String mb_amt_15 = Util.Uni2Ksc(Util.checkString(req.getParameter("mb_amt_15")));
String mb_vat_15 = Util.Uni2Ksc(Util.checkString(req.getParameter("mb_vat_15")));
String mb_amt_16 = Util.Uni2Ksc(Util.checkString(req.getParameter("mb_amt_16")));
String mb_vat_16 = Util.Uni2Ksc(Util.checkString(req.getParameter("mb_vat_16")));
String mb_amt_17 = Util.Uni2Ksc(Util.checkString(req.getParameter("mb_amt_17")));
String mb_vat_17 = Util.Uni2Ksc(Util.checkString(req.getParameter("mb_vat_17")));
String mb_vat_17_d = Util.Uni2Ksc(Util.checkString(req.getParameter("mb_vat_17_d")));
String mc_vat_18 = Util.Uni2Ksc(Util.checkString(req.getParameter("mc_vat_18")));
String mc_amt_19 = Util.Uni2Ksc(Util.checkString(req.getParameter("mc_amt_19")));
String mc_vat_19 = Util.Uni2Ksc(Util.checkString(req.getParameter("mc_vat_19")));
String mc_vat_20 = Util.Uni2Ksc(Util.checkString(req.getParameter("mc_vat_20")));
String mc_vat_21 = Util.Uni2Ksc(Util.checkString(req.getParameter("mc_vat_21")));
String mc_vat_22 = Util.Uni2Ksc(Util.checkString(req.getParameter("mc_vat_22")));
String mc_vat_23 = Util.Uni2Ksc(Util.checkString(req.getParameter("mc_vat_23")));
String mc_vat_24 = Util.Uni2Ksc(Util.checkString(req.getParameter("mc_vat_24")));
String mc_vat_25 = Util.Uni2Ksc(Util.checkString(req.getParameter("mc_vat_25")));
String md_vat_26_b = Util.Uni2Ksc(Util.checkString(req.getParameter("md_vat_26_b")));
String me_amt_31 = Util.Uni2Ksc(Util.checkString(req.getParameter("me_amt_31")));
String mg_amt_32 = Util.Uni2Ksc(Util.checkString(req.getParameter("mg_amt_32")));
String mg_vat_32 = Util.Uni2Ksc(Util.checkString(req.getParameter("mg_vat_32")));
String mg_amt_33 = Util.Uni2Ksc(Util.checkString(req.getParameter("mg_amt_33")));
String mg_vat_33 = Util.Uni2Ksc(Util.checkString(req.getParameter("mg_vat_33")));
String mg_amt_34 = Util.Uni2Ksc(Util.checkString(req.getParameter("mg_amt_34")));
String mg_amt_35 = Util.Uni2Ksc(Util.checkString(req.getParameter("mg_amt_35")));
String mg_amt_36 = Util.Uni2Ksc(Util.checkString(req.getParameter("mg_amt_36")));
String mg_vat_36 = Util.Uni2Ksc(Util.checkString(req.getParameter("mg_vat_36")));
String mg_amt_37 = Util.Uni2Ksc(Util.checkString(req.getParameter("mg_amt_37")));
String mg_vat_37 = Util.Uni2Ksc(Util.checkString(req.getParameter("mg_vat_37")));
String mg_amt_38 = Util.Uni2Ksc(Util.checkString(req.getParameter("mg_amt_38")));
String mg_vat_38 = Util.Uni2Ksc(Util.checkString(req.getParameter("mg_vat_38")));
String mg_amt_39 = Util.Uni2Ksc(Util.checkString(req.getParameter("mg_amt_39")));
String mg_vat_39 = Util.Uni2Ksc(Util.checkString(req.getParameter("mg_vat_39")));
String mh_amt_40 = Util.Uni2Ksc(Util.checkString(req.getParameter("mh_amt_40")));
String mh_vat_40 = Util.Uni2Ksc(Util.checkString(req.getParameter("mh_vat_40")));
String mh_amt_41 = Util.Uni2Ksc(Util.checkString(req.getParameter("mh_amt_41")));
String mh_vat_41 = Util.Uni2Ksc(Util.checkString(req.getParameter("mh_vat_41")));
String mh_amt_42 = Util.Uni2Ksc(Util.checkString(req.getParameter("mh_amt_42")));
String mh_vat_42 = Util.Uni2Ksc(Util.checkString(req.getParameter("mh_vat_42")));
String mh_amt_43 = Util.Uni2Ksc(Util.checkString(req.getParameter("mh_amt_43")));
String mh_vat_43 = Util.Uni2Ksc(Util.checkString(req.getParameter("mh_vat_43")));
String mh_amt_44 = Util.Uni2Ksc(Util.checkString(req.getParameter("mh_amt_44")));
String mh_vat_44 = Util.Uni2Ksc(Util.checkString(req.getParameter("mh_vat_44")));
String mh_vat_45 = Util.Uni2Ksc(Util.checkString(req.getParameter("mh_vat_45")));
String mh_vat_46 = Util.Uni2Ksc(Util.checkString(req.getParameter("mh_vat_46")));
String mh_vat_47 = Util.Uni2Ksc(Util.checkString(req.getParameter("mh_vat_47")));
String mh_amt_48 = Util.Uni2Ksc(Util.checkString(req.getParameter("mh_amt_48")));
String mh_vat_48 = Util.Uni2Ksc(Util.checkString(req.getParameter("mh_vat_48")));
String mi_amt_49 = Util.Uni2Ksc(Util.checkString(req.getParameter("mi_amt_49")));
String mi_vat_49 = Util.Uni2Ksc(Util.checkString(req.getParameter("mi_vat_49")));
String mi_amt_50 = Util.Uni2Ksc(Util.checkString(req.getParameter("mi_amt_50")));
String mi_vat_50 = Util.Uni2Ksc(Util.checkString(req.getParameter("mi_vat_50")));
String mi_amt_51 = Util.Uni2Ksc(Util.checkString(req.getParameter("mi_amt_51")));
String mi_vat_51 = Util.Uni2Ksc(Util.checkString(req.getParameter("mi_vat_51")));
String mi_amt_52 = Util.Uni2Ksc(Util.checkString(req.getParameter("mi_amt_52")));
String mi_vat_52 = Util.Uni2Ksc(Util.checkString(req.getParameter("mi_vat_52")));
String mj_vat_53 = Util.Uni2Ksc(Util.checkString(req.getParameter("mj_vat_53")));
String mj_vat_54 = Util.Uni2Ksc(Util.checkString(req.getParameter("mj_vat_54")));
String mj_vat_55 = Util.Uni2Ksc(Util.checkString(req.getParameter("mj_vat_55")));
String mj_vat_56 = Util.Uni2Ksc(Util.checkString(req.getParameter("mj_vat_56")));
String mj_vat_57 = Util.Uni2Ksc(Util.checkString(req.getParameter("mj_vat_57")));
String mj_vat_58 = Util.Uni2Ksc(Util.checkString(req.getParameter("mj_vat_58")));
String mk_amt_59 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_amt_59")));
String mk_vat_59 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_59")));
String mk_amt_60 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_amt_60")));
String mk_vat_60 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_60")));
String mk_amt_61 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_amt_61")));
String mk_vat_61 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_61")));
String mk_amt_62 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_amt_62")));
String mk_vat_62 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_62")));
String mk_amt_63 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_amt_63")));
String mk_vat_63 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_63")));
String mk_amt_64 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_amt_64")));
String mk_vat_64 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_64")));
String mk_amt_65 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_amt_65")));
String mk_vat_65 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_65")));
String mk_amt_66 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_amt_66")));
String mk_vat_66 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_66")));
String mk_amt_67 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_amt_67")));
String mk_vat_67 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_67")));
String mk_amt_68 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_amt_68")));
String mk_vat_68 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_68")));
String mk_amt_69 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_amt_69")));
String mk_vat_69 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_69")));
String mk_amt_70 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_amt_70")));
String mk_vat_70 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_70")));
String mk_amt_71 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_amt_71")));
String mk_vat_71 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_71")));
String mk_amt_72 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_amt_72")));
String mk_vat_72 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_72")));
String mk_amt_73 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_amt_73")));
String mk_vat_73 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_73")));
String mk_amt_74 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_amt_74")));
String mk_vat_74 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_74")));
String mk_amt_75 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_amt_75")));
String mk_vat_75 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_75")));
String mk_amt_76 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_amt_76")));
String mk_vat_76 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_76")));
String mk_vat_77 = Util.Uni2Ksc(Util.checkString(req.getParameter("mk_vat_77")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setIncmg_pers(incmg_pers);
dm.setCmpy_cd(cmpy_cd);
dm.setErplace_cd(erplace_cd);
dm.setVat_fr_yymm(vat_fr_yymm);
dm.setVat_to_yymm(vat_to_yymm);
dm.setMa_amt_01(ma_amt_01);
dm.setMa_vat_01(ma_vat_01);
dm.setMa_amt_02(ma_amt_02);
dm.setMa_vat_02(ma_vat_02);
dm.setMa_amt_03(ma_amt_03);
dm.setMa_vat_03(ma_vat_03);
dm.setMa_amt_04(ma_amt_04);
dm.setMa_vat_04(ma_vat_04);
dm.setMa_amt_05(ma_amt_05);
dm.setMa_amt_06(ma_amt_06);
dm.setMa_amt_07(ma_amt_07);
dm.setMa_vat_07(ma_vat_07);
dm.setMa_amt_08(ma_amt_08);
dm.setMa_vat_08(ma_vat_08);
dm.setMa_amt_09(ma_amt_09);
dm.setMa_vat_09(ma_vat_09);
dm.setMb_amt_10(mb_amt_10);
dm.setMb_vat_10(mb_vat_10);
dm.setMb_amt_11(mb_amt_11);
dm.setMb_vat_11(mb_vat_11);
dm.setMb_amt_12(mb_amt_12);
dm.setMb_vat_12(mb_vat_12);
dm.setMb_amt_13(mb_amt_13);
dm.setMb_vat_13(mb_vat_13);
dm.setMb_amt_14(mb_amt_14);
dm.setMb_vat_14(mb_vat_14);
dm.setMb_amt_15(mb_amt_15);
dm.setMb_vat_15(mb_vat_15);
dm.setMb_amt_16(mb_amt_16);
dm.setMb_vat_16(mb_vat_16);
dm.setMb_amt_17(mb_amt_17);
dm.setMb_vat_17(mb_vat_17);
dm.setMb_vat_17_d(mb_vat_17_d);
dm.setMc_vat_18(mc_vat_18);
dm.setMc_amt_19(mc_amt_19);
dm.setMc_vat_19(mc_vat_19);
dm.setMc_vat_20(mc_vat_20);
dm.setMc_vat_21(mc_vat_21);
dm.setMc_vat_22(mc_vat_22);
dm.setMc_vat_23(mc_vat_23);
dm.setMc_vat_24(mc_vat_24);
dm.setMc_vat_25(mc_vat_25);
dm.setMd_vat_26_b(md_vat_26_b);
dm.setMe_amt_31(me_amt_31);
dm.setMg_amt_32(mg_amt_32);
dm.setMg_vat_32(mg_vat_32);
dm.setMg_amt_33(mg_amt_33);
dm.setMg_vat_33(mg_vat_33);
dm.setMg_amt_34(mg_amt_34);
dm.setMg_amt_35(mg_amt_35);
dm.setMg_amt_36(mg_amt_36);
dm.setMg_vat_36(mg_vat_36);
dm.setMg_amt_37(mg_amt_37);
dm.setMg_vat_37(mg_vat_37);
dm.setMg_amt_38(mg_amt_38);
dm.setMg_vat_38(mg_vat_38);
dm.setMg_amt_39(mg_amt_39);
dm.setMg_vat_39(mg_vat_39);
dm.setMh_amt_40(mh_amt_40);
dm.setMh_vat_40(mh_vat_40);
dm.setMh_amt_41(mh_amt_41);
dm.setMh_vat_41(mh_vat_41);
dm.setMh_amt_42(mh_amt_42);
dm.setMh_vat_42(mh_vat_42);
dm.setMh_amt_43(mh_amt_43);
dm.setMh_vat_43(mh_vat_43);
dm.setMh_amt_44(mh_amt_44);
dm.setMh_vat_44(mh_vat_44);
dm.setMh_vat_45(mh_vat_45);
dm.setMh_vat_46(mh_vat_46);
dm.setMh_vat_47(mh_vat_47);
dm.setMh_amt_48(mh_amt_48);
dm.setMh_vat_48(mh_vat_48);
dm.setMi_amt_49(mi_amt_49);
dm.setMi_vat_49(mi_vat_49);
dm.setMi_amt_50(mi_amt_50);
dm.setMi_vat_50(mi_vat_50);
dm.setMi_amt_51(mi_amt_51);
dm.setMi_vat_51(mi_vat_51);
dm.setMi_amt_52(mi_amt_52);
dm.setMi_vat_52(mi_vat_52);
dm.setMj_vat_53(mj_vat_53);
dm.setMj_vat_54(mj_vat_54);
dm.setMj_vat_55(mj_vat_55);
dm.setMj_vat_56(mj_vat_56);
dm.setMj_vat_57(mj_vat_57);
dm.setMj_vat_58(mj_vat_58);
dm.setMk_amt_59(mk_amt_59);
dm.setMk_vat_59(mk_vat_59);
dm.setMk_amt_60(mk_amt_60);
dm.setMk_vat_60(mk_vat_60);
dm.setMk_amt_61(mk_amt_61);
dm.setMk_vat_61(mk_vat_61);
dm.setMk_amt_62(mk_amt_62);
dm.setMk_vat_62(mk_vat_62);
dm.setMk_amt_63(mk_amt_63);
dm.setMk_vat_63(mk_vat_63);
dm.setMk_amt_64(mk_amt_64);
dm.setMk_vat_64(mk_vat_64);
dm.setMk_amt_65(mk_amt_65);
dm.setMk_vat_65(mk_vat_65);
dm.setMk_amt_66(mk_amt_66);
dm.setMk_vat_66(mk_vat_66);
dm.setMk_amt_67(mk_amt_67);
dm.setMk_vat_67(mk_vat_67);
dm.setMk_amt_68(mk_amt_68);
dm.setMk_vat_68(mk_vat_68);
dm.setMk_amt_69(mk_amt_69);
dm.setMk_vat_69(mk_vat_69);
dm.setMk_amt_70(mk_amt_70);
dm.setMk_vat_70(mk_vat_70);
dm.setMk_amt_71(mk_amt_71);
dm.setMk_vat_71(mk_vat_71);
dm.setMk_amt_72(mk_amt_72);
dm.setMk_vat_72(mk_vat_72);
dm.setMk_amt_73(mk_amt_73);
dm.setMk_vat_73(mk_vat_73);
dm.setMk_amt_74(mk_amt_74);
dm.setMk_vat_74(mk_vat_74);
dm.setMk_amt_75(mk_amt_75);
dm.setMk_vat_75(mk_vat_75);
dm.setMk_amt_76(mk_amt_76);
dm.setMk_vat_76(mk_vat_76);
dm.setMk_vat_77(mk_vat_77);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 21 13:56:10 KST 2015 */