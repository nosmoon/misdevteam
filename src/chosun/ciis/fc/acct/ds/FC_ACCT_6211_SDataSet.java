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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_6211_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_vatdeclstmt_list_2 = new ArrayList();
	public ArrayList cur_vatdeclstmt_list_1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String erplace_cd;
	public long data_cnt;
	public String vat_fr_yymm;
	public String vat_to_yymm;
	public String clos_yn;
	public String ma_amt_01;
	public String ma_vat_01;
	public String ma_amt_02;
	public String ma_vat_02;
	public String ma_amt_03;
	public String ma_vat_03;
	public String ma_amt_04;
	public String ma_vat_04;
	public String ma_amt_05;
	public String ma_amt_06;
	public String ma_amt_07;
	public String ma_vat_07;
	public String ma_amt_08;
	public String ma_vat_08;
	public String ma_amt_09;
	public String ma_vat_09;
	public String mb_amt_10;
	public String mb_vat_10;
	public String mb_amt_11;
	public String mb_vat_11;
	public String mb_amt_12;
	public String mb_vat_12;
	public String mb_amt_13;
	public String mb_vat_13;
	public String mb_amt_14;
	public String mb_vat_14;
	public String mb_amt_15;
	public String mb_vat_15;
	public String mb_amt_16;
	public String mb_vat_16;
	public String mb_amt_17;
	public String mb_vat_17;
	public String mb_vat_17_d;
	public String mc_vat_18;
	public String mc_amt_19;
	public String mc_vat_19;
	public String mc_vat_20;
	public String mc_vat_21;
	public String mc_vat_22;
	public String mc_vat_23;
	public String mc_vat_24;
	public String mc_vat_25;
	public String md_vat_26;
	public String md_rmk_26_a;
	public String md_vat_26_b;
	public String md_rmk_26_c;
	public String md_rmk_26_d;
	public String md_rmk_26_e;
	public String md_rmk_26_f;
	public String md_rmk_26_g;
	public String md_rmk_26_h;
	public String md_rmk_26_i;
	public String md_rmk_26_j;
	public String md_rmk_26_k;
	public String me_bizcond_27;
	public String me_item_27;
	public String me_indt_27;
	public String me_amt_27;
	public String me_bizcond_28;
	public String me_item_28;
	public String me_indt_28;
	public String me_amt_28;
	public String me_bizcond_29;
	public String me_item_29;
	public String me_indt_29;
	public String me_amt_29;
	public String me_bizcond_30;
	public String me_item_30;
	public String me_indt_30;
	public String me_amt_30;
	public String me_amt_31;
	public String mf_tax_agnt_nm;
	public String mf_tax_agnt_ern;
	public String mf_tax_agnt_tel_no;
	public String mg_amt_32;
	public String mg_vat_32;
	public String mg_amt_33;
	public String mg_vat_33;
	public String mg_amt_34;
	public String mg_amt_35;
	public String mg_amt_36;
	public String mg_vat_36;
	public String mg_amt_37;
	public String mg_vat_37;
	public String mg_amt_38;
	public String mg_vat_38;
	public String mg_amt_39;
	public String mg_vat_39;
	public String mh_amt_40;
	public String mh_vat_40;
	public String mh_amt_41;
	public String mh_vat_41;
	public String mh_amt_42;
	public String mh_vat_42;
	public String mh_amt_43;
	public String mh_vat_43;
	public String mh_amt_44;
	public String mh_vat_44;
	public String mh_vat_45;
	public String mh_vat_46;
	public String mh_vat_47;
	public String mh_amt_48;
	public String mh_vat_48;
	public String mi_amt_49;
	public String mi_vat_49;
	public String mi_amt_50;
	public String mi_vat_50;
	public String mi_amt_51;
	public String mi_vat_51;
	public String mi_amt_52;
	public String mi_vat_52;
	public String mj_vat_53;
	public String mj_vat_54;
	public String mj_vat_55;
	public String mj_vat_56;
	public String mj_vat_57;
	public String mj_vat_58;
	public String mk_amt_59;
	public String mk_vat_59;
	public String mk_amt_60;
	public String mk_vat_60;
	public String mk_amt_61;
	public String mk_vat_61;
	public String mk_amt_62;
	public String mk_vat_62;
	public String mk_amt_63;
	public String mk_vat_63;
	public String mk_amt_64;
	public String mk_vat_64;
	public String mk_amt_65;
	public String mk_vat_65;
	public String mk_amt_66;
	public String mk_vat_66;
	public String mk_amt_67;
	public String mk_vat_67;
	public String mk_amt_68;
	public String mk_vat_68;
	public String mk_amt_69;
	public String mk_vat_69;
	public String mk_amt_70;
	public String mk_vat_70;
	public String mk_amt_71;
	public String mk_vat_71;
	public String mk_amt_72;
	public String mk_vat_72;
	public String mk_amt_73;
	public String mk_vat_73;
	public String mk_amt_74;
	public String mk_vat_74;
	public String mk_amt_75;
	public String mk_vat_75;
	public String mk_amt_76;
	public String mk_vat_76;
	public String mk_vat_77;
	public String ml_bizcond_78;
	public String ml_item_78;
	public String ml_indt_78;
	public String ml_amt_78;
	public String ml_bizcond_79;
	public String ml_item_79;
	public String ml_indt_79;
	public String ml_amt_79;
	public String ml_bizcond_80;
	public String ml_item_80;
	public String ml_indt_80;
	public String ml_amt_80;
	public String ml_amt_81;
	public String mm_amt_82;
	public String mm_amt_83;
	public String decl_dt;

	public FC_ACCT_6211_SDataSet(){}
	public FC_ACCT_6211_SDataSet(String errcode, String errmsg, String erplace_cd, long data_cnt, String vat_fr_yymm, String vat_to_yymm, String clos_yn, String ma_amt_01, String ma_vat_01, String ma_amt_02, String ma_vat_02, String ma_amt_03, String ma_vat_03, String ma_amt_04, String ma_vat_04, String ma_amt_05, String ma_amt_06, String ma_amt_07, String ma_vat_07, String ma_amt_08, String ma_vat_08, String ma_amt_09, String ma_vat_09, String mb_amt_10, String mb_vat_10, String mb_amt_11, String mb_vat_11, String mb_amt_12, String mb_vat_12, String mb_amt_13, String mb_vat_13, String mb_amt_14, String mb_vat_14, String mb_amt_15, String mb_vat_15, String mb_amt_16, String mb_vat_16, String mb_amt_17, String mb_vat_17, String mb_vat_17_d, String mc_vat_18, String mc_amt_19, String mc_vat_19, String mc_vat_20, String mc_vat_21, String mc_vat_22, String mc_vat_23, String mc_vat_24, String mc_vat_25, String md_vat_26, String md_rmk_26_a, String md_vat_26_b, String md_rmk_26_c, String md_rmk_26_d, String md_rmk_26_e, String md_rmk_26_f, String md_rmk_26_g, String md_rmk_26_h, String md_rmk_26_i, String md_rmk_26_j, String md_rmk_26_k, String me_bizcond_27, String me_item_27, String me_indt_27, String me_amt_27, String me_bizcond_28, String me_item_28, String me_indt_28, String me_amt_28, String me_bizcond_29, String me_item_29, String me_indt_29, String me_amt_29, String me_bizcond_30, String me_item_30, String me_indt_30, String me_amt_30, String me_amt_31, String mf_tax_agnt_nm, String mf_tax_agnt_ern, String mf_tax_agnt_tel_no, String mg_amt_32, String mg_vat_32, String mg_amt_33, String mg_vat_33, String mg_amt_34, String mg_amt_35, String mg_amt_36, String mg_vat_36, String mg_amt_37, String mg_vat_37, String mg_amt_38, String mg_vat_38, String mg_amt_39, String mg_vat_39, String mh_amt_40, String mh_vat_40, String mh_amt_41, String mh_vat_41, String mh_amt_42, String mh_vat_42, String mh_amt_43, String mh_vat_43, String mh_amt_44, String mh_vat_44, String mh_vat_45, String mh_vat_46, String mh_vat_47, String mh_amt_48, String mh_vat_48, String mi_amt_49, String mi_vat_49, String mi_amt_50, String mi_vat_50, String mi_amt_51, String mi_vat_51, String mi_amt_52, String mi_vat_52, String mj_vat_53, String mj_vat_54, String mj_vat_55, String mj_vat_56, String mj_vat_57, String mj_vat_58, String mk_amt_59, String mk_vat_59, String mk_amt_60, String mk_vat_60, String mk_amt_61, String mk_vat_61, String mk_amt_62, String mk_vat_62, String mk_amt_63, String mk_vat_63, String mk_amt_64, String mk_vat_64, String mk_amt_65, String mk_vat_65, String mk_amt_66, String mk_vat_66, String mk_amt_67, String mk_vat_67, String mk_amt_68, String mk_vat_68, String mk_amt_69, String mk_vat_69, String mk_amt_70, String mk_vat_70, String mk_amt_71, String mk_vat_71, String mk_amt_72, String mk_vat_72, String mk_amt_73, String mk_vat_73, String mk_amt_74, String mk_vat_74, String mk_amt_75, String mk_vat_75, String mk_amt_76, String mk_vat_76, String mk_vat_77, String ml_bizcond_78, String ml_item_78, String ml_indt_78, String ml_amt_78, String ml_bizcond_79, String ml_item_79, String ml_indt_79, String ml_amt_79, String ml_bizcond_80, String ml_item_80, String ml_indt_80, String ml_amt_80, String ml_amt_81, String mm_amt_82, String mm_amt_83, String decl_dt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.erplace_cd = erplace_cd;
		this.data_cnt = data_cnt;
		this.vat_fr_yymm = vat_fr_yymm;
		this.vat_to_yymm = vat_to_yymm;
		this.clos_yn = clos_yn;
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
		this.md_vat_26 = md_vat_26;
		this.md_rmk_26_a = md_rmk_26_a;
		this.md_vat_26_b = md_vat_26_b;
		this.md_rmk_26_c = md_rmk_26_c;
		this.md_rmk_26_d = md_rmk_26_d;
		this.md_rmk_26_e = md_rmk_26_e;
		this.md_rmk_26_f = md_rmk_26_f;
		this.md_rmk_26_g = md_rmk_26_g;
		this.md_rmk_26_h = md_rmk_26_h;
		this.md_rmk_26_i = md_rmk_26_i;
		this.md_rmk_26_j = md_rmk_26_j;
		this.md_rmk_26_k = md_rmk_26_k;
		this.me_bizcond_27 = me_bizcond_27;
		this.me_item_27 = me_item_27;
		this.me_indt_27 = me_indt_27;
		this.me_amt_27 = me_amt_27;
		this.me_bizcond_28 = me_bizcond_28;
		this.me_item_28 = me_item_28;
		this.me_indt_28 = me_indt_28;
		this.me_amt_28 = me_amt_28;
		this.me_bizcond_29 = me_bizcond_29;
		this.me_item_29 = me_item_29;
		this.me_indt_29 = me_indt_29;
		this.me_amt_29 = me_amt_29;
		this.me_bizcond_30 = me_bizcond_30;
		this.me_item_30 = me_item_30;
		this.me_indt_30 = me_indt_30;
		this.me_amt_30 = me_amt_30;
		this.me_amt_31 = me_amt_31;
		this.mf_tax_agnt_nm = mf_tax_agnt_nm;
		this.mf_tax_agnt_ern = mf_tax_agnt_ern;
		this.mf_tax_agnt_tel_no = mf_tax_agnt_tel_no;
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
		this.ml_bizcond_78 = ml_bizcond_78;
		this.ml_item_78 = ml_item_78;
		this.ml_indt_78 = ml_indt_78;
		this.ml_amt_78 = ml_amt_78;
		this.ml_bizcond_79 = ml_bizcond_79;
		this.ml_item_79 = ml_item_79;
		this.ml_indt_79 = ml_indt_79;
		this.ml_amt_79 = ml_amt_79;
		this.ml_bizcond_80 = ml_bizcond_80;
		this.ml_item_80 = ml_item_80;
		this.ml_indt_80 = ml_indt_80;
		this.ml_amt_80 = ml_amt_80;
		this.ml_amt_81 = ml_amt_81;
		this.mm_amt_82 = mm_amt_82;
		this.mm_amt_83 = mm_amt_83;
		this.decl_dt = decl_dt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setData_cnt(long data_cnt){
		this.data_cnt = data_cnt;
	}

	public void setVat_fr_yymm(String vat_fr_yymm){
		this.vat_fr_yymm = vat_fr_yymm;
	}

	public void setVat_to_yymm(String vat_to_yymm){
		this.vat_to_yymm = vat_to_yymm;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setMa_amt_01(String ma_amt_01){
		this.ma_amt_01 = ma_amt_01;
	}

	public void setMa_vat_01(String ma_vat_01){
		this.ma_vat_01 = ma_vat_01;
	}

	public void setMa_amt_02(String ma_amt_02){
		this.ma_amt_02 = ma_amt_02;
	}

	public void setMa_vat_02(String ma_vat_02){
		this.ma_vat_02 = ma_vat_02;
	}

	public void setMa_amt_03(String ma_amt_03){
		this.ma_amt_03 = ma_amt_03;
	}

	public void setMa_vat_03(String ma_vat_03){
		this.ma_vat_03 = ma_vat_03;
	}

	public void setMa_amt_04(String ma_amt_04){
		this.ma_amt_04 = ma_amt_04;
	}

	public void setMa_vat_04(String ma_vat_04){
		this.ma_vat_04 = ma_vat_04;
	}

	public void setMa_amt_05(String ma_amt_05){
		this.ma_amt_05 = ma_amt_05;
	}

	public void setMa_amt_06(String ma_amt_06){
		this.ma_amt_06 = ma_amt_06;
	}

	public void setMa_amt_07(String ma_amt_07){
		this.ma_amt_07 = ma_amt_07;
	}

	public void setMa_vat_07(String ma_vat_07){
		this.ma_vat_07 = ma_vat_07;
	}

	public void setMa_amt_08(String ma_amt_08){
		this.ma_amt_08 = ma_amt_08;
	}

	public void setMa_vat_08(String ma_vat_08){
		this.ma_vat_08 = ma_vat_08;
	}

	public void setMa_amt_09(String ma_amt_09){
		this.ma_amt_09 = ma_amt_09;
	}

	public void setMa_vat_09(String ma_vat_09){
		this.ma_vat_09 = ma_vat_09;
	}

	public void setMb_amt_10(String mb_amt_10){
		this.mb_amt_10 = mb_amt_10;
	}

	public void setMb_vat_10(String mb_vat_10){
		this.mb_vat_10 = mb_vat_10;
	}

	public void setMb_amt_11(String mb_amt_11){
		this.mb_amt_11 = mb_amt_11;
	}

	public void setMb_vat_11(String mb_vat_11){
		this.mb_vat_11 = mb_vat_11;
	}

	public void setMb_amt_12(String mb_amt_12){
		this.mb_amt_12 = mb_amt_12;
	}

	public void setMb_vat_12(String mb_vat_12){
		this.mb_vat_12 = mb_vat_12;
	}

	public void setMb_amt_13(String mb_amt_13){
		this.mb_amt_13 = mb_amt_13;
	}

	public void setMb_vat_13(String mb_vat_13){
		this.mb_vat_13 = mb_vat_13;
	}

	public void setMb_amt_14(String mb_amt_14){
		this.mb_amt_14 = mb_amt_14;
	}

	public void setMb_vat_14(String mb_vat_14){
		this.mb_vat_14 = mb_vat_14;
	}

	public void setMb_amt_15(String mb_amt_15){
		this.mb_amt_15 = mb_amt_15;
	}

	public void setMb_vat_15(String mb_vat_15){
		this.mb_vat_15 = mb_vat_15;
	}

	public void setMb_amt_16(String mb_amt_16){
		this.mb_amt_16 = mb_amt_16;
	}

	public void setMb_vat_16(String mb_vat_16){
		this.mb_vat_16 = mb_vat_16;
	}

	public void setMb_amt_17(String mb_amt_17){
		this.mb_amt_17 = mb_amt_17;
	}

	public void setMb_vat_17(String mb_vat_17){
		this.mb_vat_17 = mb_vat_17;
	}

	public void setMb_vat_17_d(String mb_vat_17_d){
		this.mb_vat_17_d = mb_vat_17_d;
	}

	public void setMc_vat_18(String mc_vat_18){
		this.mc_vat_18 = mc_vat_18;
	}

	public void setMc_amt_19(String mc_amt_19){
		this.mc_amt_19 = mc_amt_19;
	}

	public void setMc_vat_19(String mc_vat_19){
		this.mc_vat_19 = mc_vat_19;
	}

	public void setMc_vat_20(String mc_vat_20){
		this.mc_vat_20 = mc_vat_20;
	}

	public void setMc_vat_21(String mc_vat_21){
		this.mc_vat_21 = mc_vat_21;
	}

	public void setMc_vat_22(String mc_vat_22){
		this.mc_vat_22 = mc_vat_22;
	}

	public void setMc_vat_23(String mc_vat_23){
		this.mc_vat_23 = mc_vat_23;
	}

	public void setMc_vat_24(String mc_vat_24){
		this.mc_vat_24 = mc_vat_24;
	}

	public void setMc_vat_25(String mc_vat_25){
		this.mc_vat_25 = mc_vat_25;
	}

	public void setMd_vat_26(String md_vat_26){
		this.md_vat_26 = md_vat_26;
	}

	public void setMd_rmk_26_a(String md_rmk_26_a){
		this.md_rmk_26_a = md_rmk_26_a;
	}

	public void setMd_vat_26_b(String md_vat_26_b){
		this.md_vat_26_b = md_vat_26_b;
	}

	public void setMd_rmk_26_c(String md_rmk_26_c){
		this.md_rmk_26_c = md_rmk_26_c;
	}

	public void setMd_rmk_26_d(String md_rmk_26_d){
		this.md_rmk_26_d = md_rmk_26_d;
	}

	public void setMd_rmk_26_e(String md_rmk_26_e){
		this.md_rmk_26_e = md_rmk_26_e;
	}

	public void setMd_rmk_26_f(String md_rmk_26_f){
		this.md_rmk_26_f = md_rmk_26_f;
	}

	public void setMd_rmk_26_g(String md_rmk_26_g){
		this.md_rmk_26_g = md_rmk_26_g;
	}

	public void setMd_rmk_26_h(String md_rmk_26_h){
		this.md_rmk_26_h = md_rmk_26_h;
	}

	public void setMd_rmk_26_i(String md_rmk_26_i){
		this.md_rmk_26_i = md_rmk_26_i;
	}

	public void setMd_rmk_26_j(String md_rmk_26_j){
		this.md_rmk_26_j = md_rmk_26_j;
	}

	public void setMd_rmk_26_k(String md_rmk_26_k){
		this.md_rmk_26_k = md_rmk_26_k;
	}

	public void setMe_bizcond_27(String me_bizcond_27){
		this.me_bizcond_27 = me_bizcond_27;
	}

	public void setMe_item_27(String me_item_27){
		this.me_item_27 = me_item_27;
	}

	public void setMe_indt_27(String me_indt_27){
		this.me_indt_27 = me_indt_27;
	}

	public void setMe_amt_27(String me_amt_27){
		this.me_amt_27 = me_amt_27;
	}

	public void setMe_bizcond_28(String me_bizcond_28){
		this.me_bizcond_28 = me_bizcond_28;
	}

	public void setMe_item_28(String me_item_28){
		this.me_item_28 = me_item_28;
	}

	public void setMe_indt_28(String me_indt_28){
		this.me_indt_28 = me_indt_28;
	}

	public void setMe_amt_28(String me_amt_28){
		this.me_amt_28 = me_amt_28;
	}

	public void setMe_bizcond_29(String me_bizcond_29){
		this.me_bizcond_29 = me_bizcond_29;
	}

	public void setMe_item_29(String me_item_29){
		this.me_item_29 = me_item_29;
	}

	public void setMe_indt_29(String me_indt_29){
		this.me_indt_29 = me_indt_29;
	}

	public void setMe_amt_29(String me_amt_29){
		this.me_amt_29 = me_amt_29;
	}

	public void setMe_bizcond_30(String me_bizcond_30){
		this.me_bizcond_30 = me_bizcond_30;
	}

	public void setMe_item_30(String me_item_30){
		this.me_item_30 = me_item_30;
	}

	public void setMe_indt_30(String me_indt_30){
		this.me_indt_30 = me_indt_30;
	}

	public void setMe_amt_30(String me_amt_30){
		this.me_amt_30 = me_amt_30;
	}

	public void setMe_amt_31(String me_amt_31){
		this.me_amt_31 = me_amt_31;
	}

	public void setMf_tax_agnt_nm(String mf_tax_agnt_nm){
		this.mf_tax_agnt_nm = mf_tax_agnt_nm;
	}

	public void setMf_tax_agnt_ern(String mf_tax_agnt_ern){
		this.mf_tax_agnt_ern = mf_tax_agnt_ern;
	}

	public void setMf_tax_agnt_tel_no(String mf_tax_agnt_tel_no){
		this.mf_tax_agnt_tel_no = mf_tax_agnt_tel_no;
	}

	public void setMg_amt_32(String mg_amt_32){
		this.mg_amt_32 = mg_amt_32;
	}

	public void setMg_vat_32(String mg_vat_32){
		this.mg_vat_32 = mg_vat_32;
	}

	public void setMg_amt_33(String mg_amt_33){
		this.mg_amt_33 = mg_amt_33;
	}

	public void setMg_vat_33(String mg_vat_33){
		this.mg_vat_33 = mg_vat_33;
	}

	public void setMg_amt_34(String mg_amt_34){
		this.mg_amt_34 = mg_amt_34;
	}

	public void setMg_amt_35(String mg_amt_35){
		this.mg_amt_35 = mg_amt_35;
	}

	public void setMg_amt_36(String mg_amt_36){
		this.mg_amt_36 = mg_amt_36;
	}

	public void setMg_vat_36(String mg_vat_36){
		this.mg_vat_36 = mg_vat_36;
	}

	public void setMg_amt_37(String mg_amt_37){
		this.mg_amt_37 = mg_amt_37;
	}

	public void setMg_vat_37(String mg_vat_37){
		this.mg_vat_37 = mg_vat_37;
	}

	public void setMg_amt_38(String mg_amt_38){
		this.mg_amt_38 = mg_amt_38;
	}

	public void setMg_vat_38(String mg_vat_38){
		this.mg_vat_38 = mg_vat_38;
	}

	public void setMg_amt_39(String mg_amt_39){
		this.mg_amt_39 = mg_amt_39;
	}

	public void setMg_vat_39(String mg_vat_39){
		this.mg_vat_39 = mg_vat_39;
	}

	public void setMh_amt_40(String mh_amt_40){
		this.mh_amt_40 = mh_amt_40;
	}

	public void setMh_vat_40(String mh_vat_40){
		this.mh_vat_40 = mh_vat_40;
	}

	public void setMh_amt_41(String mh_amt_41){
		this.mh_amt_41 = mh_amt_41;
	}

	public void setMh_vat_41(String mh_vat_41){
		this.mh_vat_41 = mh_vat_41;
	}

	public void setMh_amt_42(String mh_amt_42){
		this.mh_amt_42 = mh_amt_42;
	}

	public void setMh_vat_42(String mh_vat_42){
		this.mh_vat_42 = mh_vat_42;
	}

	public void setMh_amt_43(String mh_amt_43){
		this.mh_amt_43 = mh_amt_43;
	}

	public void setMh_vat_43(String mh_vat_43){
		this.mh_vat_43 = mh_vat_43;
	}

	public void setMh_amt_44(String mh_amt_44){
		this.mh_amt_44 = mh_amt_44;
	}

	public void setMh_vat_44(String mh_vat_44){
		this.mh_vat_44 = mh_vat_44;
	}

	public void setMh_vat_45(String mh_vat_45){
		this.mh_vat_45 = mh_vat_45;
	}

	public void setMh_vat_46(String mh_vat_46){
		this.mh_vat_46 = mh_vat_46;
	}

	public void setMh_vat_47(String mh_vat_47){
		this.mh_vat_47 = mh_vat_47;
	}

	public void setMh_amt_48(String mh_amt_48){
		this.mh_amt_48 = mh_amt_48;
	}

	public void setMh_vat_48(String mh_vat_48){
		this.mh_vat_48 = mh_vat_48;
	}

	public void setMi_amt_49(String mi_amt_49){
		this.mi_amt_49 = mi_amt_49;
	}

	public void setMi_vat_49(String mi_vat_49){
		this.mi_vat_49 = mi_vat_49;
	}

	public void setMi_amt_50(String mi_amt_50){
		this.mi_amt_50 = mi_amt_50;
	}

	public void setMi_vat_50(String mi_vat_50){
		this.mi_vat_50 = mi_vat_50;
	}

	public void setMi_amt_51(String mi_amt_51){
		this.mi_amt_51 = mi_amt_51;
	}

	public void setMi_vat_51(String mi_vat_51){
		this.mi_vat_51 = mi_vat_51;
	}

	public void setMi_amt_52(String mi_amt_52){
		this.mi_amt_52 = mi_amt_52;
	}

	public void setMi_vat_52(String mi_vat_52){
		this.mi_vat_52 = mi_vat_52;
	}

	public void setMj_vat_53(String mj_vat_53){
		this.mj_vat_53 = mj_vat_53;
	}

	public void setMj_vat_54(String mj_vat_54){
		this.mj_vat_54 = mj_vat_54;
	}

	public void setMj_vat_55(String mj_vat_55){
		this.mj_vat_55 = mj_vat_55;
	}

	public void setMj_vat_56(String mj_vat_56){
		this.mj_vat_56 = mj_vat_56;
	}

	public void setMj_vat_57(String mj_vat_57){
		this.mj_vat_57 = mj_vat_57;
	}

	public void setMj_vat_58(String mj_vat_58){
		this.mj_vat_58 = mj_vat_58;
	}

	public void setMk_amt_59(String mk_amt_59){
		this.mk_amt_59 = mk_amt_59;
	}

	public void setMk_vat_59(String mk_vat_59){
		this.mk_vat_59 = mk_vat_59;
	}

	public void setMk_amt_60(String mk_amt_60){
		this.mk_amt_60 = mk_amt_60;
	}

	public void setMk_vat_60(String mk_vat_60){
		this.mk_vat_60 = mk_vat_60;
	}

	public void setMk_amt_61(String mk_amt_61){
		this.mk_amt_61 = mk_amt_61;
	}

	public void setMk_vat_61(String mk_vat_61){
		this.mk_vat_61 = mk_vat_61;
	}

	public void setMk_amt_62(String mk_amt_62){
		this.mk_amt_62 = mk_amt_62;
	}

	public void setMk_vat_62(String mk_vat_62){
		this.mk_vat_62 = mk_vat_62;
	}

	public void setMk_amt_63(String mk_amt_63){
		this.mk_amt_63 = mk_amt_63;
	}

	public void setMk_vat_63(String mk_vat_63){
		this.mk_vat_63 = mk_vat_63;
	}

	public void setMk_amt_64(String mk_amt_64){
		this.mk_amt_64 = mk_amt_64;
	}

	public void setMk_vat_64(String mk_vat_64){
		this.mk_vat_64 = mk_vat_64;
	}

	public void setMk_amt_65(String mk_amt_65){
		this.mk_amt_65 = mk_amt_65;
	}

	public void setMk_vat_65(String mk_vat_65){
		this.mk_vat_65 = mk_vat_65;
	}

	public void setMk_amt_66(String mk_amt_66){
		this.mk_amt_66 = mk_amt_66;
	}

	public void setMk_vat_66(String mk_vat_66){
		this.mk_vat_66 = mk_vat_66;
	}

	public void setMk_amt_67(String mk_amt_67){
		this.mk_amt_67 = mk_amt_67;
	}

	public void setMk_vat_67(String mk_vat_67){
		this.mk_vat_67 = mk_vat_67;
	}

	public void setMk_amt_68(String mk_amt_68){
		this.mk_amt_68 = mk_amt_68;
	}

	public void setMk_vat_68(String mk_vat_68){
		this.mk_vat_68 = mk_vat_68;
	}

	public void setMk_amt_69(String mk_amt_69){
		this.mk_amt_69 = mk_amt_69;
	}

	public void setMk_vat_69(String mk_vat_69){
		this.mk_vat_69 = mk_vat_69;
	}

	public void setMk_amt_70(String mk_amt_70){
		this.mk_amt_70 = mk_amt_70;
	}

	public void setMk_vat_70(String mk_vat_70){
		this.mk_vat_70 = mk_vat_70;
	}

	public void setMk_amt_71(String mk_amt_71){
		this.mk_amt_71 = mk_amt_71;
	}

	public void setMk_vat_71(String mk_vat_71){
		this.mk_vat_71 = mk_vat_71;
	}

	public void setMk_amt_72(String mk_amt_72){
		this.mk_amt_72 = mk_amt_72;
	}

	public void setMk_vat_72(String mk_vat_72){
		this.mk_vat_72 = mk_vat_72;
	}

	public void setMk_amt_73(String mk_amt_73){
		this.mk_amt_73 = mk_amt_73;
	}

	public void setMk_vat_73(String mk_vat_73){
		this.mk_vat_73 = mk_vat_73;
	}

	public void setMk_amt_74(String mk_amt_74){
		this.mk_amt_74 = mk_amt_74;
	}

	public void setMk_vat_74(String mk_vat_74){
		this.mk_vat_74 = mk_vat_74;
	}

	public void setMk_amt_75(String mk_amt_75){
		this.mk_amt_75 = mk_amt_75;
	}

	public void setMk_vat_75(String mk_vat_75){
		this.mk_vat_75 = mk_vat_75;
	}

	public void setMk_amt_76(String mk_amt_76){
		this.mk_amt_76 = mk_amt_76;
	}

	public void setMk_vat_76(String mk_vat_76){
		this.mk_vat_76 = mk_vat_76;
	}

	public void setMk_vat_77(String mk_vat_77){
		this.mk_vat_77 = mk_vat_77;
	}

	public void setMl_bizcond_78(String ml_bizcond_78){
		this.ml_bizcond_78 = ml_bizcond_78;
	}

	public void setMl_item_78(String ml_item_78){
		this.ml_item_78 = ml_item_78;
	}

	public void setMl_indt_78(String ml_indt_78){
		this.ml_indt_78 = ml_indt_78;
	}

	public void setMl_amt_78(String ml_amt_78){
		this.ml_amt_78 = ml_amt_78;
	}

	public void setMl_bizcond_79(String ml_bizcond_79){
		this.ml_bizcond_79 = ml_bizcond_79;
	}

	public void setMl_item_79(String ml_item_79){
		this.ml_item_79 = ml_item_79;
	}

	public void setMl_indt_79(String ml_indt_79){
		this.ml_indt_79 = ml_indt_79;
	}

	public void setMl_amt_79(String ml_amt_79){
		this.ml_amt_79 = ml_amt_79;
	}

	public void setMl_bizcond_80(String ml_bizcond_80){
		this.ml_bizcond_80 = ml_bizcond_80;
	}

	public void setMl_item_80(String ml_item_80){
		this.ml_item_80 = ml_item_80;
	}

	public void setMl_indt_80(String ml_indt_80){
		this.ml_indt_80 = ml_indt_80;
	}

	public void setMl_amt_80(String ml_amt_80){
		this.ml_amt_80 = ml_amt_80;
	}

	public void setMl_amt_81(String ml_amt_81){
		this.ml_amt_81 = ml_amt_81;
	}

	public void setMm_amt_82(String mm_amt_82){
		this.mm_amt_82 = mm_amt_82;
	}

	public void setMm_amt_83(String mm_amt_83){
		this.mm_amt_83 = mm_amt_83;
	}

	public void setDecl_dt(String decl_dt){
		this.decl_dt = decl_dt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public long getData_cnt(){
		return this.data_cnt;
	}

	public String getVat_fr_yymm(){
		return this.vat_fr_yymm;
	}

	public String getVat_to_yymm(){
		return this.vat_to_yymm;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getMa_amt_01(){
		return this.ma_amt_01;
	}

	public String getMa_vat_01(){
		return this.ma_vat_01;
	}

	public String getMa_amt_02(){
		return this.ma_amt_02;
	}

	public String getMa_vat_02(){
		return this.ma_vat_02;
	}

	public String getMa_amt_03(){
		return this.ma_amt_03;
	}

	public String getMa_vat_03(){
		return this.ma_vat_03;
	}

	public String getMa_amt_04(){
		return this.ma_amt_04;
	}

	public String getMa_vat_04(){
		return this.ma_vat_04;
	}

	public String getMa_amt_05(){
		return this.ma_amt_05;
	}

	public String getMa_amt_06(){
		return this.ma_amt_06;
	}

	public String getMa_amt_07(){
		return this.ma_amt_07;
	}

	public String getMa_vat_07(){
		return this.ma_vat_07;
	}

	public String getMa_amt_08(){
		return this.ma_amt_08;
	}

	public String getMa_vat_08(){
		return this.ma_vat_08;
	}

	public String getMa_amt_09(){
		return this.ma_amt_09;
	}

	public String getMa_vat_09(){
		return this.ma_vat_09;
	}

	public String getMb_amt_10(){
		return this.mb_amt_10;
	}

	public String getMb_vat_10(){
		return this.mb_vat_10;
	}

	public String getMb_amt_11(){
		return this.mb_amt_11;
	}

	public String getMb_vat_11(){
		return this.mb_vat_11;
	}

	public String getMb_amt_12(){
		return this.mb_amt_12;
	}

	public String getMb_vat_12(){
		return this.mb_vat_12;
	}

	public String getMb_amt_13(){
		return this.mb_amt_13;
	}

	public String getMb_vat_13(){
		return this.mb_vat_13;
	}

	public String getMb_amt_14(){
		return this.mb_amt_14;
	}

	public String getMb_vat_14(){
		return this.mb_vat_14;
	}

	public String getMb_amt_15(){
		return this.mb_amt_15;
	}

	public String getMb_vat_15(){
		return this.mb_vat_15;
	}

	public String getMb_amt_16(){
		return this.mb_amt_16;
	}

	public String getMb_vat_16(){
		return this.mb_vat_16;
	}

	public String getMb_amt_17(){
		return this.mb_amt_17;
	}

	public String getMb_vat_17(){
		return this.mb_vat_17;
	}

	public String getMb_vat_17_d(){
		return this.mb_vat_17_d;
	}

	public String getMc_vat_18(){
		return this.mc_vat_18;
	}

	public String getMc_amt_19(){
		return this.mc_amt_19;
	}

	public String getMc_vat_19(){
		return this.mc_vat_19;
	}

	public String getMc_vat_20(){
		return this.mc_vat_20;
	}

	public String getMc_vat_21(){
		return this.mc_vat_21;
	}

	public String getMc_vat_22(){
		return this.mc_vat_22;
	}

	public String getMc_vat_23(){
		return this.mc_vat_23;
	}

	public String getMc_vat_24(){
		return this.mc_vat_24;
	}

	public String getMc_vat_25(){
		return this.mc_vat_25;
	}

	public String getMd_vat_26(){
		return this.md_vat_26;
	}

	public String getMd_rmk_26_a(){
		return this.md_rmk_26_a;
	}

	public String getMd_vat_26_b(){
		return this.md_vat_26_b;
	}

	public String getMd_rmk_26_c(){
		return this.md_rmk_26_c;
	}

	public String getMd_rmk_26_d(){
		return this.md_rmk_26_d;
	}

	public String getMd_rmk_26_e(){
		return this.md_rmk_26_e;
	}

	public String getMd_rmk_26_f(){
		return this.md_rmk_26_f;
	}

	public String getMd_rmk_26_g(){
		return this.md_rmk_26_g;
	}

	public String getMd_rmk_26_h(){
		return this.md_rmk_26_h;
	}

	public String getMd_rmk_26_i(){
		return this.md_rmk_26_i;
	}

	public String getMd_rmk_26_j(){
		return this.md_rmk_26_j;
	}

	public String getMd_rmk_26_k(){
		return this.md_rmk_26_k;
	}

	public String getMe_bizcond_27(){
		return this.me_bizcond_27;
	}

	public String getMe_item_27(){
		return this.me_item_27;
	}

	public String getMe_indt_27(){
		return this.me_indt_27;
	}

	public String getMe_amt_27(){
		return this.me_amt_27;
	}

	public String getMe_bizcond_28(){
		return this.me_bizcond_28;
	}

	public String getMe_item_28(){
		return this.me_item_28;
	}

	public String getMe_indt_28(){
		return this.me_indt_28;
	}

	public String getMe_amt_28(){
		return this.me_amt_28;
	}

	public String getMe_bizcond_29(){
		return this.me_bizcond_29;
	}

	public String getMe_item_29(){
		return this.me_item_29;
	}

	public String getMe_indt_29(){
		return this.me_indt_29;
	}

	public String getMe_amt_29(){
		return this.me_amt_29;
	}

	public String getMe_bizcond_30(){
		return this.me_bizcond_30;
	}

	public String getMe_item_30(){
		return this.me_item_30;
	}

	public String getMe_indt_30(){
		return this.me_indt_30;
	}

	public String getMe_amt_30(){
		return this.me_amt_30;
	}

	public String getMe_amt_31(){
		return this.me_amt_31;
	}

	public String getMf_tax_agnt_nm(){
		return this.mf_tax_agnt_nm;
	}

	public String getMf_tax_agnt_ern(){
		return this.mf_tax_agnt_ern;
	}

	public String getMf_tax_agnt_tel_no(){
		return this.mf_tax_agnt_tel_no;
	}

	public String getMg_amt_32(){
		return this.mg_amt_32;
	}

	public String getMg_vat_32(){
		return this.mg_vat_32;
	}

	public String getMg_amt_33(){
		return this.mg_amt_33;
	}

	public String getMg_vat_33(){
		return this.mg_vat_33;
	}

	public String getMg_amt_34(){
		return this.mg_amt_34;
	}

	public String getMg_amt_35(){
		return this.mg_amt_35;
	}

	public String getMg_amt_36(){
		return this.mg_amt_36;
	}

	public String getMg_vat_36(){
		return this.mg_vat_36;
	}

	public String getMg_amt_37(){
		return this.mg_amt_37;
	}

	public String getMg_vat_37(){
		return this.mg_vat_37;
	}

	public String getMg_amt_38(){
		return this.mg_amt_38;
	}

	public String getMg_vat_38(){
		return this.mg_vat_38;
	}

	public String getMg_amt_39(){
		return this.mg_amt_39;
	}

	public String getMg_vat_39(){
		return this.mg_vat_39;
	}

	public String getMh_amt_40(){
		return this.mh_amt_40;
	}

	public String getMh_vat_40(){
		return this.mh_vat_40;
	}

	public String getMh_amt_41(){
		return this.mh_amt_41;
	}

	public String getMh_vat_41(){
		return this.mh_vat_41;
	}

	public String getMh_amt_42(){
		return this.mh_amt_42;
	}

	public String getMh_vat_42(){
		return this.mh_vat_42;
	}

	public String getMh_amt_43(){
		return this.mh_amt_43;
	}

	public String getMh_vat_43(){
		return this.mh_vat_43;
	}

	public String getMh_amt_44(){
		return this.mh_amt_44;
	}

	public String getMh_vat_44(){
		return this.mh_vat_44;
	}

	public String getMh_vat_45(){
		return this.mh_vat_45;
	}

	public String getMh_vat_46(){
		return this.mh_vat_46;
	}

	public String getMh_vat_47(){
		return this.mh_vat_47;
	}

	public String getMh_amt_48(){
		return this.mh_amt_48;
	}

	public String getMh_vat_48(){
		return this.mh_vat_48;
	}

	public String getMi_amt_49(){
		return this.mi_amt_49;
	}

	public String getMi_vat_49(){
		return this.mi_vat_49;
	}

	public String getMi_amt_50(){
		return this.mi_amt_50;
	}

	public String getMi_vat_50(){
		return this.mi_vat_50;
	}

	public String getMi_amt_51(){
		return this.mi_amt_51;
	}

	public String getMi_vat_51(){
		return this.mi_vat_51;
	}

	public String getMi_amt_52(){
		return this.mi_amt_52;
	}

	public String getMi_vat_52(){
		return this.mi_vat_52;
	}

	public String getMj_vat_53(){
		return this.mj_vat_53;
	}

	public String getMj_vat_54(){
		return this.mj_vat_54;
	}

	public String getMj_vat_55(){
		return this.mj_vat_55;
	}

	public String getMj_vat_56(){
		return this.mj_vat_56;
	}

	public String getMj_vat_57(){
		return this.mj_vat_57;
	}

	public String getMj_vat_58(){
		return this.mj_vat_58;
	}

	public String getMk_amt_59(){
		return this.mk_amt_59;
	}

	public String getMk_vat_59(){
		return this.mk_vat_59;
	}

	public String getMk_amt_60(){
		return this.mk_amt_60;
	}

	public String getMk_vat_60(){
		return this.mk_vat_60;
	}

	public String getMk_amt_61(){
		return this.mk_amt_61;
	}

	public String getMk_vat_61(){
		return this.mk_vat_61;
	}

	public String getMk_amt_62(){
		return this.mk_amt_62;
	}

	public String getMk_vat_62(){
		return this.mk_vat_62;
	}

	public String getMk_amt_63(){
		return this.mk_amt_63;
	}

	public String getMk_vat_63(){
		return this.mk_vat_63;
	}

	public String getMk_amt_64(){
		return this.mk_amt_64;
	}

	public String getMk_vat_64(){
		return this.mk_vat_64;
	}

	public String getMk_amt_65(){
		return this.mk_amt_65;
	}

	public String getMk_vat_65(){
		return this.mk_vat_65;
	}

	public String getMk_amt_66(){
		return this.mk_amt_66;
	}

	public String getMk_vat_66(){
		return this.mk_vat_66;
	}

	public String getMk_amt_67(){
		return this.mk_amt_67;
	}

	public String getMk_vat_67(){
		return this.mk_vat_67;
	}

	public String getMk_amt_68(){
		return this.mk_amt_68;
	}

	public String getMk_vat_68(){
		return this.mk_vat_68;
	}

	public String getMk_amt_69(){
		return this.mk_amt_69;
	}

	public String getMk_vat_69(){
		return this.mk_vat_69;
	}

	public String getMk_amt_70(){
		return this.mk_amt_70;
	}

	public String getMk_vat_70(){
		return this.mk_vat_70;
	}

	public String getMk_amt_71(){
		return this.mk_amt_71;
	}

	public String getMk_vat_71(){
		return this.mk_vat_71;
	}

	public String getMk_amt_72(){
		return this.mk_amt_72;
	}

	public String getMk_vat_72(){
		return this.mk_vat_72;
	}

	public String getMk_amt_73(){
		return this.mk_amt_73;
	}

	public String getMk_vat_73(){
		return this.mk_vat_73;
	}

	public String getMk_amt_74(){
		return this.mk_amt_74;
	}

	public String getMk_vat_74(){
		return this.mk_vat_74;
	}

	public String getMk_amt_75(){
		return this.mk_amt_75;
	}

	public String getMk_vat_75(){
		return this.mk_vat_75;
	}

	public String getMk_amt_76(){
		return this.mk_amt_76;
	}

	public String getMk_vat_76(){
		return this.mk_vat_76;
	}

	public String getMk_vat_77(){
		return this.mk_vat_77;
	}

	public String getMl_bizcond_78(){
		return this.ml_bizcond_78;
	}

	public String getMl_item_78(){
		return this.ml_item_78;
	}

	public String getMl_indt_78(){
		return this.ml_indt_78;
	}

	public String getMl_amt_78(){
		return this.ml_amt_78;
	}

	public String getMl_bizcond_79(){
		return this.ml_bizcond_79;
	}

	public String getMl_item_79(){
		return this.ml_item_79;
	}

	public String getMl_indt_79(){
		return this.ml_indt_79;
	}

	public String getMl_amt_79(){
		return this.ml_amt_79;
	}

	public String getMl_bizcond_80(){
		return this.ml_bizcond_80;
	}

	public String getMl_item_80(){
		return this.ml_item_80;
	}

	public String getMl_indt_80(){
		return this.ml_indt_80;
	}

	public String getMl_amt_80(){
		return this.ml_amt_80;
	}

	public String getMl_amt_81(){
		return this.ml_amt_81;
	}

	public String getMm_amt_82(){
		return this.mm_amt_82;
	}

	public String getMm_amt_83(){
		return this.mm_amt_83;
	}

	public String getDecl_dt(){
		return this.decl_dt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.erplace_cd = Util.checkString(cstmt.getString(9));
		this.data_cnt = cstmt.getLong(10);
		this.vat_fr_yymm = Util.checkString(cstmt.getString(11));
		this.vat_to_yymm = Util.checkString(cstmt.getString(12));
		this.clos_yn = Util.checkString(cstmt.getString(13));
		this.ma_amt_01 = Util.checkString(cstmt.getString(14));
		this.ma_vat_01 = Util.checkString(cstmt.getString(15));
		this.ma_amt_02 = Util.checkString(cstmt.getString(16));
		this.ma_vat_02 = Util.checkString(cstmt.getString(17));
		this.ma_amt_03 = Util.checkString(cstmt.getString(18));
		this.ma_vat_03 = Util.checkString(cstmt.getString(19));
		this.ma_amt_04 = Util.checkString(cstmt.getString(20));
		this.ma_vat_04 = Util.checkString(cstmt.getString(21));
		this.ma_amt_05 = Util.checkString(cstmt.getString(22));
		this.ma_amt_06 = Util.checkString(cstmt.getString(23));
		this.ma_amt_07 = Util.checkString(cstmt.getString(24));
		this.ma_vat_07 = Util.checkString(cstmt.getString(25));
		this.ma_amt_08 = Util.checkString(cstmt.getString(26));
		this.ma_vat_08 = Util.checkString(cstmt.getString(27));
		this.ma_amt_09 = Util.checkString(cstmt.getString(28));
		this.ma_vat_09 = Util.checkString(cstmt.getString(29));
		this.mb_amt_10 = Util.checkString(cstmt.getString(30));
		this.mb_vat_10 = Util.checkString(cstmt.getString(31));
		this.mb_amt_11 = Util.checkString(cstmt.getString(32));
		this.mb_vat_11 = Util.checkString(cstmt.getString(33));
		this.mb_amt_12 = Util.checkString(cstmt.getString(34));
		this.mb_vat_12 = Util.checkString(cstmt.getString(35));
		this.mb_amt_13 = Util.checkString(cstmt.getString(36));
		this.mb_vat_13 = Util.checkString(cstmt.getString(37));
		this.mb_amt_14 = Util.checkString(cstmt.getString(38));
		this.mb_vat_14 = Util.checkString(cstmt.getString(39));
		this.mb_amt_15 = Util.checkString(cstmt.getString(40));
		this.mb_vat_15 = Util.checkString(cstmt.getString(41));
		this.mb_amt_16 = Util.checkString(cstmt.getString(42));
		this.mb_vat_16 = Util.checkString(cstmt.getString(43));
		this.mb_amt_17 = Util.checkString(cstmt.getString(44));
		this.mb_vat_17 = Util.checkString(cstmt.getString(45));
		this.mb_vat_17_d = Util.checkString(cstmt.getString(46));
		this.mc_vat_18 = Util.checkString(cstmt.getString(47));
		this.mc_amt_19 = Util.checkString(cstmt.getString(48));
		this.mc_vat_19 = Util.checkString(cstmt.getString(49));
		this.mc_vat_20 = Util.checkString(cstmt.getString(50));
		this.mc_vat_21 = Util.checkString(cstmt.getString(51));
		this.mc_vat_22 = Util.checkString(cstmt.getString(52));
		this.mc_vat_23 = Util.checkString(cstmt.getString(53));
		this.mc_vat_24 = Util.checkString(cstmt.getString(54));
		this.mc_vat_25 = Util.checkString(cstmt.getString(55));
		this.md_vat_26 = Util.checkString(cstmt.getString(56));
		this.md_rmk_26_a = Util.checkString(cstmt.getString(57));
		this.md_vat_26_b = Util.checkString(cstmt.getString(58));
		this.md_rmk_26_c = Util.checkString(cstmt.getString(59));
		this.md_rmk_26_d = Util.checkString(cstmt.getString(60));
		this.md_rmk_26_e = Util.checkString(cstmt.getString(61));
		this.md_rmk_26_f = Util.checkString(cstmt.getString(62));
		this.md_rmk_26_g = Util.checkString(cstmt.getString(63));
		this.md_rmk_26_h = Util.checkString(cstmt.getString(64));
		this.md_rmk_26_i = Util.checkString(cstmt.getString(65));
		this.md_rmk_26_j = Util.checkString(cstmt.getString(66));
		this.md_rmk_26_k = Util.checkString(cstmt.getString(67));
		this.me_bizcond_27 = Util.checkString(cstmt.getString(68));
		this.me_item_27 = Util.checkString(cstmt.getString(69));
		this.me_indt_27 = Util.checkString(cstmt.getString(70));
		this.me_amt_27 = Util.checkString(cstmt.getString(71));
		this.me_bizcond_28 = Util.checkString(cstmt.getString(72));
		this.me_item_28 = Util.checkString(cstmt.getString(73));
		this.me_indt_28 = Util.checkString(cstmt.getString(74));
		this.me_amt_28 = Util.checkString(cstmt.getString(75));
		this.me_bizcond_29 = Util.checkString(cstmt.getString(76));
		this.me_item_29 = Util.checkString(cstmt.getString(77));
		this.me_indt_29 = Util.checkString(cstmt.getString(78));
		this.me_amt_29 = Util.checkString(cstmt.getString(79));
		this.me_bizcond_30 = Util.checkString(cstmt.getString(80));
		this.me_item_30 = Util.checkString(cstmt.getString(81));
		this.me_indt_30 = Util.checkString(cstmt.getString(82));
		this.me_amt_30 = Util.checkString(cstmt.getString(83));
		this.me_amt_31 = Util.checkString(cstmt.getString(84));
		this.mf_tax_agnt_nm = Util.checkString(cstmt.getString(85));
		this.mf_tax_agnt_ern = Util.checkString(cstmt.getString(86));
		this.mf_tax_agnt_tel_no = Util.checkString(cstmt.getString(87));
		this.mg_amt_32 = Util.checkString(cstmt.getString(88));
		this.mg_vat_32 = Util.checkString(cstmt.getString(89));
		this.mg_amt_33 = Util.checkString(cstmt.getString(90));
		this.mg_vat_33 = Util.checkString(cstmt.getString(91));
		this.mg_amt_34 = Util.checkString(cstmt.getString(92));
		this.mg_amt_35 = Util.checkString(cstmt.getString(93));
		this.mg_amt_36 = Util.checkString(cstmt.getString(94));
		this.mg_vat_36 = Util.checkString(cstmt.getString(95));
		this.mg_amt_37 = Util.checkString(cstmt.getString(96));
		this.mg_vat_37 = Util.checkString(cstmt.getString(97));
		this.mg_amt_38 = Util.checkString(cstmt.getString(98));
		this.mg_vat_38 = Util.checkString(cstmt.getString(99));
		this.mg_amt_39 = Util.checkString(cstmt.getString(100));
		this.mg_vat_39 = Util.checkString(cstmt.getString(101));
		this.mh_amt_40 = Util.checkString(cstmt.getString(102));
		this.mh_vat_40 = Util.checkString(cstmt.getString(103));
		this.mh_amt_41 = Util.checkString(cstmt.getString(104));
		this.mh_vat_41 = Util.checkString(cstmt.getString(105));
		this.mh_amt_42 = Util.checkString(cstmt.getString(106));
		this.mh_vat_42 = Util.checkString(cstmt.getString(107));
		this.mh_amt_43 = Util.checkString(cstmt.getString(108));
		this.mh_vat_43 = Util.checkString(cstmt.getString(109));
		this.mh_amt_44 = Util.checkString(cstmt.getString(110));
		this.mh_vat_44 = Util.checkString(cstmt.getString(111));
		this.mh_vat_45 = Util.checkString(cstmt.getString(112));
		this.mh_vat_46 = Util.checkString(cstmt.getString(113));
		this.mh_vat_47 = Util.checkString(cstmt.getString(114));
		this.mh_amt_48 = Util.checkString(cstmt.getString(115));
		this.mh_vat_48 = Util.checkString(cstmt.getString(116));
		this.mi_amt_49 = Util.checkString(cstmt.getString(117));
		this.mi_vat_49 = Util.checkString(cstmt.getString(118));
		this.mi_amt_50 = Util.checkString(cstmt.getString(119));
		this.mi_vat_50 = Util.checkString(cstmt.getString(120));
		this.mi_amt_51 = Util.checkString(cstmt.getString(121));
		this.mi_vat_51 = Util.checkString(cstmt.getString(122));
		this.mi_amt_52 = Util.checkString(cstmt.getString(123));
		this.mi_vat_52 = Util.checkString(cstmt.getString(124));
		this.mj_vat_53 = Util.checkString(cstmt.getString(125));
		this.mj_vat_54 = Util.checkString(cstmt.getString(126));
		this.mj_vat_55 = Util.checkString(cstmt.getString(127));
		this.mj_vat_56 = Util.checkString(cstmt.getString(128));
		this.mj_vat_57 = Util.checkString(cstmt.getString(129));
		this.mj_vat_58 = Util.checkString(cstmt.getString(130));
		this.mk_amt_59 = Util.checkString(cstmt.getString(131));
		this.mk_vat_59 = Util.checkString(cstmt.getString(132));
		this.mk_amt_60 = Util.checkString(cstmt.getString(133));
		this.mk_vat_60 = Util.checkString(cstmt.getString(134));
		this.mk_amt_61 = Util.checkString(cstmt.getString(135));
		this.mk_vat_61 = Util.checkString(cstmt.getString(136));
		this.mk_amt_62 = Util.checkString(cstmt.getString(137));
		this.mk_vat_62 = Util.checkString(cstmt.getString(138));
		this.mk_amt_63 = Util.checkString(cstmt.getString(139));
		this.mk_vat_63 = Util.checkString(cstmt.getString(140));
		this.mk_amt_64 = Util.checkString(cstmt.getString(141));
		this.mk_vat_64 = Util.checkString(cstmt.getString(142));
		this.mk_amt_65 = Util.checkString(cstmt.getString(143));
		this.mk_vat_65 = Util.checkString(cstmt.getString(144));
		this.mk_amt_66 = Util.checkString(cstmt.getString(145));
		this.mk_vat_66 = Util.checkString(cstmt.getString(146));
		this.mk_amt_67 = Util.checkString(cstmt.getString(147));
		this.mk_vat_67 = Util.checkString(cstmt.getString(148));
		this.mk_amt_68 = Util.checkString(cstmt.getString(149));
		this.mk_vat_68 = Util.checkString(cstmt.getString(150));
		this.mk_amt_69 = Util.checkString(cstmt.getString(151));
		this.mk_vat_69 = Util.checkString(cstmt.getString(152));
		this.mk_amt_70 = Util.checkString(cstmt.getString(153));
		this.mk_vat_70 = Util.checkString(cstmt.getString(154));
		this.mk_amt_71 = Util.checkString(cstmt.getString(155));
		this.mk_vat_71 = Util.checkString(cstmt.getString(156));
		this.mk_amt_72 = Util.checkString(cstmt.getString(157));
		this.mk_vat_72 = Util.checkString(cstmt.getString(158));
		this.mk_amt_73 = Util.checkString(cstmt.getString(159));
		this.mk_vat_73 = Util.checkString(cstmt.getString(160));
		this.mk_amt_74 = Util.checkString(cstmt.getString(161));
		this.mk_vat_74 = Util.checkString(cstmt.getString(162));
		this.mk_amt_75 = Util.checkString(cstmt.getString(163));
		this.mk_vat_75 = Util.checkString(cstmt.getString(164));
		this.mk_amt_76 = Util.checkString(cstmt.getString(165));
		this.mk_vat_76 = Util.checkString(cstmt.getString(166));
		this.mk_vat_77 = Util.checkString(cstmt.getString(167));
		this.ml_bizcond_78 = Util.checkString(cstmt.getString(168));
		this.ml_item_78 = Util.checkString(cstmt.getString(169));
		this.ml_indt_78 = Util.checkString(cstmt.getString(170));
		this.ml_amt_78 = Util.checkString(cstmt.getString(171));
		this.ml_bizcond_79 = Util.checkString(cstmt.getString(172));
		this.ml_item_79 = Util.checkString(cstmt.getString(173));
		this.ml_indt_79 = Util.checkString(cstmt.getString(174));
		this.ml_amt_79 = Util.checkString(cstmt.getString(175));
		this.ml_bizcond_80 = Util.checkString(cstmt.getString(176));
		this.ml_item_80 = Util.checkString(cstmt.getString(177));
		this.ml_indt_80 = Util.checkString(cstmt.getString(178));
		this.ml_amt_80 = Util.checkString(cstmt.getString(179));
		this.ml_amt_81 = Util.checkString(cstmt.getString(180));
		this.mm_amt_82 = Util.checkString(cstmt.getString(181));
		this.mm_amt_83 = Util.checkString(cstmt.getString(182));
		this.decl_dt = Util.checkString(cstmt.getString(183));
		ResultSet rset0 = (ResultSet) cstmt.getObject(184);
		while(rset0.next()){
			FC_ACCT_6211_SCUR_VATDECLSTMT_LIST_1Record rec = new FC_ACCT_6211_SCUR_VATDECLSTMT_LIST_1Record();
			rec.prof_type_cd = Util.checkString(rset0.getString("prof_type_cd"));
			rec.prof_type_cdnm = Util.checkString(rset0.getString("prof_type_cdnm"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			this.cur_vatdeclstmt_list_1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(185);
		while(rset1.next()){
			FC_ACCT_6211_SCUR_VATDECLSTMT_LIST_2Record rec = new FC_ACCT_6211_SCUR_VATDECLSTMT_LIST_2Record();
			rec.form_no = Util.checkString(rset1.getString("form_no"));
			rec.form_nm = Util.checkString(rset1.getString("form_nm"));
			rec.make_yn = Util.checkString(rset1.getString("make_yn"));
			this.cur_vatdeclstmt_list_2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6211_SDataSet ds = (FC_ACCT_6211_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cur_vatdeclstmt_list_1.size(); i++){
		FC_ACCT_6211_SCUR_VATDECLSTMT_LIST_1Record cur_vatdeclstmt_list_1Rec = (FC_ACCT_6211_SCUR_VATDECLSTMT_LIST_1Record)ds.cur_vatdeclstmt_list_1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_vatdeclstmt_list_2.size(); i++){
		FC_ACCT_6211_SCUR_VATDECLSTMT_LIST_2Record cur_vatdeclstmt_list_2Rec = (FC_ACCT_6211_SCUR_VATDECLSTMT_LIST_2Record)ds.cur_vatdeclstmt_list_2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getErplace_cd()%>
<%= ds.getData_cnt()%>
<%= ds.getVat_fr_yymm()%>
<%= ds.getVat_to_yymm()%>
<%= ds.getClos_yn()%>
<%= ds.getMa_amt_01()%>
<%= ds.getMa_vat_01()%>
<%= ds.getMa_amt_02()%>
<%= ds.getMa_vat_02()%>
<%= ds.getMa_amt_03()%>
<%= ds.getMa_vat_03()%>
<%= ds.getMa_amt_04()%>
<%= ds.getMa_vat_04()%>
<%= ds.getMa_amt_05()%>
<%= ds.getMa_amt_06()%>
<%= ds.getMa_amt_07()%>
<%= ds.getMa_vat_07()%>
<%= ds.getMa_amt_08()%>
<%= ds.getMa_vat_08()%>
<%= ds.getMa_amt_09()%>
<%= ds.getMa_vat_09()%>
<%= ds.getMb_amt_10()%>
<%= ds.getMb_vat_10()%>
<%= ds.getMb_amt_11()%>
<%= ds.getMb_vat_11()%>
<%= ds.getMb_amt_12()%>
<%= ds.getMb_vat_12()%>
<%= ds.getMb_amt_13()%>
<%= ds.getMb_vat_13()%>
<%= ds.getMb_amt_14()%>
<%= ds.getMb_vat_14()%>
<%= ds.getMb_amt_15()%>
<%= ds.getMb_vat_15()%>
<%= ds.getMb_amt_16()%>
<%= ds.getMb_vat_16()%>
<%= ds.getMb_amt_17()%>
<%= ds.getMb_vat_17()%>
<%= ds.getMb_vat_17_d()%>
<%= ds.getMc_vat_18()%>
<%= ds.getMc_amt_19()%>
<%= ds.getMc_vat_19()%>
<%= ds.getMc_vat_20()%>
<%= ds.getMc_vat_21()%>
<%= ds.getMc_vat_22()%>
<%= ds.getMc_vat_23()%>
<%= ds.getMc_vat_24()%>
<%= ds.getMc_vat_25()%>
<%= ds.getMd_vat_26()%>
<%= ds.getMd_rmk_26_a()%>
<%= ds.getMd_vat_26_b()%>
<%= ds.getMd_rmk_26_c()%>
<%= ds.getMd_rmk_26_d()%>
<%= ds.getMd_rmk_26_e()%>
<%= ds.getMd_rmk_26_f()%>
<%= ds.getMd_rmk_26_g()%>
<%= ds.getMd_rmk_26_h()%>
<%= ds.getMd_rmk_26_i()%>
<%= ds.getMd_rmk_26_j()%>
<%= ds.getMd_rmk_26_k()%>
<%= ds.getMe_bizcond_27()%>
<%= ds.getMe_item_27()%>
<%= ds.getMe_indt_27()%>
<%= ds.getMe_amt_27()%>
<%= ds.getMe_bizcond_28()%>
<%= ds.getMe_item_28()%>
<%= ds.getMe_indt_28()%>
<%= ds.getMe_amt_28()%>
<%= ds.getMe_bizcond_29()%>
<%= ds.getMe_item_29()%>
<%= ds.getMe_indt_29()%>
<%= ds.getMe_amt_29()%>
<%= ds.getMe_bizcond_30()%>
<%= ds.getMe_item_30()%>
<%= ds.getMe_indt_30()%>
<%= ds.getMe_amt_30()%>
<%= ds.getMe_amt_31()%>
<%= ds.getMf_tax_agnt_nm()%>
<%= ds.getMf_tax_agnt_ern()%>
<%= ds.getMf_tax_agnt_tel_no()%>
<%= ds.getMg_amt_32()%>
<%= ds.getMg_vat_32()%>
<%= ds.getMg_amt_33()%>
<%= ds.getMg_vat_33()%>
<%= ds.getMg_amt_34()%>
<%= ds.getMg_amt_35()%>
<%= ds.getMg_amt_36()%>
<%= ds.getMg_vat_36()%>
<%= ds.getMg_amt_37()%>
<%= ds.getMg_vat_37()%>
<%= ds.getMg_amt_38()%>
<%= ds.getMg_vat_38()%>
<%= ds.getMg_amt_39()%>
<%= ds.getMg_vat_39()%>
<%= ds.getMh_amt_40()%>
<%= ds.getMh_vat_40()%>
<%= ds.getMh_amt_41()%>
<%= ds.getMh_vat_41()%>
<%= ds.getMh_amt_42()%>
<%= ds.getMh_vat_42()%>
<%= ds.getMh_amt_43()%>
<%= ds.getMh_vat_43()%>
<%= ds.getMh_amt_44()%>
<%= ds.getMh_vat_44()%>
<%= ds.getMh_vat_45()%>
<%= ds.getMh_vat_46()%>
<%= ds.getMh_vat_47()%>
<%= ds.getMh_amt_48()%>
<%= ds.getMh_vat_48()%>
<%= ds.getMi_amt_49()%>
<%= ds.getMi_vat_49()%>
<%= ds.getMi_amt_50()%>
<%= ds.getMi_vat_50()%>
<%= ds.getMi_amt_51()%>
<%= ds.getMi_vat_51()%>
<%= ds.getMi_amt_52()%>
<%= ds.getMi_vat_52()%>
<%= ds.getMj_vat_53()%>
<%= ds.getMj_vat_54()%>
<%= ds.getMj_vat_55()%>
<%= ds.getMj_vat_56()%>
<%= ds.getMj_vat_57()%>
<%= ds.getMj_vat_58()%>
<%= ds.getMk_amt_59()%>
<%= ds.getMk_vat_59()%>
<%= ds.getMk_amt_60()%>
<%= ds.getMk_vat_60()%>
<%= ds.getMk_amt_61()%>
<%= ds.getMk_vat_61()%>
<%= ds.getMk_amt_62()%>
<%= ds.getMk_vat_62()%>
<%= ds.getMk_amt_63()%>
<%= ds.getMk_vat_63()%>
<%= ds.getMk_amt_64()%>
<%= ds.getMk_vat_64()%>
<%= ds.getMk_amt_65()%>
<%= ds.getMk_vat_65()%>
<%= ds.getMk_amt_66()%>
<%= ds.getMk_vat_66()%>
<%= ds.getMk_amt_67()%>
<%= ds.getMk_vat_67()%>
<%= ds.getMk_amt_68()%>
<%= ds.getMk_vat_68()%>
<%= ds.getMk_amt_69()%>
<%= ds.getMk_vat_69()%>
<%= ds.getMk_amt_70()%>
<%= ds.getMk_vat_70()%>
<%= ds.getMk_amt_71()%>
<%= ds.getMk_vat_71()%>
<%= ds.getMk_amt_72()%>
<%= ds.getMk_vat_72()%>
<%= ds.getMk_amt_73()%>
<%= ds.getMk_vat_73()%>
<%= ds.getMk_amt_74()%>
<%= ds.getMk_vat_74()%>
<%= ds.getMk_amt_75()%>
<%= ds.getMk_vat_75()%>
<%= ds.getMk_amt_76()%>
<%= ds.getMk_vat_76()%>
<%= ds.getMk_vat_77()%>
<%= ds.getMl_bizcond_78()%>
<%= ds.getMl_item_78()%>
<%= ds.getMl_indt_78()%>
<%= ds.getMl_amt_78()%>
<%= ds.getMl_bizcond_79()%>
<%= ds.getMl_item_79()%>
<%= ds.getMl_indt_79()%>
<%= ds.getMl_amt_79()%>
<%= ds.getMl_bizcond_80()%>
<%= ds.getMl_item_80()%>
<%= ds.getMl_indt_80()%>
<%= ds.getMl_amt_80()%>
<%= ds.getMl_amt_81()%>
<%= ds.getMm_amt_82()%>
<%= ds.getMm_amt_83()%>
<%= ds.getDecl_dt()%>
<%= ds.getCur_vatdeclstmt_list_1()%>
<%= ds.getCur_vatdeclstmt_list_2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cur_vatdeclstmt_list_1Rec.prof_type_cd%>
<%= cur_vatdeclstmt_list_1Rec.prof_type_cdnm%>
<%= cur_vatdeclstmt_list_1Rec.suply_amt%>
<%= cur_vatdeclstmt_list_1Rec.vat_amt%>
<%= cur_vatdeclstmt_list_2Rec.form_no%>
<%= cur_vatdeclstmt_list_2Rec.form_nm%>
<%= cur_vatdeclstmt_list_2Rec.make_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 21 11:14:03 KST 2015 */