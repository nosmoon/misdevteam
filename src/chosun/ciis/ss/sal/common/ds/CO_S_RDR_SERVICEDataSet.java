/***************************************************************************************************
 * 파일명 : CO_S_RDR_SERVICE.java
 * 기능 : 통합회원 서비스 조회
 * 작성일자 : 2006-08-18
 * 작성자 : 노상현
 ***************************************************************************************************/

package chosun.ciis.ss.sal.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.rec.*;

/**
 * 공통 - 통합 회원 서비스 조회
 */

public class CO_S_RDR_SERVICEDataSet extends somo.framework.db.BaseDataSet
		implements java.io.Serializable {
	public String errcode;
	public String errmsg;
	public String morningplus;
	public String cashrcpt;
	public String sktsrv;
	public String resv1;
	public String resv2;
	public String resv3;
	public String resv4;
	public String resv5;
	public String resv6;
	public String resv7;

	public CO_S_RDR_SERVICEDataSet() {
	}

	public CO_S_RDR_SERVICEDataSet(String errcode, String errmsg,
			String morningplus, String cashrcpt, String sktsrv, String resv1,
			String resv2, String resv3, String resv4, String resv5,
			String resv6, String resv7) {
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.morningplus = morningplus;
		this.cashrcpt = cashrcpt;
		this.sktsrv = sktsrv;
		this.resv1 = resv1;
		this.resv2 = resv2;
		this.resv3 = resv3;
		this.resv4 = resv4;
		this.resv5 = resv5;
		this.resv6 = resv6;
		this.resv7 = resv7;
	}

	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	public void setMorningplus(String morningplus) {
		this.morningplus = morningplus;
	}

	public void setCashrcpt(String cashrcpt) {
		this.cashrcpt = cashrcpt;
	}

	public void setSktsrv(String sktsrv) {
		this.sktsrv = sktsrv;
	}

	public void setResv1(String resv1) {
		this.resv1 = resv1;
	}

	public void setResv2(String resv2) {
		this.resv2 = resv2;
	}

	public void setResv3(String resv3) {
		this.resv3 = resv3;
	}

	public void setResv4(String resv4) {
		this.resv4 = resv4;
	}

	public void setResv5(String resv5) {
		this.resv5 = resv5;
	}

	public void setResv6(String resv6) {
		this.resv6 = resv6;
	}

	public void setResv7(String resv7) {
		this.resv7 = resv7;
	}

	public String getErrcode() {
		return this.errcode;
	}

	public String getErrmsg() {
		return this.errmsg;
	}

	public String getMorningplus() {
		return this.morningplus;
	}

	public String getCashrcpt() {
		return this.cashrcpt;
	}

	public String getSktsrv() {
		return this.sktsrv;
	}

	public String getResv1() {
		return this.resv1;
	}

	public String getResv2() {
		return this.resv2;
	}

	public String getResv3() {
		return this.resv3;
	}

	public String getResv4() {
		return this.resv4;
	}

	public String getResv5() {
		return this.resv5;
	}

	public String getResv6() {
		return this.resv6;
	}

	public String getResv7() {
		return this.resv7;
	}

	public void getValues(CallableStatement cstmt) throws SQLException {
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if (!"".equals(this.errcode)) {
			return;
		}
		this.morningplus = Util.checkString(cstmt.getString(5));
		this.cashrcpt = Util.checkString(cstmt.getString(6));
		this.sktsrv = Util.checkString(cstmt.getString(7));
		this.resv1 = Util.checkString(cstmt.getString(8));
		this.resv2 = Util.checkString(cstmt.getString(9));
		this.resv3 = Util.checkString(cstmt.getString(10));
		this.resv4 = Util.checkString(cstmt.getString(11));
		this.resv5 = Util.checkString(cstmt.getString(12));
		this.resv6 = Util.checkString(cstmt.getString(13));
		this.resv7 = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_S_RDR_SERVICEDataSet ds = (CO_S_RDR_SERVICEDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
 Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

 <%= ds.getErrcode()%>
 <%= ds.getErrmsg()%>
 <%= ds.getMorningplus()%>
 <%= ds.getCashrcpt()%>
 <%= ds.getSktsrv()%>
 <%= ds.getResv1()%>
 <%= ds.getResv2()%>
 <%= ds.getResv3()%>
 <%= ds.getResv4()%>
 <%= ds.getResv5()%>
 <%= ds.getResv6()%>
 <%= ds.getResv7()%>
 ----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
 Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

 ----------------------------------------------------------------------------------------------------*/

/* 작성시간 : Fri Aug 18 17:10:48 KST 2006 */