package org.wecancodeit.fleettracker.controllertest;

import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collections;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.wecancodeit.fleettracker.models.Truck;

@RunWith(SpringRunner.class)
@WebMvcTest(ApiController.class)
public class ApiControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private ApiController apiController;

	@Test
	public void shouldGetTruck() throws Exception {
		Truck truck = new Truck();
		Set<Truck> trucks = Collections.singleton(truck);

		given(apiController.getTruck()).willReturn(trucks);
		mvc.perform(get("/api/trucks").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$[0].plateNumber", is(truck.getPlateNumber())));
	}

}
