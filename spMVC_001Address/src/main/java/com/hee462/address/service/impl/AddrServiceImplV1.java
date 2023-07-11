package com.hee462.address.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hee462.address.dao.AddrDao;
import com.hee462.address.dao.BuyerDao;
import com.hee462.address.dao.HobbyDao;
import com.hee462.address.dao.ScoreDao;
import com.hee462.address.models.AddrDto;
import com.hee462.address.models.HobbyByAidVO;
import com.hee462.address.service.AddrService;
@Service
public class AddrServiceImplV1 implements AddrService {
	/*
	 * 의존성 주입(Dependency Inject : DI)
	 * 객체를 선언하고, 클래스의 생성자를 통해 객체를 초기화 하는 
	 * java의 전통적인 객체 생성 코드와 대비 되는 Spring Framework Project의 독특한 기법
	 * 객체를 선언만 하고, 의존성 주입 절차를 수행하면
	 * Spring Container에 의해 이미 생성되어 준비된 객체를 주입해주는 기능
	 * 
	 * 의존성 주입하는 방법은 필드주입 , 생성자주입, Setter 주입이 있다
	 */	
	
	// 필드 의존성 주입 (Field Dependency Inject)
	/*
	 * 필드(클래스영역)에 객체를 선언하고 @Autowired를 부착하는 방법
	 * Spring Project의 전통적인 코딩에서 가장 많이 사용하던 방법
	 * 이 방법이 메모리관리 측면에서 문제가 있다는 보고가 있으면서
	 * 사용이 점차 줄어들고 있음
	 * 
	 * 이 방법은 메모리 누수를 줄이기 위하여 객체를 private으로 선언할 것을 권장하는 방법이다
	 * 객체를 private으로 선언하면 상속(extends)을 했을때
	 * 다시 객체를 선언해야 하는 문제가 발생한다
	 * 참고로
	 * 메모리 누수 정도 public > protected > private 순으로 작아진다
	 */
	@Autowired
	protected BuyerDao buyerDao;
	
	// 생성자 의존성 주입(Constructor DI)
	/*
	 * 생성자를 통해서 주입된 객체는 final로 선언을 한다
	 * 이 방식의 특징은 한번 주입이 되면, 코드가 작동되는 중에
	 * 또 다시 주입을 할 수 없다. 즉 객체보호가 완전하다
	 * 객체의 순환 참조가 없다
	 * 이 방식은 메모리 누수가 없고, 객체가 보호되며 순환참조에의한 
	 * 코도의 exception을 막는다
	 * !Autowired를 붙히지 않아도 된다
	 * 
	 * 이 방식을 사용하려면 반드시 생성자 메서드가 있어야 한다
	 * 코드가 다소 번잡해 진다
	 * 실수로 생서자 메서드를 만들지 않았을 경우 NullPoint exception이 발생한다
	 */
	protected  final AddrDao addrDao;
	protected final HobbyDao hobbyDao;
	
	
	// setter 의존성 주입(Setter DI)
	/*
	 * 객체를 필드영역에 선언만 하고 별도의 메서드를 통하여 주입을 하는 방법
	 * 
	 * 누군가 실수로 ,임의로 객체를 변경 할 수 있다
	 * method가 public으로 완전 개방된 상태이기 때문에
	 */
	@Autowired
	protected ScoreDao scoreDao;
	public AddrServiceImplV1(AddrDao addrDao, HobbyDao hobbyDao) {
		super();
		this.addrDao = addrDao;
		this.hobbyDao = hobbyDao;
	}

	public void setScoreDao(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
	
	
	@Override
	public List<AddrDto> selectAll() {
		// TODO Auto-generated method stub
		return addrDao.selectAll();
	}

	@Override
	public AddrDto findById(String id) {
		// id에 해당하는 주소조회
		AddrDto addrDto = addrDao.findById(id);
		// id에 해당하는 취미 리스트 조회
		List<HobbyByAidVO> hobbyList = hobbyDao.findHobbyByAID(id);
		//주소 객체에 취미 리스트 포함
		addrDto.setHobbyList(hobbyList);
		// 주소 객체 return
		return addrDto;
	}

	@Override
	public String idCheck(String id) {
		
		AddrDto dto = addrDao.findById(id);
		if(dto == null)return "OK";
		else return "FAIL";
	}

	@Override
	public List<AddrDto> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AddrDto> findByTel(String tel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(AddrDto addrdto) {
		int result = addrDao.insert(addrdto);
		
		return result;
	}

	@Override
	public int update(AddrDto addrdto) {
	int result = addrDao.update(addrdto);
	
		return result;
	}

	@Override
	public int delete(String id) {
		int result = addrDao.delete(id);
		return result;
	}

}
