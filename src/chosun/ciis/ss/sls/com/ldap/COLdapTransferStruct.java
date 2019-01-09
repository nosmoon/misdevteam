/***************************************************************
* 파일명		: COLdapTransferStruct.java
* 기능			:
* 작성일자		: 2005.03.08
* 작성자		: 조은영
***************************************************************/

package chosun.ciis.ss.sls.com.ldap;

import java.util.*;

public class COLdapTransferStruct {

	public String csprn	 		= null;		// 주민번호(xxxxxxyyyyyyy 형식)
	public String sn			= null; 	// *성명
	public String givenname			= null; 	// *성명
	public String cn			= null; 	// *성명
	public String cshanjanm			= null;		// 성명(한자, 공백없이)
	public String csenglnm			= null;		// 성명(영문, 공백적용)
	public String uid			= null; 	// 아이디
	public String employeenumber 		= null;		// 사번
	public String userPassword		= null; 	// *암호(SHA)
	public String departmentnumber		= null;		// 현재근무부서코드
	public String ou			= null;		// 현재 근무 부서명
	public String employeetype 		= null;		// 사원구분코드
	public String cscmpycd			= null; 	// 회사코드
	public String o				= null; 	// 회사명
	public String csjikryl			= null; 	// 현직렬
	public String csjikgun			= null; 	// 현직군
	public String csjikmu			= null; 	// 현직무
	public String csoctgr			= null; 	// 현직종
	public String csposicd1			= null;		// 직책코드1
	public String csposinm1			= null;		// 직책명1
	public String csposicd2			= null;		// 직책코드2
	public String csposinm2			= null;		// 직책명2
	public String csdutycd			= null;		// 근무지코드
	public String csdutynm			= null;		// 근무지명
	public String csincmpydt		= null;		// 입사일자(yyyymmdd 형식)
	public String csdealbankcd		= null;		// 거래은행코드
	public String csdealbanknm		= null;		// 거래은행명
	public String csacctno			= null;		// 계좌번호(000-0000-0000-0000 형식)
	public String mobile			= null;		// 휴대폰(011-2222-3333  형식)
	public String mail			= null; 	// 이메일주소
	public String cshomeaddr		= null;		// 주소
	public String cshomeaddr2		= null;		// 상세주소
	public String homephone			= null;		// 연락가능 전화번호(111-2222-3333  형식)
	public Vector csmangareacd		= new Vector();		// 관리지역코드 (multi-value)
	public Vector csmangareanm		= new Vector();		// 관리지역명 (multi-value)
	public String csselldeptcd		= null;		// 판매부서코드
	public String csselldeptnm		= null;		// 판매부서명
	public String csbocd			= null;		// 지국코드
	public String csbonm			= null;		// 지국명
	public String csareacd			= null;		// 지역코드
	public String csareanm			= null;		// 지역명
	public String cshrdeptcd		= null;		// 인사부서코드
	public String cshrdeptnm		= null;		// 인사부서명
	public String csboclsfcd		= null;		// 지국구분코드
	public String csboclsfnm		= null;		// 지국구분명
	public String csbillgroupid		= null;		// 빌링그룹ID
	public String csbillgrouptype		= null;		// 빌링그룹유형
	public String csbillincode		= null;		// 빌링소속코드
	public Vector csjobcd			= new Vector();		// 업무코드 (multi-value)
	public Vector csjobnm			= new Vector();		// 업무코드/명 (multi-value, 업무코드|명 표시  예) 000|마일리지정산담당 형식)
	public String csmanageryn		= null;		// 부서장여부
	public String csusertype		= null;		//사용자유형
	public String description		= null;		//사용자유형
	public String csofficd			= null;		// 국코드
	public String csoffinm			= null;		// 국명
	public String csbokscd			= null;		// 부코드
	public String csboksnm			= null;		// 부명
	public Vector csdealdeptcd		= new Vector();		// 관리부서코드 (multi-value)
	public Vector csdealdeptnm		= new Vector();		// 관리부서명 (multi-value, 관리부서코드|관리부서명 표시  예) 3105|지판2부 형식)
	public String cshomezipcode		= null;		// 자택 우편번호(111-222 형식)
	public String csoutcmpydt		= null;		// 퇴사일자(yyyymmdd 형식)
	public String csacctnm			= null;		// 예금주
	public String cslastinfologin		= null;		// 최종접속일
	public String csempcmpycd		= null;		// 근무지회사코드
	public String csempcmpynm		= null;		// 근무지회사명
	public String csbrchofficd		= null;		// 지사코드
	public String csbrchoffinm		= null;		// 지사명
	public String carlicense		= null;		// 최초로그인 전 또는 pwd 리셋 후 (16777216 : 로그인하지 않았슴)
}
