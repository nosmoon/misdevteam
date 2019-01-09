/***************************************************************************************************
* 파일명 : SL_S_INFOEXGPREV_DTLRecord.java_모바일용 / agency/commun_111120 참조
* 기능 : 공지사항 상세를 위한 DM
* 작성일자 : 2017-01-24
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * 통신실-공지사항 상세
 *
 */

public class SL_S_INFOEXGPREV_DTLRecord extends java.lang.Object implements
		java.io.Serializable {

	public int seq;
	public String titl;
	public int brwscnt;

	public SL_S_INFOEXGPREV_DTLRecord() {
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public void setTitl(String titl) {
		this.titl = titl;
	}

	public void setBrwscnt(int brwscnt) {
		this.brwscnt = brwscnt;
	}

	public int getSeq() {
		return this.seq;
	}

	public String getTitl() {
		return this.titl;
	}

	public int getBrwscnt() {
		return this.brwscnt;
	}
}

/* 작성시간 : Thu Feb 19 15:59:09 KST 2004 */