package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.SetType;

import java.util.GregorianCalendar;
import mage.constants.Rarity;
import java.util.List;
import mage.ObjectColor;
import mage.cards.CardGraphicInfo;
import mage.cards.FrameStyle;

public class PrereleaseEvents extends ExpansionSet {
    private static final PrereleaseEvents fINSTANCE = new PrereleaseEvents();

    public static PrereleaseEvents getInstance() {
        return fINSTANCE;
    }

    private PrereleaseEvents() {
        super("Prerelease Events", "PTC", "mage.sets.prereleaseevents", ExpansionSet.buildDate(1990, 1, 1), SetType.PROMOTIONAL);
        this.hasBoosters = false;
        this.hasBasicLands = false;
        cards.add(new SetCardInfo("Abbot of Keral Keep", 198, Rarity.RARE, mage.cards.a.AbbotOfKeralKeep.class));
        cards.add(new SetCardInfo("Abhorrent Overlord", 70, Rarity.SPECIAL, mage.cards.a.AbhorrentOverlord.class));
        cards.add(new SetCardInfo("Abzan Ascendancy", 88, Rarity.SPECIAL, mage.cards.a.AbzanAscendancy.class));
        cards.add(new SetCardInfo("Ajani Vengeant", 38, Rarity.SPECIAL, mage.cards.a.AjaniVengeant.class));
        cards.add(new SetCardInfo("Akoum Firebird", 238, Rarity.MYTHIC, mage.cards.a.AkoumFirebird.class));
        cards.add(new SetCardInfo("Akoum Hellkite", 239, Rarity.RARE, mage.cards.a.AkoumHellkite.class));
        cards.add(new SetCardInfo("Alesha, Who Smiles at Death", 128, Rarity.RARE, mage.cards.a.AleshaWhoSmilesAtDeath.class));
        cards.add(new SetCardInfo("Alhammarret, High Arbiter", 199, Rarity.RARE, mage.cards.a.AlhammarretHighArbiter.class));
        cards.add(new SetCardInfo("Aligned Hedron Network", 240, Rarity.RARE, mage.cards.a.AlignedHedronNetwork.class));
        cards.add(new SetCardInfo("Allosaurus Rider", 30, Rarity.SPECIAL, mage.cards.a.AllosaurusRider.class));
        cards.add(new SetCardInfo("Ally Encampment", 241, Rarity.RARE, mage.cards.a.AllyEncampment.class));
        cards.add(new SetCardInfo("Anafenza, Kin-Tree Spirit", 158, Rarity.RARE, mage.cards.a.AnafenzaKinTreeSpirit.class));
        cards.add(new SetCardInfo("Anafenza, the Foremost", 89, Rarity.SPECIAL, mage.cards.a.AnafenzaTheForemost.class));
        cards.add(new SetCardInfo("Angelic Captain", 242, Rarity.RARE, mage.cards.a.AngelicCaptain.class));
        cards.add(new SetCardInfo("Ankle Shanker", 90, Rarity.SPECIAL, mage.cards.a.AnkleShanker.class));
        cards.add(new SetCardInfo("Anthousa, Setessan Hero", 72, Rarity.SPECIAL, mage.cards.a.AnthousaSetessanHero.class));
        cards.add(new SetCardInfo("Arashin Foremost", 159, Rarity.RARE, mage.cards.a.ArashinForemost.class));
        cards.add(new SetCardInfo("Arashin Sovereign", 160, Rarity.RARE, mage.cards.a.ArashinSovereign.class));
        cards.add(new SetCardInfo("Arbiter of the Ideal", 74, Rarity.SPECIAL, mage.cards.a.ArbiterOfTheIdeal.class));
        cards.add(new SetCardInfo("Arcbond", 129, Rarity.RARE, mage.cards.a.Arcbond.class));
        cards.add(new SetCardInfo("Archdemon of Greed", "52b", Rarity.SPECIAL, mage.cards.a.ArchdemonOfGreed.class));
        cards.add(new SetCardInfo("Archfiend of Depravity", 130, Rarity.RARE, mage.cards.a.ArchfiendOfDepravity.class));
        cards.add(new SetCardInfo("Archon of the Triumvirate", 55, Rarity.SPECIAL, mage.cards.a.ArchonOfTheTriumvirate.class));
        cards.add(new SetCardInfo("Atarka's Command", 161, Rarity.RARE, mage.cards.a.AtarkasCommand.class));
        cards.add(new SetCardInfo("Atarka, World Render", 131, Rarity.RARE, mage.cards.a.AtarkaWorldRender.class));
        cards.add(new SetCardInfo("Avalanche Tusker", 91, Rarity.SPECIAL, mage.cards.a.AvalancheTusker.class));
        cards.add(new SetCardInfo("Avatar of Discord", 29, Rarity.SPECIAL, mage.cards.a.AvatarOfDiscord.class));
        cards.add(new SetCardInfo("Avatar of Hope", 11, Rarity.SPECIAL, mage.cards.a.AvatarOfHope.class));
        cards.add(new SetCardInfo("Avatar of the Resolute", 162, Rarity.RARE, mage.cards.a.AvatarOfTheResolute.class));
        cards.add(new SetCardInfo("Barrage Tyrant", 243, Rarity.RARE, mage.cards.b.BarrageTyrant.class));
        cards.add(new SetCardInfo("Beastcaller Savant", 244, Rarity.RARE, mage.cards.b.BeastcallerSavant.class));
        cards.add(new SetCardInfo("Beast of Burden", 5, Rarity.SPECIAL, mage.cards.b.BeastOfBurden.class));
        cards.add(new SetCardInfo("Blessed Reincarnation", 163, Rarity.RARE, mage.cards.b.BlessedReincarnation.class));
        cards.add(new SetCardInfo("Blight Herder", 245, Rarity.RARE, mage.cards.b.BlightHerder.class));
        cards.add(new SetCardInfo("Blood-Chin Fanatic", 164, Rarity.RARE, mage.cards.b.BloodChinFanatic.class));
        cards.add(new SetCardInfo("Bloodlord of Vaasgoth", 50, Rarity.SPECIAL, mage.cards.b.BloodlordOfVaasgoth.class));
        cards.add(new SetCardInfo("Bloodsoaked Champion", 92, Rarity.SPECIAL, mage.cards.b.BloodsoakedChampion.class));
        cards.add(new SetCardInfo("Boltwing Marauder", 165, Rarity.RARE, mage.cards.b.BoltwingMarauder.class));
        cards.add(new SetCardInfo("Bring to Light", 246, Rarity.RARE, mage.cards.b.BringToLight.class));
        cards.add(new SetCardInfo("Brood Butcher", 247, Rarity.RARE, mage.cards.b.BroodButcher.class));
        cards.add(new SetCardInfo("Brutal Expulsion", 248, Rarity.RARE, mage.cards.b.BrutalExpulsion.class));
        cards.add(new SetCardInfo("Brutal Hordechief", 132, Rarity.MYTHIC, mage.cards.b.BrutalHordechief.class));
        cards.add(new SetCardInfo("Butcher of the Horde", 93, Rarity.SPECIAL, mage.cards.b.ButcherOfTheHorde.class));
        cards.add(new SetCardInfo("Canopy Vista", 249, Rarity.RARE, mage.cards.c.CanopyVista.class));
        cards.add(new SetCardInfo("Carnival Hellsteed", 57, Rarity.SPECIAL, mage.cards.c.CarnivalHellsteed.class));
        cards.add(new SetCardInfo("Celestial Archon", 68, Rarity.SPECIAL, mage.cards.c.CelestialArchon.class));
        cards.add(new SetCardInfo("Chandra, Fire of Kaladesh", 201, Rarity.MYTHIC, mage.cards.c.ChandraFireOfKaladesh.class));
        cards.add(new SetCardInfo("Chandra, Roaring Flame", 201, Rarity.MYTHIC, mage.cards.c.ChandraRoaringFlame.class));
        cards.add(new SetCardInfo("Chandra's Ignition", 200, Rarity.RARE, mage.cards.c.ChandrasIgnition.class));
        cards.add(new SetCardInfo("Cinder Glade", 250, Rarity.RARE, mage.cards.c.CinderGlade.class));
        cards.add(new SetCardInfo("Comet Storm", 43, Rarity.SPECIAL, mage.cards.c.CometStorm.class));
        cards.add(new SetCardInfo("Conduit of Ruin", 251, Rarity.RARE, mage.cards.c.ConduitOfRuin.class));
        cards.add(new SetCardInfo("Consuming Aberration", 60, Rarity.SPECIAL, mage.cards.c.ConsumingAberration.class));
        cards.add(new SetCardInfo("Corpsejack Menace", 58, Rarity.SPECIAL, mage.cards.c.CorpsejackMenace.class));
        cards.add(new SetCardInfo("Crackling Doom", 94, Rarity.SPECIAL, mage.cards.c.CracklingDoom.class));
        cards.add(new SetCardInfo("Crater Elemental", 166, Rarity.RARE, mage.cards.c.CraterElemental.class));
        cards.add(new SetCardInfo("Crater's Claws", 95, Rarity.SPECIAL, mage.cards.c.CratersClaws.class));
        cards.add(new SetCardInfo("Daghatar the Adamant", 133, Rarity.RARE, mage.cards.d.DaghatarTheAdamant.class));
        cards.add(new SetCardInfo("Damnable Pact", 167, Rarity.RARE, mage.cards.d.DamnablePact.class));
        cards.add(new SetCardInfo("Dark Petition", 202, Rarity.RARE, mage.cards.d.DarkPetition.class));
        cards.add(new SetCardInfo("Dawnbringer Charioteers", 78, Rarity.SPECIAL, mage.cards.d.DawnbringerCharioteers.class));
        cards.add(new SetCardInfo("Deathbringer Regent", 168, Rarity.RARE, mage.cards.d.DeathbringerRegent.class));
        cards.add(new SetCardInfo("Defiant Bloodlord", 252, Rarity.RARE, mage.cards.d.DefiantBloodlord.class));
        cards.add(new SetCardInfo("Deflecting Palm", 96, Rarity.SPECIAL, mage.cards.d.DeflectingPalm.class));
        cards.add(new SetCardInfo("Demigod of Revenge", 36, Rarity.SPECIAL, mage.cards.d.DemigodOfRevenge.class));
        cards.add(new SetCardInfo("Den Protector", 169, Rarity.RARE, mage.cards.d.DenProtector.class));
        cards.add(new SetCardInfo("Desolation Twin", 253, Rarity.RARE, mage.cards.d.DesolationTwin.class));
        cards.add(new SetCardInfo("Despoiler of Souls", 203, Rarity.RARE, mage.cards.d.DespoilerOfSouls.class));
        cards.add(new SetCardInfo("Dig Through Time", 97, Rarity.SPECIAL, mage.cards.d.DigThroughTime.class));
        cards.add(new SetCardInfo("Dirtcowl Wurm", 1, Rarity.SPECIAL, mage.cards.d.DirtcowlWurm.class));
        cards.add(new SetCardInfo("Djinn Illuminatus", 28, Rarity.SPECIAL, mage.cards.d.DjinnIlluminatus.class));
        cards.add(new SetCardInfo("Doomwake Giant", 80, Rarity.SPECIAL, mage.cards.d.DoomwakeGiant.class));
        cards.add(new SetCardInfo("Door of Destinies", 35, Rarity.SPECIAL, mage.cards.d.DoorOfDestinies.class));
        cards.add(new SetCardInfo("Dragon Broodmother", 40, Rarity.SPECIAL, mage.cards.d.DragonBroodmother.class));
        cards.add(new SetCardInfo("Dragonlord Atarka", 170, Rarity.MYTHIC, mage.cards.d.DragonlordAtarka.class));
        cards.add(new SetCardInfo("Dragonlord Dromoka", 171, Rarity.MYTHIC, mage.cards.d.DragonlordDromoka.class));
        cards.add(new SetCardInfo("Dragonlord Kolaghan", 172, Rarity.MYTHIC, mage.cards.d.DragonlordKolaghan.class));
        cards.add(new SetCardInfo("Dragonlord Ojutai", 173, Rarity.MYTHIC, mage.cards.d.DragonlordOjutai.class));
        cards.add(new SetCardInfo("Dragonlord Silumgar", 174, Rarity.MYTHIC, mage.cards.d.DragonlordSilumgar.class));
        cards.add(new SetCardInfo("Dragonmaster Outcast", 254, Rarity.MYTHIC, mage.cards.d.DragonmasterOutcast.class));
        cards.add(new SetCardInfo("Dragonscale General", 134, Rarity.RARE, mage.cards.d.DragonscaleGeneral.class));
        cards.add(new SetCardInfo("Dragon-Style Twins", 98, Rarity.SPECIAL, mage.cards.d.DragonStyleTwins.class));
        cards.add(new SetCardInfo("Drana, Liberator of Malakir", 255, Rarity.MYTHIC, mage.cards.d.DranaLiberatorOfMalakir.class));
        cards.add(new SetCardInfo("Dromoka's Command", 175, Rarity.RARE, mage.cards.d.DromokasCommand.class));
        cards.add(new SetCardInfo("Dromoka, the Eternal", 135, Rarity.RARE, mage.cards.d.DromokaTheEternal.class));
        cards.add(new SetCardInfo("Drowner of Hope", 256, Rarity.RARE, mage.cards.d.DrownerOfHope.class));
        cards.add(new SetCardInfo("Duneblast", 99, Rarity.SPECIAL, mage.cards.d.Duneblast.class));
        cards.add(new SetCardInfo("Dust Stalker", 257, Rarity.RARE, mage.cards.d.DustStalker.class));
        cards.add(new SetCardInfo("Dwynen, Gilt-Leaf Daen", 204, Rarity.RARE, mage.cards.d.DwynenGiltLeafDaen.class));
        cards.add(new SetCardInfo("Eater of Hope", 75, Rarity.SPECIAL, mage.cards.e.EaterOfHope.class));
        cards.add(new SetCardInfo("Embermaw Hellion", 205, Rarity.RARE, mage.cards.e.EmbermawHellion.class));
        cards.add(new SetCardInfo("Ember Swallower", 71, Rarity.SPECIAL, mage.cards.e.EmberSwallower.class));
        cards.add(new SetCardInfo("Emeria Shepherd", 258, Rarity.RARE, mage.cards.e.EmeriaShepherd.class));
        cards.add(new SetCardInfo("Emrakul, the Aeons Torn", 44, Rarity.SPECIAL, mage.cards.e.EmrakulTheAeonsTorn.class));
        cards.add(new SetCardInfo("Endless One", 259, Rarity.RARE, mage.cards.e.EndlessOne.class));
        cards.add(new SetCardInfo("Evolutionary Leap", 206, Rarity.RARE, mage.cards.e.EvolutionaryLeap.class));
        cards.add(new SetCardInfo("Exert Influence", 260, Rarity.RARE, mage.cards.e.ExertInfluence.class));
        cards.add(new SetCardInfo("Exquisite Firecraft", 207, Rarity.RARE, mage.cards.e.ExquisiteFirecraft.class));
        cards.add(new SetCardInfo("False Prophet", 7, Rarity.SPECIAL, mage.cards.f.FalseProphet.class));
        cards.add(new SetCardInfo("Fathom Feeder", 261, Rarity.RARE, mage.cards.f.FathomFeeder.class));
        cards.add(new SetCardInfo("Fathom Mage", 61, Rarity.SPECIAL, mage.cards.f.FathomMage.class));
        cards.add(new SetCardInfo("Felidar Sovereign", 262, Rarity.RARE, mage.cards.f.FelidarSovereign.class));
        cards.add(new SetCardInfo("Feral Throwback", 19, Rarity.SPECIAL, mage.cards.f.FeralThrowback.class));
        cards.add(new SetCardInfo("Flamerush Rider", 136, Rarity.RARE, mage.cards.f.FlamerushRider.class));
        cards.add(new SetCardInfo("Flamewake Phoenix", 137, Rarity.RARE, mage.cards.f.FlamewakePhoenix.class));
        cards.add(new SetCardInfo("Flying Crane Technique", 100, Rarity.SPECIAL, mage.cards.f.FlyingCraneTechnique.class));
        cards.add(new SetCardInfo("Foe-Razer Regent", 176, Rarity.RARE, mage.cards.f.FoeRazerRegent.class));
        cards.add(new SetCardInfo("Forgestoker Dragon", 76, Rarity.SPECIAL, mage.cards.f.ForgestokerDragon.class));
        cards.add(new SetCardInfo("Foundry Champion", 62, Rarity.SPECIAL, mage.cards.f.FoundryChampion.class));
        cards.add(new SetCardInfo("From Beyond", 263, Rarity.RARE, mage.cards.f.FromBeyond.class));
        cards.add(new SetCardInfo("Fungal Shambler", 14, Rarity.SPECIAL, mage.cards.f.FungalShambler.class));
        cards.add(new SetCardInfo("Gaea's Revenge", 208, Rarity.RARE, mage.cards.g.GaeasRevenge.class));
        cards.add(new SetCardInfo("Gideon, Battle-Forged", 220, Rarity.MYTHIC, mage.cards.g.GideonBattleForged.class));
        cards.add(new SetCardInfo("Gideon, Ally of Zendikar", 264, Rarity.MYTHIC, mage.cards.g.GideonAllyOfZendikar.class));
        cards.add(new SetCardInfo("Gideon's Phalanx", 209, Rarity.RARE, mage.cards.g.GideonsPhalanx.class));
        cards.add(new SetCardInfo("Gilt-Leaf Winnower", 210, Rarity.RARE, mage.cards.g.GiltLeafWinnower.class));
        cards.add(new SetCardInfo("Gleancrawler", 27, Rarity.SPECIAL, mage.cards.g.Gleancrawler.class));
        cards.add(new SetCardInfo("Glissa, the Traitor", 48, Rarity.SPECIAL, mage.cards.g.GlissaTheTraitor.class));
        cards.add(new SetCardInfo("Glory", 17, Rarity.SPECIAL, mage.cards.g.Glory.class));
        cards.add(new SetCardInfo("Goblin Piledriver", 211, Rarity.RARE, mage.cards.g.GoblinPiledriver.class));
        cards.add(new SetCardInfo("Graveblade Marauder", 212, Rarity.RARE, mage.cards.g.GravebladeMarauder.class));
        cards.add(new SetCardInfo("Greenwarden of Murasa", 265, Rarity.MYTHIC, mage.cards.g.GreenwardenOfMurasa.class));
        cards.add(new SetCardInfo("Grim Haruspex", 101, Rarity.SPECIAL, mage.cards.g.GrimHaruspex.class));
        cards.add(new SetCardInfo("Grove of the Guardian", 59, Rarity.SPECIAL, mage.cards.g.GroveOfTheGuardian.class));
        cards.add(new SetCardInfo("Gruesome Slaughter", 266, Rarity.RARE, mage.cards.g.GruesomeSlaughter.class));
        cards.add(new SetCardInfo("Guardian of Tazeem", 267, Rarity.RARE, mage.cards.g.GuardianOfTazeem.class));
        cards.add(new SetCardInfo("Guul Draz Overseer", 268, Rarity.RARE, mage.cards.g.GuulDrazOverseer.class));
        cards.add(new SetCardInfo("Harbinger of the Hunt", 177, Rarity.RARE, mage.cards.h.HarbingerOfTheHunt.class));
        cards.add(new SetCardInfo("Harbinger of the Tides", 213, Rarity.RARE, mage.cards.h.HarbingerOfTheTides.class));
        cards.add(new SetCardInfo("Hardened Scales", 102, Rarity.SPECIAL, mage.cards.h.HardenedScales.class));
        cards.add(new SetCardInfo("Helm of Kaldra", 23, Rarity.SPECIAL, mage.cards.h.HelmOfKaldra.class));
        cards.add(new SetCardInfo("Herald of Anafenza", 103, Rarity.SPECIAL, mage.cards.h.HeraldOfAnafenza.class));
        cards.add(new SetCardInfo("Heroes' Bane", 82, Rarity.SPECIAL, mage.cards.h.HeroesBane.class));
        cards.add(new SetCardInfo("Hero of Bladehold", 47, Rarity.SPECIAL, mage.cards.h.HeroOfBladehold.class));
        cards.add(new SetCardInfo("Hero of Goma Fada", 269, Rarity.RARE, mage.cards.h.HeroOfGomaFada.class));
        cards.add(new SetCardInfo("Hidden Dragonslayer", 178, Rarity.RARE, mage.cards.h.HiddenDragonslayer.class));
        cards.add(new SetCardInfo("High Sentinels of Arashin", 104, Rarity.SPECIAL, mage.cards.h.HighSentinelsOfArashin.class));
        cards.add(new SetCardInfo("Hixus, Prison Warden", 214, Rarity.RARE, mage.cards.h.HixusPrisonWarden.class));
        cards.add(new SetCardInfo("Honored Hierarch", 215, Rarity.RARE, mage.cards.h.HonoredHierarch.class));
        cards.add(new SetCardInfo("Howlpack Alpha", 51, Rarity.SPECIAL, mage.cards.h.HowlpackAlpha.class));
        cards.add(new SetCardInfo("Hypersonic Dragon", 56, Rarity.SPECIAL, mage.cards.h.HypersonicDragon.class));
        cards.add(new SetCardInfo("Icefall Regent", 179, Rarity.RARE, mage.cards.i.IcefallRegent.class));
        cards.add(new SetCardInfo("Icy Blast", 105, Rarity.SPECIAL, mage.cards.i.IcyBlast.class));
        cards.add(new SetCardInfo("Indulgent Tormentor", 85, Rarity.SPECIAL, mage.cards.i.IndulgentTormentor.class));
        cards.add(new SetCardInfo("Ink-Eyes, Servant of Oni", 25, Rarity.SPECIAL, mage.cards.i.InkEyesServantOfOni.class));
        cards.add(new SetCardInfo("Ire Shaman", 180, Rarity.RARE, mage.cards.i.IreShaman.class));
        cards.add(new SetCardInfo("Ivorytusk Fortress", 106, Rarity.SPECIAL, mage.cards.i.IvorytuskFortress.class));
        cards.add(new SetCardInfo("Jace, Telepath Unbound", 216, Rarity.MYTHIC, mage.cards.j.JaceTelepathUnbound.class));
        cards.add(new SetCardInfo("Jace, Vryn's Prodigy", 216, Rarity.MYTHIC, mage.cards.j.JaceVrynsProdigy.class));
        cards.add(new SetCardInfo("Jeering Instigator", 107, Rarity.SPECIAL, mage.cards.j.JeeringInstigator.class));
        cards.add(new SetCardInfo("Jeskai Ascendancy", 108, Rarity.SPECIAL, mage.cards.j.JeskaiAscendancy.class));
        cards.add(new SetCardInfo("Jeskai Infiltrator", 138, Rarity.RARE, mage.cards.j.JeskaiInfiltrator.class));
        cards.add(new SetCardInfo("Kheru Lich Lord", 109, Rarity.SPECIAL, mage.cards.k.KheruLichLord.class));
        cards.add(new SetCardInfo("Kiora, Master of the Depths", 270, Rarity.MYTHIC, mage.cards.k.KioraMasterOfTheDepths.class));
        cards.add(new SetCardInfo("Kolaghan's Command", 181, Rarity.RARE, mage.cards.k.KolaghansCommand.class));
        cards.add(new SetCardInfo("Kolaghan, the Storm's Fury", 139, Rarity.RARE, mage.cards.k.KolaghanTheStormsFury.class));
        cards.add(new SetCardInfo("Korlash, Heir to Blackblade", 33, Rarity.SPECIAL, mage.cards.k.KorlashHeirToBlackblade.class));
        cards.add(new SetCardInfo("Kothophed, Soul Hoarder", 218, Rarity.RARE, mage.cards.k.KothophedSoulHoarder.class));
        cards.add(new SetCardInfo("Kytheon, Hero of Akros", 220, Rarity.MYTHIC, mage.cards.k.KytheonHeroOfAkros.class));
        cards.add(new SetCardInfo("Kytheon's Irregulars", 219, Rarity.RARE, mage.cards.k.KytheonsIrregulars.class));
        cards.add(new SetCardInfo("Languish", 221, Rarity.RARE, mage.cards.l.Languish.class));
        cards.add(new SetCardInfo("Lantern Scout", 271, Rarity.RARE, mage.cards.l.LanternScout.class));
        cards.add(new SetCardInfo("Laquatus's Champion", 16, Rarity.SPECIAL, mage.cards.l.LaquatussChampion.class));
        cards.add(new SetCardInfo("Liliana, Defiant Necromancer", 222, Rarity.MYTHIC, mage.cards.l.LilianaDefiantNecromancer.class));
        cards.add(new SetCardInfo("Liliana, Heretical Healer", 222, Rarity.MYTHIC, mage.cards.l.LilianaHereticalHealer.class));
        cards.add(new SetCardInfo("Living Lore", 182, Rarity.RARE, mage.cards.l.LivingLore.class));
        cards.add(new SetCardInfo("Lotus Bloom", 31, Rarity.SPECIAL, mage.cards.l.LotusBloom.class));
        cards.add(new SetCardInfo("Lu Bu, Master-at-Arms", 8, Rarity.SPECIAL, mage.cards.l.LuBuMasterAtArms.class));
        cards.add(new SetCardInfo("Lumbering Falls", 272, Rarity.RARE, mage.cards.l.LumberingFalls.class));
        cards.add(new SetCardInfo("Malfegor", 39, Rarity.SPECIAL, mage.cards.m.Malfegor.class));
        cards.add(new SetCardInfo("Managorger Hydra", 223, Rarity.RARE, mage.cards.m.ManagorgerHydra.class));
        cards.add(new SetCardInfo("March from the Tomb", 273, Rarity.RARE, mage.cards.m.MarchFromTheTomb.class));
        cards.add(new SetCardInfo("Mardu Ascendancy", 110, Rarity.SPECIAL, mage.cards.m.MarduAscendancy.class));
        cards.add(new SetCardInfo("Mardu Strike Leader", 140, Rarity.RARE, mage.cards.m.MarduStrikeLeader.class));
        cards.add(new SetCardInfo("Master of Pearls", 111, Rarity.SPECIAL, mage.cards.m.MasterOfPearls.class));
        cards.add(new SetCardInfo("Mastery of the Unseen", 141, Rarity.RARE, mage.cards.m.MasteryOfTheUnseen.class));
        cards.add(new SetCardInfo("Mayor of Avabruck", 51, Rarity.SPECIAL, mage.cards.m.MayorOfAvabruck.class));
        cards.add(new SetCardInfo("Maze's End", 65, Rarity.SPECIAL, mage.cards.m.MazesEnd.class));
        cards.add(new SetCardInfo("Megantic Sliver", 67, Rarity.SPECIAL, mage.cards.m.MeganticSliver.class));
        cards.add(new SetCardInfo("Mercurial Pretender", 84, Rarity.SPECIAL, mage.cards.m.MercurialPretender.class));
        cards.add(new SetCardInfo("Mizzium Meddler", 224, Rarity.RARE, mage.cards.m.MizziumMeddler.class));
        cards.add(new SetCardInfo("Moonsilver Spear", 53, Rarity.SPECIAL, mage.cards.m.MoonsilverSpear.class));
        cards.add(new SetCardInfo("Munda, Ambush Leader", 274, Rarity.RARE, mage.cards.m.MundaAmbushLeader.class));
        cards.add(new SetCardInfo("Myth Realized", 183, Rarity.RARE, mage.cards.m.MythRealized.class));
        cards.add(new SetCardInfo("Narset, Enlightened Master", 112, Rarity.SPECIAL, mage.cards.n.NarsetEnlightenedMaster.class));
        cards.add(new SetCardInfo("Necromaster Dragon", 184, Rarity.RARE, mage.cards.n.NecromasterDragon.class));
        cards.add(new SetCardInfo("Necropolis Fiend", 113, Rarity.SPECIAL, mage.cards.n.NecropolisFiend.class));
        cards.add(new SetCardInfo("Nessian Wilds Ravager", 77, Rarity.SPECIAL, mage.cards.n.NessianWildsRavager.class));
        cards.add(new SetCardInfo("Nissa's Renewal", 275, Rarity.RARE, mage.cards.n.NissasRenewal.class));
        cards.add(new SetCardInfo("Nissa's Revelation", 225, Rarity.RARE, mage.cards.n.NissasRevelation.class));
        cards.add(new SetCardInfo("Nissa, Sage Animist", 226, Rarity.MYTHIC, mage.cards.n.NissaSageAnimist.class));
        cards.add(new SetCardInfo("Nissa, Vastwood Seer", 226, Rarity.MYTHIC, mage.cards.n.NissaVastwoodSeer.class));
        cards.add(new SetCardInfo("Noyan Dar, Roil Shaper", 276, Rarity.RARE, mage.cards.n.NoyanDarRoilShaper.class));
        cards.add(new SetCardInfo("Oblivion Sower", 278, Rarity.MYTHIC, mage.cards.o.OblivionSower.class));
        cards.add(new SetCardInfo("Ob Nixilis Reignited", 277, Rarity.MYTHIC, mage.cards.o.ObNixilisReignited.class));
        cards.add(new SetCardInfo("Ojutai's Command", 185, Rarity.RARE, mage.cards.o.OjutaisCommand.class));
        cards.add(new SetCardInfo("Ojutai, Soul of Winter", 142, Rarity.RARE, mage.cards.o.OjutaiSoulOfWinter.class));
        cards.add(new SetCardInfo("Omnath, Locus of Rage", 279, Rarity.MYTHIC, mage.cards.o.OmnathLocusOfRage.class));
        cards.add(new SetCardInfo("Oran-Rief Hydra", 280, Rarity.RARE, mage.cards.o.OranRiefHydra.class));
        cards.add(new SetCardInfo("Oros, the Avenger", 32, Rarity.SPECIAL, mage.cards.o.OrosTheAvenger.class));
        cards.add(new SetCardInfo("Outland Colossus", 227, Rarity.RARE, mage.cards.o.OutlandColossus.class));
        cards.add(new SetCardInfo("Overbeing of Myth", 37, Rarity.SPECIAL, mage.cards.o.OverbeingOfMyth.class));
        cards.add(new SetCardInfo("Overtaker", 9, Rarity.SPECIAL, mage.cards.o.Overtaker.class));
        cards.add(new SetCardInfo("Painful Truths", 281, Rarity.RARE, mage.cards.p.PainfulTruths.class));
        cards.add(new SetCardInfo("Part the Waterveil", 282, Rarity.MYTHIC, mage.cards.p.PartTheWaterveil.class));
        cards.add(new SetCardInfo("Phytotitan", 87, Rarity.SPECIAL, mage.cards.p.Phytotitan.class));
        cards.add(new SetCardInfo("Pia and Kiran Nalaar", 228, Rarity.RARE, mage.cards.p.PiaAndKiranNalaar.class));
        cards.add(new SetCardInfo("Pitiless Horde", 186, Rarity.RARE, mage.cards.p.PitilessHorde.class));
        cards.add(new SetCardInfo("Plains", 66, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Planar Outburst", 283, Rarity.RARE, mage.cards.p.PlanarOutburst.class));
        cards.add(new SetCardInfo("Prairie Stream", 284, Rarity.RARE, mage.cards.p.PrairieStream.class));
        cards.add(new SetCardInfo("Priest of the Blood Rite", 229, Rarity.RARE, mage.cards.p.PriestOfTheBloodRite.class));
        cards.add(new SetCardInfo("Prism Array", 285, Rarity.RARE, mage.cards.p.PrismArray.class));
        cards.add(new SetCardInfo("Pristine Skywise", 187, Rarity.RARE, mage.cards.p.PristineSkywise.class));
        cards.add(new SetCardInfo("Profaner of the Dead", 188, Rarity.RARE, mage.cards.p.ProfanerOfTheDead.class));
        cards.add(new SetCardInfo("Quarantine Field", 286, Rarity.MYTHIC, mage.cards.q.QuarantineField.class));
        cards.add(new SetCardInfo("Questing Phelddagrif", 13, Rarity.SPECIAL, mage.cards.q.QuestingPhelddagrif.class));
        cards.add(new SetCardInfo("Radiant Flames", 287, Rarity.RARE, mage.cards.r.RadiantFlames.class));
        cards.add(new SetCardInfo("Raging Kavu", 12, Rarity.SPECIAL, mage.cards.r.RagingKavu.class));
        cards.add(new SetCardInfo("Rakshasa Vizier", 114, Rarity.SPECIAL, mage.cards.r.RakshasaVizier.class));
        cards.add(new SetCardInfo("Rally the Ancestors", 143, Rarity.RARE, mage.cards.r.RallyTheAncestors.class));
        cards.add(new SetCardInfo("Rampaging Baloths", 42, Rarity.SPECIAL, mage.cards.r.RampagingBaloths.class));
        cards.add(new SetCardInfo("Rathi Assassin", 10, Rarity.SPECIAL, mage.cards.r.RathiAssassin.class));
        cards.add(new SetCardInfo("Rattleclaw Mystic", 115, Rarity.SPECIAL, mage.cards.r.RattleclawMystic.class));
        cards.add(new SetCardInfo("Ravenous Demon", "52a", Rarity.SPECIAL, mage.cards.r.RavenousDemon.class));
        cards.add(new SetCardInfo("Relic Seeker", 230, Rarity.RARE, mage.cards.r.RelicSeeker.class));
        cards.add(new SetCardInfo("Resolute Archangel", 83, Rarity.SPECIAL, mage.cards.r.ResoluteArchangel.class));
        cards.add(new SetCardInfo("Revenant", 2, Rarity.SPECIAL, mage.cards.r.Revenant.class));
        cards.add(new SetCardInfo("Rubblehulk", 63, Rarity.SPECIAL, mage.cards.r.Rubblehulk.class));
        cards.add(new SetCardInfo("Ruinous Path", 288, Rarity.RARE, mage.cards.r.RuinousPath.class));
        cards.add(new SetCardInfo("Ryusei, the Falling Star", 24, Rarity.SPECIAL, mage.cards.r.RyuseiTheFallingStar.class));
        cards.add(new SetCardInfo("Sage of the Inward Eye", 116, Rarity.SPECIAL, mage.cards.s.SageOfTheInwardEye.class));
        cards.add(new SetCardInfo("Sanctum of Ugin", 289, Rarity.RARE, mage.cards.s.SanctumOfUgin.class));
        cards.add(new SetCardInfo("Sandsteppe Mastodon", 145, Rarity.RARE, mage.cards.s.SandsteppeMastodon.class));
        cards.add(new SetCardInfo("Scab-Clan Berserker", 231, Rarity.RARE, mage.cards.s.ScabClanBerserker.class));
        cards.add(new SetCardInfo("Scatter to the Winds", 290, Rarity.RARE, mage.cards.s.ScatterToTheWinds.class));
        cards.add(new SetCardInfo("Scourge of Fleets", 79, Rarity.SPECIAL, mage.cards.s.ScourgeOfFleets.class));
        cards.add(new SetCardInfo("Serpentine Spike", 291, Rarity.RARE, mage.cards.s.SerpentineSpike.class));
        cards.add(new SetCardInfo("Shamanic Revelation", 147, Rarity.RARE, mage.cards.s.ShamanicRevelation.class));
        cards.add(new SetCardInfo("Shaman of the Great Hunt", 146, Rarity.MYTHIC, mage.cards.s.ShamanOfTheGreatHunt.class));
        cards.add(new SetCardInfo("Shambling Vent", 292, Rarity.RARE, mage.cards.s.ShamblingVent.class));
        cards.add(new SetCardInfo("Sheoldred, Whispering One", 49, Rarity.SPECIAL, mage.cards.s.SheoldredWhisperingOne.class));
        cards.add(new SetCardInfo("Shield of Kaldra", 22, Rarity.SPECIAL, mage.cards.s.ShieldOfKaldra.class));
        cards.add(new SetCardInfo("Shipbreaker Kraken", 69, Rarity.SPECIAL, mage.cards.s.ShipbreakerKraken.class));
        cards.add(new SetCardInfo("Shrine of the Forsaken Gods", 293, Rarity.RARE, mage.cards.s.ShrineOfTheForsakenGods.class));
        cards.add(new SetCardInfo("Shu Yun, the Silent Tempest", 148, Rarity.RARE, mage.cards.s.ShuYunTheSilentTempest.class));
        cards.add(new SetCardInfo("Sidisi, Brood Tyrant", 117, Rarity.SPECIAL, mage.cards.s.SidisiBroodTyrant.class));
        cards.add(new SetCardInfo("Sidisi, Undead Vizier", 189, Rarity.RARE, mage.cards.s.SidisiUndeadVizier.class));
        cards.add(new SetCardInfo("Siege Dragon", 86, Rarity.SPECIAL, mage.cards.s.SiegeDragon.class));
        cards.add(new SetCardInfo("Siege Rhino", 118, Rarity.SPECIAL, mage.cards.s.SiegeRhino.class));
        cards.add(new SetCardInfo("Silent Sentinel", 73, Rarity.SPECIAL, mage.cards.s.SilentSentinel.class));
        cards.add(new SetCardInfo("Silent Specter", 18, Rarity.SPECIAL, mage.cards.s.SilentSpecter.class));
        cards.add(new SetCardInfo("Silumgar Assassin", 190, Rarity.RARE, mage.cards.s.SilumgarAssassin.class));
        cards.add(new SetCardInfo("Silumgar's Command", 191, Rarity.RARE, mage.cards.s.SilumgarsCommand.class));
        cards.add(new SetCardInfo("Silumgar, the Drifting Death", 149, Rarity.RARE, mage.cards.s.SilumgarTheDriftingDeath.class));
        cards.add(new SetCardInfo("Sire of Stagnation", 294, Rarity.MYTHIC, mage.cards.s.SireOfStagnation.class));
        cards.add(new SetCardInfo("Smoldering Marsh", 295, Rarity.RARE, mage.cards.s.SmolderingMarsh.class));
        cards.add(new SetCardInfo("Smothering Abomination", 296, Rarity.RARE, mage.cards.s.SmotheringAbomination.class));
        cards.add(new SetCardInfo("Soulblade Djinn", 232, Rarity.RARE, mage.cards.s.SoulbladeDjinn.class));
        cards.add(new SetCardInfo("Soul Collector", 20, Rarity.SPECIAL, mage.cards.s.SoulCollector.class));
        cards.add(new SetCardInfo("Soulfire Grand Master", 150, Rarity.MYTHIC, mage.cards.s.SoulfireGrandMaster.class));
        cards.add(new SetCardInfo("Soulflayer", 151, Rarity.RARE, mage.cards.s.Soulflayer.class));
        cards.add(new SetCardInfo("Spawn of Thraxes", 81, Rarity.SPECIAL, mage.cards.s.SpawnOfThraxes.class));
        cards.add(new SetCardInfo("Stratus Dancer", 192, Rarity.RARE, mage.cards.s.StratusDancer.class));
        cards.add(new SetCardInfo("Sultai Ascendancy", 119, Rarity.SPECIAL, mage.cards.s.SultaiAscendancy.class));
        cards.add(new SetCardInfo("Sunken Hollow", 297, Rarity.RARE, mage.cards.s.SunkenHollow.class));
        cards.add(new SetCardInfo("Sunscorch Regent", 193, Rarity.RARE, mage.cards.s.SunscorchRegent.class));
        cards.add(new SetCardInfo("Sun Titan", 45, Rarity.SPECIAL, mage.cards.s.SunTitan.class));
        cards.add(new SetCardInfo("Supplant Form", 152, Rarity.RARE, mage.cards.s.SupplantForm.class));
        cards.add(new SetCardInfo("Surrak Dragonclaw", 120, Rarity.SPECIAL, mage.cards.s.SurrakDragonclaw.class));
        cards.add(new SetCardInfo("Surrak, the Hunt Caller", 194, Rarity.RARE, mage.cards.s.SurrakTheHuntCaller.class));
        cards.add(new SetCardInfo("Sword of Kaldra", 21, Rarity.SPECIAL, mage.cards.s.SwordOfKaldra.class));
        cards.add(new SetCardInfo("Talent of the Telepath", 233, Rarity.RARE, mage.cards.t.TalentOfTheTelepath.class));
        cards.add(new SetCardInfo("Tasigur, the Golden Fang", 153, Rarity.RARE, mage.cards.t.TasigurTheGoldenFang.class));
        cards.add(new SetCardInfo("Temur Ascendancy", 121, Rarity.SPECIAL, mage.cards.t.TemurAscendancy.class));
        cards.add(new SetCardInfo("Thopter Spy Network", 234, Rarity.RARE, mage.cards.t.ThopterSpyNetwork.class));
        cards.add(new SetCardInfo("Thousand Winds", 122, Rarity.SPECIAL, mage.cards.t.ThousandWinds.class));
        cards.add(new SetCardInfo("Thunderbreak Regent", 195, Rarity.RARE, mage.cards.t.ThunderbreakRegent.class));
        cards.add(new SetCardInfo("Torrent Elemental", 154, Rarity.MYTHIC, mage.cards.t.TorrentElemental.class));
        cards.add(new SetCardInfo("Tragic Arrogance", 235, Rarity.RARE, mage.cards.t.TragicArrogance.class));
        cards.add(new SetCardInfo("Trail of Mystery", 123, Rarity.SPECIAL, mage.cards.t.TrailOfMystery.class));
        cards.add(new SetCardInfo("Trap Essence", 124, Rarity.SPECIAL, mage.cards.t.TrapEssence.class));
        cards.add(new SetCardInfo("Treasury Thrull", 64, Rarity.SPECIAL, mage.cards.t.TreasuryThrull.class));
        cards.add(new SetCardInfo("Ugin's Insight", 298, Rarity.RARE, mage.cards.u.UginsInsight.class));
        cards.add(new SetCardInfo("Ulamog, the Ceaseless Hunger", 299, Rarity.MYTHIC, mage.cards.u.UlamogTheCeaselessHunger.class));
        cards.add(new SetCardInfo("Undergrowth Champion", 300, Rarity.MYTHIC, mage.cards.u.UndergrowthChampion.class));
        cards.add(new SetCardInfo("Utter End", 125, Rarity.SPECIAL, mage.cards.u.UtterEnd.class));
        cards.add(new SetCardInfo("Vampire Nocturnus", 41, Rarity.SPECIAL, mage.cards.v.VampireNocturnus.class));
        cards.add(new SetCardInfo("Veteran Warleader", 301, Rarity.RARE, mage.cards.v.VeteranWarleader.class));
        cards.add(new SetCardInfo("Villainous Wealth", 126, Rarity.SPECIAL, mage.cards.v.VillainousWealth.class));
        cards.add(new SetCardInfo("Void Winnower", 302, Rarity.MYTHIC, mage.cards.v.VoidWinnower.class));
        cards.add(new SetCardInfo("Volcanic Vision", 196, Rarity.RARE, mage.cards.v.VolcanicVision.class));
        cards.add(new SetCardInfo("Vryn Wingmare", 236, Rarity.RARE, mage.cards.v.VrynWingmare.class));
        cards.add(new SetCardInfo("Warden of the First Tree", 155, Rarity.MYTHIC, mage.cards.w.WardenOfTheFirstTree.class));
        cards.add(new SetCardInfo("Wasteland Strangler", 303, Rarity.RARE, mage.cards.w.WastelandStrangler.class));
        cards.add(new SetCardInfo("Wildcall", 156, Rarity.RARE, mage.cards.w.Wildcall.class));
        cards.add(new SetCardInfo("Willbreaker", 237, Rarity.RARE, mage.cards.w.Willbreaker.class));
        cards.add(new SetCardInfo("Woodland Wanderer", 304, Rarity.RARE, mage.cards.w.WoodlandWanderer.class));
        cards.add(new SetCardInfo("Wren's Run Packmaster", 34, Rarity.SPECIAL, mage.cards.w.WrensRunPackmaster.class));
        cards.add(new SetCardInfo("Wurmcoil Engine", 46, Rarity.SPECIAL, mage.cards.w.WurmcoilEngine.class));
        cards.add(new SetCardInfo("Xathrid Gorgon", 54, Rarity.SPECIAL, mage.cards.x.XathridGorgon.class));
        cards.add(new SetCardInfo("Yasova Dragonclaw", 157, Rarity.RARE, mage.cards.y.YasovaDragonclaw.class));
        cards.add(new SetCardInfo("Zada, Hedron Grinder", 305, Rarity.RARE, mage.cards.z.ZadaHedronGrinder.class));
        cards.add(new SetCardInfo("Zurgo Bellstriker", 197, Rarity.RARE, mage.cards.z.ZurgoBellstriker.class));
        cards.add(new SetCardInfo("Zurgo Helmsmasher", 127, Rarity.SPECIAL, mage.cards.z.ZurgoHelmsmasher.class));
    }
}
