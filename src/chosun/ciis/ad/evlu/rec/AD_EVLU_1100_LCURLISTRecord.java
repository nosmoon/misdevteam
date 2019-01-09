/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.evlu.rec;

import java.sql.*;
import chosun.ciis.ad.evlu.dm.*;
import chosun.ciis.ad.evlu.ds.*;

/**
 * 
 */


public class AD_EVLU_1100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pubc_dd;
	public String pubc_yyyymmdd;
	public String emp_no_t1;
	public String paper_scor_t1;
	public String pubsh_scor_t1;
	public String pric_scor_t1;
	public String spcl_scor_t1;
	public String adj_evlu_scor_t1;
	public String emp_no_t2;
	public String paper_scor_t2;
	public String pubsh_scor_t2;
	public String pric_scor_t2;
	public String spcl_scor_t2;
	public String adj_evlu_scor_t2;
	public String emp_no_t3;
	public String paper_scor_t3;
	public String pubsh_scor_t3;
	public String pric_scor_t3;
	public String spcl_scor_t3;
	public String adj_evlu_scor_t3;
	public String emp_no_t4;
	public String paper_scor_t4;
	public String pubsh_scor_t4;
	public String pric_scor_t4;
	public String spcl_scor_t4;
	public String adj_evlu_scor_t4;
	public String emp_no_t5;
	public String paper_scor_t5;
	public String pubsh_scor_t5;
	public String pric_scor_t5;
	public String spcl_scor_t5;
	public String adj_evlu_scor_t5;
	public String emp_no_t6;
	public String paper_scor_t6;
	public String pubsh_scor_t6;
	public String pric_scor_t6;
	public String spcl_scor_t6;
	public String adj_evlu_scor_t6;
	public String emp_no_t7;
	public String paper_scor_t7;
	public String pubsh_scor_t7;
	public String pric_scor_t7;
	public String spcl_scor_t7;
	public String adj_evlu_scor_t7;
	public String emp_no_t8;
	public String paper_scor_t8;
	public String pubsh_scor_t8;
	public String pric_scor_t8;
	public String spcl_scor_t8;
	public String adj_evlu_scor_t8;
	public String emp_no_t9;
	public String paper_scor_t9;
	public String pubsh_scor_t9;
	public String pric_scor_t9;
	public String spcl_scor_t9;
	public String adj_evlu_scor_t9;
	public String emp_no_t10;
	public String paper_scor_t10;
	public String pubsh_scor_t10;
	public String pric_scor_t10;
	public String spcl_scor_t10;
	public String adj_evlu_scor_t10;
	public String emp_no_t11;
	public String paper_scor_t11;
	public String pubsh_scor_t11;
	public String pric_scor_t11;
	public String spcl_scor_t11;
	public String adj_evlu_scor_t11;
	public String emp_no_t12;
	public String paper_scor_t12;
	public String pubsh_scor_t12;
	public String pric_scor_t12;
	public String spcl_scor_t12;
	public String adj_evlu_scor_t12;
	public String emp_no_t13;
	public String paper_scor_t13;
	public String pubsh_scor_t13;
	public String pric_scor_t13;
	public String spcl_scor_t13;
	public String adj_evlu_scor_t13;
	public String emp_no_t14;
	public String paper_scor_t14;
	public String pubsh_scor_t14;
	public String pric_scor_t14;
	public String spcl_scor_t14;
	public String adj_evlu_scor_t14;
	public String emp_no_t15;
	public String paper_scor_t15;
	public String pubsh_scor_t15;
	public String pric_scor_t15;
	public String spcl_scor_t15;
	public String adj_evlu_scor_t15;
	public String emp_no_t16;
	public String paper_scor_t16;
	public String pubsh_scor_t16;
	public String pric_scor_t16;
	public String spcl_scor_t16;
	public String adj_evlu_scor_t16;
	public String emp_no_t17;
	public String paper_scor_t17;
	public String pubsh_scor_t17;
	public String pric_scor_t17;
	public String spcl_scor_t17;
	public String adj_evlu_scor_t17;
	public String emp_no_t18;
	public String paper_scor_t18;
	public String pubsh_scor_t18;
	public String pric_scor_t18;
	public String spcl_scor_t18;
	public String adj_evlu_scor_t18;
	public String emp_no_t19;
	public String paper_scor_t19;
	public String pubsh_scor_t19;
	public String pric_scor_t19;
	public String spcl_scor_t19;
	public String adj_evlu_scor_t19;
	public String emp_no_t20;
	public String paper_scor_t20;
	public String pubsh_scor_t20;
	public String pric_scor_t20;
	public String spcl_scor_t20;
	public String adj_evlu_scor_t20;
	public String emp_no_t21;
	public String paper_scor_t21;
	public String pubsh_scor_t21;
	public String pric_scor_t21;
	public String spcl_scor_t21;
	public String adj_evlu_scor_t21;
	public String emp_no_t22;
	public String paper_scor_t22;
	public String pubsh_scor_t22;
	public String pric_scor_t22;
	public String spcl_scor_t22;
	public String adj_evlu_scor_t22;
	public String emp_no_t23;
	public String paper_scor_t23;
	public String pubsh_scor_t23;
	public String pric_scor_t23;
	public String spcl_scor_t23;
	public String adj_evlu_scor_t23;
	public String emp_no_t24;
	public String paper_scor_t24;
	public String pubsh_scor_t24;
	public String pric_scor_t24;
	public String spcl_scor_t24;
	public String adj_evlu_scor_t24;
	public String emp_no_t25;
	public String paper_scor_t25;
	public String pubsh_scor_t25;
	public String pric_scor_t25;
	public String spcl_scor_t25;
	public String adj_evlu_scor_t25;
	public String emp_no_t26;
	public String paper_scor_t26;
	public String pubsh_scor_t26;
	public String pric_scor_t26;
	public String spcl_scor_t26;
	public String adj_evlu_scor_t26;
	public String emp_no_t27;
	public String paper_scor_t27;
	public String pubsh_scor_t27;
	public String pric_scor_t27;
	public String spcl_scor_t27;
	public String adj_evlu_scor_t27;
	public String emp_no_t28;
	public String paper_scor_t28;
	public String pubsh_scor_t28;
	public String pric_scor_t28;
	public String spcl_scor_t28;
	public String adj_evlu_scor_t28;

	public AD_EVLU_1100_LCURLISTRecord(){}

	public void setPubc_dd(String pubc_dd){
		this.pubc_dd = pubc_dd;
	}

	public void setPubc_yyyymmdd(String pubc_yyyymmdd){
		this.pubc_yyyymmdd = pubc_yyyymmdd;
	}

	public void setEmp_no_t1(String emp_no_t1){
		this.emp_no_t1 = emp_no_t1;
	}

	public void setPaper_scor_t1(String paper_scor_t1){
		this.paper_scor_t1 = paper_scor_t1;
	}

	public void setPubsh_scor_t1(String pubsh_scor_t1){
		this.pubsh_scor_t1 = pubsh_scor_t1;
	}

	public void setPric_scor_t1(String pric_scor_t1){
		this.pric_scor_t1 = pric_scor_t1;
	}

	public void setSpcl_scor_t1(String spcl_scor_t1){
		this.spcl_scor_t1 = spcl_scor_t1;
	}

	public void setAdj_evlu_scor_t1(String adj_evlu_scor_t1){
		this.adj_evlu_scor_t1 = adj_evlu_scor_t1;
	}

	public void setEmp_no_t2(String emp_no_t2){
		this.emp_no_t2 = emp_no_t2;
	}

	public void setPaper_scor_t2(String paper_scor_t2){
		this.paper_scor_t2 = paper_scor_t2;
	}

	public void setPubsh_scor_t2(String pubsh_scor_t2){
		this.pubsh_scor_t2 = pubsh_scor_t2;
	}

	public void setPric_scor_t2(String pric_scor_t2){
		this.pric_scor_t2 = pric_scor_t2;
	}

	public void setSpcl_scor_t2(String spcl_scor_t2){
		this.spcl_scor_t2 = spcl_scor_t2;
	}

	public void setAdj_evlu_scor_t2(String adj_evlu_scor_t2){
		this.adj_evlu_scor_t2 = adj_evlu_scor_t2;
	}

	public void setEmp_no_t3(String emp_no_t3){
		this.emp_no_t3 = emp_no_t3;
	}

	public void setPaper_scor_t3(String paper_scor_t3){
		this.paper_scor_t3 = paper_scor_t3;
	}

	public void setPubsh_scor_t3(String pubsh_scor_t3){
		this.pubsh_scor_t3 = pubsh_scor_t3;
	}

	public void setPric_scor_t3(String pric_scor_t3){
		this.pric_scor_t3 = pric_scor_t3;
	}

	public void setSpcl_scor_t3(String spcl_scor_t3){
		this.spcl_scor_t3 = spcl_scor_t3;
	}

	public void setAdj_evlu_scor_t3(String adj_evlu_scor_t3){
		this.adj_evlu_scor_t3 = adj_evlu_scor_t3;
	}

	public void setEmp_no_t4(String emp_no_t4){
		this.emp_no_t4 = emp_no_t4;
	}

	public void setPaper_scor_t4(String paper_scor_t4){
		this.paper_scor_t4 = paper_scor_t4;
	}

	public void setPubsh_scor_t4(String pubsh_scor_t4){
		this.pubsh_scor_t4 = pubsh_scor_t4;
	}

	public void setPric_scor_t4(String pric_scor_t4){
		this.pric_scor_t4 = pric_scor_t4;
	}

	public void setSpcl_scor_t4(String spcl_scor_t4){
		this.spcl_scor_t4 = spcl_scor_t4;
	}

	public void setAdj_evlu_scor_t4(String adj_evlu_scor_t4){
		this.adj_evlu_scor_t4 = adj_evlu_scor_t4;
	}

	public void setEmp_no_t5(String emp_no_t5){
		this.emp_no_t5 = emp_no_t5;
	}

	public void setPaper_scor_t5(String paper_scor_t5){
		this.paper_scor_t5 = paper_scor_t5;
	}

	public void setPubsh_scor_t5(String pubsh_scor_t5){
		this.pubsh_scor_t5 = pubsh_scor_t5;
	}

	public void setPric_scor_t5(String pric_scor_t5){
		this.pric_scor_t5 = pric_scor_t5;
	}

	public void setSpcl_scor_t5(String spcl_scor_t5){
		this.spcl_scor_t5 = spcl_scor_t5;
	}

	public void setAdj_evlu_scor_t5(String adj_evlu_scor_t5){
		this.adj_evlu_scor_t5 = adj_evlu_scor_t5;
	}

	public void setEmp_no_t6(String emp_no_t6){
		this.emp_no_t6 = emp_no_t6;
	}

	public void setPaper_scor_t6(String paper_scor_t6){
		this.paper_scor_t6 = paper_scor_t6;
	}

	public void setPubsh_scor_t6(String pubsh_scor_t6){
		this.pubsh_scor_t6 = pubsh_scor_t6;
	}

	public void setPric_scor_t6(String pric_scor_t6){
		this.pric_scor_t6 = pric_scor_t6;
	}

	public void setSpcl_scor_t6(String spcl_scor_t6){
		this.spcl_scor_t6 = spcl_scor_t6;
	}

	public void setAdj_evlu_scor_t6(String adj_evlu_scor_t6){
		this.adj_evlu_scor_t6 = adj_evlu_scor_t6;
	}

	public void setEmp_no_t7(String emp_no_t7){
		this.emp_no_t7 = emp_no_t7;
	}

	public void setPaper_scor_t7(String paper_scor_t7){
		this.paper_scor_t7 = paper_scor_t7;
	}

	public void setPubsh_scor_t7(String pubsh_scor_t7){
		this.pubsh_scor_t7 = pubsh_scor_t7;
	}

	public void setPric_scor_t7(String pric_scor_t7){
		this.pric_scor_t7 = pric_scor_t7;
	}

	public void setSpcl_scor_t7(String spcl_scor_t7){
		this.spcl_scor_t7 = spcl_scor_t7;
	}

	public void setAdj_evlu_scor_t7(String adj_evlu_scor_t7){
		this.adj_evlu_scor_t7 = adj_evlu_scor_t7;
	}

	public void setEmp_no_t8(String emp_no_t8){
		this.emp_no_t8 = emp_no_t8;
	}

	public void setPaper_scor_t8(String paper_scor_t8){
		this.paper_scor_t8 = paper_scor_t8;
	}

	public void setPubsh_scor_t8(String pubsh_scor_t8){
		this.pubsh_scor_t8 = pubsh_scor_t8;
	}

	public void setPric_scor_t8(String pric_scor_t8){
		this.pric_scor_t8 = pric_scor_t8;
	}

	public void setSpcl_scor_t8(String spcl_scor_t8){
		this.spcl_scor_t8 = spcl_scor_t8;
	}

	public void setAdj_evlu_scor_t8(String adj_evlu_scor_t8){
		this.adj_evlu_scor_t8 = adj_evlu_scor_t8;
	}

	public void setEmp_no_t9(String emp_no_t9){
		this.emp_no_t9 = emp_no_t9;
	}

	public void setPaper_scor_t9(String paper_scor_t9){
		this.paper_scor_t9 = paper_scor_t9;
	}

	public void setPubsh_scor_t9(String pubsh_scor_t9){
		this.pubsh_scor_t9 = pubsh_scor_t9;
	}

	public void setPric_scor_t9(String pric_scor_t9){
		this.pric_scor_t9 = pric_scor_t9;
	}

	public void setSpcl_scor_t9(String spcl_scor_t9){
		this.spcl_scor_t9 = spcl_scor_t9;
	}

	public void setAdj_evlu_scor_t9(String adj_evlu_scor_t9){
		this.adj_evlu_scor_t9 = adj_evlu_scor_t9;
	}

	public void setEmp_no_t10(String emp_no_t10){
		this.emp_no_t10 = emp_no_t10;
	}

	public void setPaper_scor_t10(String paper_scor_t10){
		this.paper_scor_t10 = paper_scor_t10;
	}

	public void setPubsh_scor_t10(String pubsh_scor_t10){
		this.pubsh_scor_t10 = pubsh_scor_t10;
	}

	public void setPric_scor_t10(String pric_scor_t10){
		this.pric_scor_t10 = pric_scor_t10;
	}

	public void setSpcl_scor_t10(String spcl_scor_t10){
		this.spcl_scor_t10 = spcl_scor_t10;
	}

	public void setAdj_evlu_scor_t10(String adj_evlu_scor_t10){
		this.adj_evlu_scor_t10 = adj_evlu_scor_t10;
	}

	public void setEmp_no_t11(String emp_no_t11){
		this.emp_no_t11 = emp_no_t11;
	}

	public void setPaper_scor_t11(String paper_scor_t11){
		this.paper_scor_t11 = paper_scor_t11;
	}

	public void setPubsh_scor_t11(String pubsh_scor_t11){
		this.pubsh_scor_t11 = pubsh_scor_t11;
	}

	public void setPric_scor_t11(String pric_scor_t11){
		this.pric_scor_t11 = pric_scor_t11;
	}

	public void setSpcl_scor_t11(String spcl_scor_t11){
		this.spcl_scor_t11 = spcl_scor_t11;
	}

	public void setAdj_evlu_scor_t11(String adj_evlu_scor_t11){
		this.adj_evlu_scor_t11 = adj_evlu_scor_t11;
	}

	public void setEmp_no_t12(String emp_no_t12){
		this.emp_no_t12 = emp_no_t12;
	}

	public void setPaper_scor_t12(String paper_scor_t12){
		this.paper_scor_t12 = paper_scor_t12;
	}

	public void setPubsh_scor_t12(String pubsh_scor_t12){
		this.pubsh_scor_t12 = pubsh_scor_t12;
	}

	public void setPric_scor_t12(String pric_scor_t12){
		this.pric_scor_t12 = pric_scor_t12;
	}

	public void setSpcl_scor_t12(String spcl_scor_t12){
		this.spcl_scor_t12 = spcl_scor_t12;
	}

	public void setAdj_evlu_scor_t12(String adj_evlu_scor_t12){
		this.adj_evlu_scor_t12 = adj_evlu_scor_t12;
	}

	public void setEmp_no_t13(String emp_no_t13){
		this.emp_no_t13 = emp_no_t13;
	}

	public void setPaper_scor_t13(String paper_scor_t13){
		this.paper_scor_t13 = paper_scor_t13;
	}

	public void setPubsh_scor_t13(String pubsh_scor_t13){
		this.pubsh_scor_t13 = pubsh_scor_t13;
	}

	public void setPric_scor_t13(String pric_scor_t13){
		this.pric_scor_t13 = pric_scor_t13;
	}

	public void setSpcl_scor_t13(String spcl_scor_t13){
		this.spcl_scor_t13 = spcl_scor_t13;
	}

	public void setAdj_evlu_scor_t13(String adj_evlu_scor_t13){
		this.adj_evlu_scor_t13 = adj_evlu_scor_t13;
	}

	public void setEmp_no_t14(String emp_no_t14){
		this.emp_no_t14 = emp_no_t14;
	}

	public void setPaper_scor_t14(String paper_scor_t14){
		this.paper_scor_t14 = paper_scor_t14;
	}

	public void setPubsh_scor_t14(String pubsh_scor_t14){
		this.pubsh_scor_t14 = pubsh_scor_t14;
	}

	public void setPric_scor_t14(String pric_scor_t14){
		this.pric_scor_t14 = pric_scor_t14;
	}

	public void setSpcl_scor_t14(String spcl_scor_t14){
		this.spcl_scor_t14 = spcl_scor_t14;
	}

	public void setAdj_evlu_scor_t14(String adj_evlu_scor_t14){
		this.adj_evlu_scor_t14 = adj_evlu_scor_t14;
	}

	public void setEmp_no_t15(String emp_no_t15){
		this.emp_no_t15 = emp_no_t15;
	}

	public void setPaper_scor_t15(String paper_scor_t15){
		this.paper_scor_t15 = paper_scor_t15;
	}

	public void setPubsh_scor_t15(String pubsh_scor_t15){
		this.pubsh_scor_t15 = pubsh_scor_t15;
	}

	public void setPric_scor_t15(String pric_scor_t15){
		this.pric_scor_t15 = pric_scor_t15;
	}

	public void setSpcl_scor_t15(String spcl_scor_t15){
		this.spcl_scor_t15 = spcl_scor_t15;
	}

	public void setAdj_evlu_scor_t15(String adj_evlu_scor_t15){
		this.adj_evlu_scor_t15 = adj_evlu_scor_t15;
	}

	public void setEmp_no_t16(String emp_no_t16){
		this.emp_no_t16 = emp_no_t16;
	}

	public void setPaper_scor_t16(String paper_scor_t16){
		this.paper_scor_t16 = paper_scor_t16;
	}

	public void setPubsh_scor_t16(String pubsh_scor_t16){
		this.pubsh_scor_t16 = pubsh_scor_t16;
	}

	public void setPric_scor_t16(String pric_scor_t16){
		this.pric_scor_t16 = pric_scor_t16;
	}

	public void setSpcl_scor_t16(String spcl_scor_t16){
		this.spcl_scor_t16 = spcl_scor_t16;
	}

	public void setAdj_evlu_scor_t16(String adj_evlu_scor_t16){
		this.adj_evlu_scor_t16 = adj_evlu_scor_t16;
	}

	public void setEmp_no_t17(String emp_no_t17){
		this.emp_no_t17 = emp_no_t17;
	}

	public void setPaper_scor_t17(String paper_scor_t17){
		this.paper_scor_t17 = paper_scor_t17;
	}

	public void setPubsh_scor_t17(String pubsh_scor_t17){
		this.pubsh_scor_t17 = pubsh_scor_t17;
	}

	public void setPric_scor_t17(String pric_scor_t17){
		this.pric_scor_t17 = pric_scor_t17;
	}

	public void setSpcl_scor_t17(String spcl_scor_t17){
		this.spcl_scor_t17 = spcl_scor_t17;
	}

	public void setAdj_evlu_scor_t17(String adj_evlu_scor_t17){
		this.adj_evlu_scor_t17 = adj_evlu_scor_t17;
	}

	public void setEmp_no_t18(String emp_no_t18){
		this.emp_no_t18 = emp_no_t18;
	}

	public void setPaper_scor_t18(String paper_scor_t18){
		this.paper_scor_t18 = paper_scor_t18;
	}

	public void setPubsh_scor_t18(String pubsh_scor_t18){
		this.pubsh_scor_t18 = pubsh_scor_t18;
	}

	public void setPric_scor_t18(String pric_scor_t18){
		this.pric_scor_t18 = pric_scor_t18;
	}

	public void setSpcl_scor_t18(String spcl_scor_t18){
		this.spcl_scor_t18 = spcl_scor_t18;
	}

	public void setAdj_evlu_scor_t18(String adj_evlu_scor_t18){
		this.adj_evlu_scor_t18 = adj_evlu_scor_t18;
	}

	public void setEmp_no_t19(String emp_no_t19){
		this.emp_no_t19 = emp_no_t19;
	}

	public void setPaper_scor_t19(String paper_scor_t19){
		this.paper_scor_t19 = paper_scor_t19;
	}

	public void setPubsh_scor_t19(String pubsh_scor_t19){
		this.pubsh_scor_t19 = pubsh_scor_t19;
	}

	public void setPric_scor_t19(String pric_scor_t19){
		this.pric_scor_t19 = pric_scor_t19;
	}

	public void setSpcl_scor_t19(String spcl_scor_t19){
		this.spcl_scor_t19 = spcl_scor_t19;
	}

	public void setAdj_evlu_scor_t19(String adj_evlu_scor_t19){
		this.adj_evlu_scor_t19 = adj_evlu_scor_t19;
	}

	public void setEmp_no_t20(String emp_no_t20){
		this.emp_no_t20 = emp_no_t20;
	}

	public void setPaper_scor_t20(String paper_scor_t20){
		this.paper_scor_t20 = paper_scor_t20;
	}

	public void setPubsh_scor_t20(String pubsh_scor_t20){
		this.pubsh_scor_t20 = pubsh_scor_t20;
	}

	public void setPric_scor_t20(String pric_scor_t20){
		this.pric_scor_t20 = pric_scor_t20;
	}

	public void setSpcl_scor_t20(String spcl_scor_t20){
		this.spcl_scor_t20 = spcl_scor_t20;
	}

	public void setAdj_evlu_scor_t20(String adj_evlu_scor_t20){
		this.adj_evlu_scor_t20 = adj_evlu_scor_t20;
	}

	public void setEmp_no_t21(String emp_no_t21){
		this.emp_no_t21 = emp_no_t21;
	}

	public void setPaper_scor_t21(String paper_scor_t21){
		this.paper_scor_t21 = paper_scor_t21;
	}

	public void setPubsh_scor_t21(String pubsh_scor_t21){
		this.pubsh_scor_t21 = pubsh_scor_t21;
	}

	public void setPric_scor_t21(String pric_scor_t21){
		this.pric_scor_t21 = pric_scor_t21;
	}

	public void setSpcl_scor_t21(String spcl_scor_t21){
		this.spcl_scor_t21 = spcl_scor_t21;
	}

	public void setAdj_evlu_scor_t21(String adj_evlu_scor_t21){
		this.adj_evlu_scor_t21 = adj_evlu_scor_t21;
	}

	public void setEmp_no_t22(String emp_no_t22){
		this.emp_no_t22 = emp_no_t22;
	}

	public void setPaper_scor_t22(String paper_scor_t22){
		this.paper_scor_t22 = paper_scor_t22;
	}

	public void setPubsh_scor_t22(String pubsh_scor_t22){
		this.pubsh_scor_t22 = pubsh_scor_t22;
	}

	public void setPric_scor_t22(String pric_scor_t22){
		this.pric_scor_t22 = pric_scor_t22;
	}

	public void setSpcl_scor_t22(String spcl_scor_t22){
		this.spcl_scor_t22 = spcl_scor_t22;
	}

	public void setAdj_evlu_scor_t22(String adj_evlu_scor_t22){
		this.adj_evlu_scor_t22 = adj_evlu_scor_t22;
	}

	public void setEmp_no_t23(String emp_no_t23){
		this.emp_no_t23 = emp_no_t23;
	}

	public void setPaper_scor_t23(String paper_scor_t23){
		this.paper_scor_t23 = paper_scor_t23;
	}

	public void setPubsh_scor_t23(String pubsh_scor_t23){
		this.pubsh_scor_t23 = pubsh_scor_t23;
	}

	public void setPric_scor_t23(String pric_scor_t23){
		this.pric_scor_t23 = pric_scor_t23;
	}

	public void setSpcl_scor_t23(String spcl_scor_t23){
		this.spcl_scor_t23 = spcl_scor_t23;
	}

	public void setAdj_evlu_scor_t23(String adj_evlu_scor_t23){
		this.adj_evlu_scor_t23 = adj_evlu_scor_t23;
	}

	public void setEmp_no_t24(String emp_no_t24){
		this.emp_no_t24 = emp_no_t24;
	}

	public void setPaper_scor_t24(String paper_scor_t24){
		this.paper_scor_t24 = paper_scor_t24;
	}

	public void setPubsh_scor_t24(String pubsh_scor_t24){
		this.pubsh_scor_t24 = pubsh_scor_t24;
	}

	public void setPric_scor_t24(String pric_scor_t24){
		this.pric_scor_t24 = pric_scor_t24;
	}

	public void setSpcl_scor_t24(String spcl_scor_t24){
		this.spcl_scor_t24 = spcl_scor_t24;
	}

	public void setAdj_evlu_scor_t24(String adj_evlu_scor_t24){
		this.adj_evlu_scor_t24 = adj_evlu_scor_t24;
	}

	public void setEmp_no_t25(String emp_no_t25){
		this.emp_no_t25 = emp_no_t25;
	}

	public void setPaper_scor_t25(String paper_scor_t25){
		this.paper_scor_t25 = paper_scor_t25;
	}

	public void setPubsh_scor_t25(String pubsh_scor_t25){
		this.pubsh_scor_t25 = pubsh_scor_t25;
	}

	public void setPric_scor_t25(String pric_scor_t25){
		this.pric_scor_t25 = pric_scor_t25;
	}

	public void setSpcl_scor_t25(String spcl_scor_t25){
		this.spcl_scor_t25 = spcl_scor_t25;
	}

	public void setAdj_evlu_scor_t25(String adj_evlu_scor_t25){
		this.adj_evlu_scor_t25 = adj_evlu_scor_t25;
	}

	public void setEmp_no_t26(String emp_no_t26){
		this.emp_no_t26 = emp_no_t26;
	}

	public void setPaper_scor_t26(String paper_scor_t26){
		this.paper_scor_t26 = paper_scor_t26;
	}

	public void setPubsh_scor_t26(String pubsh_scor_t26){
		this.pubsh_scor_t26 = pubsh_scor_t26;
	}

	public void setPric_scor_t26(String pric_scor_t26){
		this.pric_scor_t26 = pric_scor_t26;
	}

	public void setSpcl_scor_t26(String spcl_scor_t26){
		this.spcl_scor_t26 = spcl_scor_t26;
	}

	public void setAdj_evlu_scor_t26(String adj_evlu_scor_t26){
		this.adj_evlu_scor_t26 = adj_evlu_scor_t26;
	}

	public void setEmp_no_t27(String emp_no_t27){
		this.emp_no_t27 = emp_no_t27;
	}

	public void setPaper_scor_t27(String paper_scor_t27){
		this.paper_scor_t27 = paper_scor_t27;
	}

	public void setPubsh_scor_t27(String pubsh_scor_t27){
		this.pubsh_scor_t27 = pubsh_scor_t27;
	}

	public void setPric_scor_t27(String pric_scor_t27){
		this.pric_scor_t27 = pric_scor_t27;
	}

	public void setSpcl_scor_t27(String spcl_scor_t27){
		this.spcl_scor_t27 = spcl_scor_t27;
	}

	public void setAdj_evlu_scor_t27(String adj_evlu_scor_t27){
		this.adj_evlu_scor_t27 = adj_evlu_scor_t27;
	}

	public void setEmp_no_t28(String emp_no_t28){
		this.emp_no_t28 = emp_no_t28;
	}

	public void setPaper_scor_t28(String paper_scor_t28){
		this.paper_scor_t28 = paper_scor_t28;
	}

	public void setPubsh_scor_t28(String pubsh_scor_t28){
		this.pubsh_scor_t28 = pubsh_scor_t28;
	}

	public void setPric_scor_t28(String pric_scor_t28){
		this.pric_scor_t28 = pric_scor_t28;
	}

	public void setSpcl_scor_t28(String spcl_scor_t28){
		this.spcl_scor_t28 = spcl_scor_t28;
	}

	public void setAdj_evlu_scor_t28(String adj_evlu_scor_t28){
		this.adj_evlu_scor_t28 = adj_evlu_scor_t28;
	}

	public String getPubc_dd(){
		return this.pubc_dd;
	}

	public String getPubc_yyyymmdd(){
		return this.pubc_yyyymmdd;
	}

	public String getEmp_no_t1(){
		return this.emp_no_t1;
	}

	public String getPaper_scor_t1(){
		return this.paper_scor_t1;
	}

	public String getPubsh_scor_t1(){
		return this.pubsh_scor_t1;
	}

	public String getPric_scor_t1(){
		return this.pric_scor_t1;
	}

	public String getSpcl_scor_t1(){
		return this.spcl_scor_t1;
	}

	public String getAdj_evlu_scor_t1(){
		return this.adj_evlu_scor_t1;
	}

	public String getEmp_no_t2(){
		return this.emp_no_t2;
	}

	public String getPaper_scor_t2(){
		return this.paper_scor_t2;
	}

	public String getPubsh_scor_t2(){
		return this.pubsh_scor_t2;
	}

	public String getPric_scor_t2(){
		return this.pric_scor_t2;
	}

	public String getSpcl_scor_t2(){
		return this.spcl_scor_t2;
	}

	public String getAdj_evlu_scor_t2(){
		return this.adj_evlu_scor_t2;
	}

	public String getEmp_no_t3(){
		return this.emp_no_t3;
	}

	public String getPaper_scor_t3(){
		return this.paper_scor_t3;
	}

	public String getPubsh_scor_t3(){
		return this.pubsh_scor_t3;
	}

	public String getPric_scor_t3(){
		return this.pric_scor_t3;
	}

	public String getSpcl_scor_t3(){
		return this.spcl_scor_t3;
	}

	public String getAdj_evlu_scor_t3(){
		return this.adj_evlu_scor_t3;
	}

	public String getEmp_no_t4(){
		return this.emp_no_t4;
	}

	public String getPaper_scor_t4(){
		return this.paper_scor_t4;
	}

	public String getPubsh_scor_t4(){
		return this.pubsh_scor_t4;
	}

	public String getPric_scor_t4(){
		return this.pric_scor_t4;
	}

	public String getSpcl_scor_t4(){
		return this.spcl_scor_t4;
	}

	public String getAdj_evlu_scor_t4(){
		return this.adj_evlu_scor_t4;
	}

	public String getEmp_no_t5(){
		return this.emp_no_t5;
	}

	public String getPaper_scor_t5(){
		return this.paper_scor_t5;
	}

	public String getPubsh_scor_t5(){
		return this.pubsh_scor_t5;
	}

	public String getPric_scor_t5(){
		return this.pric_scor_t5;
	}

	public String getSpcl_scor_t5(){
		return this.spcl_scor_t5;
	}

	public String getAdj_evlu_scor_t5(){
		return this.adj_evlu_scor_t5;
	}

	public String getEmp_no_t6(){
		return this.emp_no_t6;
	}

	public String getPaper_scor_t6(){
		return this.paper_scor_t6;
	}

	public String getPubsh_scor_t6(){
		return this.pubsh_scor_t6;
	}

	public String getPric_scor_t6(){
		return this.pric_scor_t6;
	}

	public String getSpcl_scor_t6(){
		return this.spcl_scor_t6;
	}

	public String getAdj_evlu_scor_t6(){
		return this.adj_evlu_scor_t6;
	}

	public String getEmp_no_t7(){
		return this.emp_no_t7;
	}

	public String getPaper_scor_t7(){
		return this.paper_scor_t7;
	}

	public String getPubsh_scor_t7(){
		return this.pubsh_scor_t7;
	}

	public String getPric_scor_t7(){
		return this.pric_scor_t7;
	}

	public String getSpcl_scor_t7(){
		return this.spcl_scor_t7;
	}

	public String getAdj_evlu_scor_t7(){
		return this.adj_evlu_scor_t7;
	}

	public String getEmp_no_t8(){
		return this.emp_no_t8;
	}

	public String getPaper_scor_t8(){
		return this.paper_scor_t8;
	}

	public String getPubsh_scor_t8(){
		return this.pubsh_scor_t8;
	}

	public String getPric_scor_t8(){
		return this.pric_scor_t8;
	}

	public String getSpcl_scor_t8(){
		return this.spcl_scor_t8;
	}

	public String getAdj_evlu_scor_t8(){
		return this.adj_evlu_scor_t8;
	}

	public String getEmp_no_t9(){
		return this.emp_no_t9;
	}

	public String getPaper_scor_t9(){
		return this.paper_scor_t9;
	}

	public String getPubsh_scor_t9(){
		return this.pubsh_scor_t9;
	}

	public String getPric_scor_t9(){
		return this.pric_scor_t9;
	}

	public String getSpcl_scor_t9(){
		return this.spcl_scor_t9;
	}

	public String getAdj_evlu_scor_t9(){
		return this.adj_evlu_scor_t9;
	}

	public String getEmp_no_t10(){
		return this.emp_no_t10;
	}

	public String getPaper_scor_t10(){
		return this.paper_scor_t10;
	}

	public String getPubsh_scor_t10(){
		return this.pubsh_scor_t10;
	}

	public String getPric_scor_t10(){
		return this.pric_scor_t10;
	}

	public String getSpcl_scor_t10(){
		return this.spcl_scor_t10;
	}

	public String getAdj_evlu_scor_t10(){
		return this.adj_evlu_scor_t10;
	}

	public String getEmp_no_t11(){
		return this.emp_no_t11;
	}

	public String getPaper_scor_t11(){
		return this.paper_scor_t11;
	}

	public String getPubsh_scor_t11(){
		return this.pubsh_scor_t11;
	}

	public String getPric_scor_t11(){
		return this.pric_scor_t11;
	}

	public String getSpcl_scor_t11(){
		return this.spcl_scor_t11;
	}

	public String getAdj_evlu_scor_t11(){
		return this.adj_evlu_scor_t11;
	}

	public String getEmp_no_t12(){
		return this.emp_no_t12;
	}

	public String getPaper_scor_t12(){
		return this.paper_scor_t12;
	}

	public String getPubsh_scor_t12(){
		return this.pubsh_scor_t12;
	}

	public String getPric_scor_t12(){
		return this.pric_scor_t12;
	}

	public String getSpcl_scor_t12(){
		return this.spcl_scor_t12;
	}

	public String getAdj_evlu_scor_t12(){
		return this.adj_evlu_scor_t12;
	}

	public String getEmp_no_t13(){
		return this.emp_no_t13;
	}

	public String getPaper_scor_t13(){
		return this.paper_scor_t13;
	}

	public String getPubsh_scor_t13(){
		return this.pubsh_scor_t13;
	}

	public String getPric_scor_t13(){
		return this.pric_scor_t13;
	}

	public String getSpcl_scor_t13(){
		return this.spcl_scor_t13;
	}

	public String getAdj_evlu_scor_t13(){
		return this.adj_evlu_scor_t13;
	}

	public String getEmp_no_t14(){
		return this.emp_no_t14;
	}

	public String getPaper_scor_t14(){
		return this.paper_scor_t14;
	}

	public String getPubsh_scor_t14(){
		return this.pubsh_scor_t14;
	}

	public String getPric_scor_t14(){
		return this.pric_scor_t14;
	}

	public String getSpcl_scor_t14(){
		return this.spcl_scor_t14;
	}

	public String getAdj_evlu_scor_t14(){
		return this.adj_evlu_scor_t14;
	}

	public String getEmp_no_t15(){
		return this.emp_no_t15;
	}

	public String getPaper_scor_t15(){
		return this.paper_scor_t15;
	}

	public String getPubsh_scor_t15(){
		return this.pubsh_scor_t15;
	}

	public String getPric_scor_t15(){
		return this.pric_scor_t15;
	}

	public String getSpcl_scor_t15(){
		return this.spcl_scor_t15;
	}

	public String getAdj_evlu_scor_t15(){
		return this.adj_evlu_scor_t15;
	}

	public String getEmp_no_t16(){
		return this.emp_no_t16;
	}

	public String getPaper_scor_t16(){
		return this.paper_scor_t16;
	}

	public String getPubsh_scor_t16(){
		return this.pubsh_scor_t16;
	}

	public String getPric_scor_t16(){
		return this.pric_scor_t16;
	}

	public String getSpcl_scor_t16(){
		return this.spcl_scor_t16;
	}

	public String getAdj_evlu_scor_t16(){
		return this.adj_evlu_scor_t16;
	}

	public String getEmp_no_t17(){
		return this.emp_no_t17;
	}

	public String getPaper_scor_t17(){
		return this.paper_scor_t17;
	}

	public String getPubsh_scor_t17(){
		return this.pubsh_scor_t17;
	}

	public String getPric_scor_t17(){
		return this.pric_scor_t17;
	}

	public String getSpcl_scor_t17(){
		return this.spcl_scor_t17;
	}

	public String getAdj_evlu_scor_t17(){
		return this.adj_evlu_scor_t17;
	}

	public String getEmp_no_t18(){
		return this.emp_no_t18;
	}

	public String getPaper_scor_t18(){
		return this.paper_scor_t18;
	}

	public String getPubsh_scor_t18(){
		return this.pubsh_scor_t18;
	}

	public String getPric_scor_t18(){
		return this.pric_scor_t18;
	}

	public String getSpcl_scor_t18(){
		return this.spcl_scor_t18;
	}

	public String getAdj_evlu_scor_t18(){
		return this.adj_evlu_scor_t18;
	}

	public String getEmp_no_t19(){
		return this.emp_no_t19;
	}

	public String getPaper_scor_t19(){
		return this.paper_scor_t19;
	}

	public String getPubsh_scor_t19(){
		return this.pubsh_scor_t19;
	}

	public String getPric_scor_t19(){
		return this.pric_scor_t19;
	}

	public String getSpcl_scor_t19(){
		return this.spcl_scor_t19;
	}

	public String getAdj_evlu_scor_t19(){
		return this.adj_evlu_scor_t19;
	}

	public String getEmp_no_t20(){
		return this.emp_no_t20;
	}

	public String getPaper_scor_t20(){
		return this.paper_scor_t20;
	}

	public String getPubsh_scor_t20(){
		return this.pubsh_scor_t20;
	}

	public String getPric_scor_t20(){
		return this.pric_scor_t20;
	}

	public String getSpcl_scor_t20(){
		return this.spcl_scor_t20;
	}

	public String getAdj_evlu_scor_t20(){
		return this.adj_evlu_scor_t20;
	}

	public String getEmp_no_t21(){
		return this.emp_no_t21;
	}

	public String getPaper_scor_t21(){
		return this.paper_scor_t21;
	}

	public String getPubsh_scor_t21(){
		return this.pubsh_scor_t21;
	}

	public String getPric_scor_t21(){
		return this.pric_scor_t21;
	}

	public String getSpcl_scor_t21(){
		return this.spcl_scor_t21;
	}

	public String getAdj_evlu_scor_t21(){
		return this.adj_evlu_scor_t21;
	}

	public String getEmp_no_t22(){
		return this.emp_no_t22;
	}

	public String getPaper_scor_t22(){
		return this.paper_scor_t22;
	}

	public String getPubsh_scor_t22(){
		return this.pubsh_scor_t22;
	}

	public String getPric_scor_t22(){
		return this.pric_scor_t22;
	}

	public String getSpcl_scor_t22(){
		return this.spcl_scor_t22;
	}

	public String getAdj_evlu_scor_t22(){
		return this.adj_evlu_scor_t22;
	}

	public String getEmp_no_t23(){
		return this.emp_no_t23;
	}

	public String getPaper_scor_t23(){
		return this.paper_scor_t23;
	}

	public String getPubsh_scor_t23(){
		return this.pubsh_scor_t23;
	}

	public String getPric_scor_t23(){
		return this.pric_scor_t23;
	}

	public String getSpcl_scor_t23(){
		return this.spcl_scor_t23;
	}

	public String getAdj_evlu_scor_t23(){
		return this.adj_evlu_scor_t23;
	}

	public String getEmp_no_t24(){
		return this.emp_no_t24;
	}

	public String getPaper_scor_t24(){
		return this.paper_scor_t24;
	}

	public String getPubsh_scor_t24(){
		return this.pubsh_scor_t24;
	}

	public String getPric_scor_t24(){
		return this.pric_scor_t24;
	}

	public String getSpcl_scor_t24(){
		return this.spcl_scor_t24;
	}

	public String getAdj_evlu_scor_t24(){
		return this.adj_evlu_scor_t24;
	}

	public String getEmp_no_t25(){
		return this.emp_no_t25;
	}

	public String getPaper_scor_t25(){
		return this.paper_scor_t25;
	}

	public String getPubsh_scor_t25(){
		return this.pubsh_scor_t25;
	}

	public String getPric_scor_t25(){
		return this.pric_scor_t25;
	}

	public String getSpcl_scor_t25(){
		return this.spcl_scor_t25;
	}

	public String getAdj_evlu_scor_t25(){
		return this.adj_evlu_scor_t25;
	}

	public String getEmp_no_t26(){
		return this.emp_no_t26;
	}

	public String getPaper_scor_t26(){
		return this.paper_scor_t26;
	}

	public String getPubsh_scor_t26(){
		return this.pubsh_scor_t26;
	}

	public String getPric_scor_t26(){
		return this.pric_scor_t26;
	}

	public String getSpcl_scor_t26(){
		return this.spcl_scor_t26;
	}

	public String getAdj_evlu_scor_t26(){
		return this.adj_evlu_scor_t26;
	}

	public String getEmp_no_t27(){
		return this.emp_no_t27;
	}

	public String getPaper_scor_t27(){
		return this.paper_scor_t27;
	}

	public String getPubsh_scor_t27(){
		return this.pubsh_scor_t27;
	}

	public String getPric_scor_t27(){
		return this.pric_scor_t27;
	}

	public String getSpcl_scor_t27(){
		return this.spcl_scor_t27;
	}

	public String getAdj_evlu_scor_t27(){
		return this.adj_evlu_scor_t27;
	}

	public String getEmp_no_t28(){
		return this.emp_no_t28;
	}

	public String getPaper_scor_t28(){
		return this.paper_scor_t28;
	}

	public String getPubsh_scor_t28(){
		return this.pubsh_scor_t28;
	}

	public String getPric_scor_t28(){
		return this.pric_scor_t28;
	}

	public String getSpcl_scor_t28(){
		return this.spcl_scor_t28;
	}

	public String getAdj_evlu_scor_t28(){
		return this.adj_evlu_scor_t28;
	}
}

/* 작성시간 : Wed Mar 17 16:26:16 KST 2010 */